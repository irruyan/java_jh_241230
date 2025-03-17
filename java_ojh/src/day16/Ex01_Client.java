package day16;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_Client {
	static Scanner scan = new Scanner(System.in);
	static List<Post> list = new ArrayList<Post>();

	public static void main(String[] args) {
		// day14 post 예제를 활용하여 게시글 관리 프로그램 작성
		// 네트워크 통신을 이용하여 서버와 클라이언트로 작업
		
		String ip = "127.0.0.1";
		int port = 5001;
		Socket socket = null;
		ObjectOutputStream oos; 
		ObjectInputStream ois;
		
		//프로그램 시작 전 서버와 연결 요청 후 연결이 실패하면 종료, 연결이 성공하면 프로그램 실행
		try {
			socket = new Socket(ip, port);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			System.out.println("프로그램을 시작합니다.");
		
			
		}catch(Exception e) {
			System.out.println("서버와의 연결에 실패했습니다.");
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		int menu = 0;
		do {
			printMenu();
			
			menu = scan.nextInt();
			scan.nextLine();
			
			try {
				oos.writeInt(menu);
				oos.flush();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
				
			runMenu(menu, ois, oos);
				
		}while(menu != 5);

	}
	

	private static void runMenu(int menu, ObjectInputStream ois, ObjectOutputStream oos) {
		switch(menu) {
		case 1:
			insert(ois, oos);
			break;
		case 2:
			update(ois, oos);
			break;
		case 3:
			delete(ois, oos);
			break;
		case 4:
			search(ois, oos);
			break;
		case 5:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("올바른 메뉴 선택이 아닙니다.");
		}
		
	}

	
	private static void insert(ObjectInputStream ois, ObjectOutputStream oos) {
		try {
			//게시글 정보를 입력
			Post post = input();
	
			//게시글 정보를 서버에 전송
			oos.writeObject(post);
			oos.flush();
			
			//서버에서 등록 결과를 받음
			boolean res = ois.readBoolean();
			
			//알림을 출력
			if(res) {
				System.out.println("게시글을 등록했습니다.");
			}else {
				System.out.println("게시글을 등록하지 못했습니다.");
			}
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
		
	}
	private static Post inputBase() {
		// 제목 , 내용, 작성자를 입력
		System.out.println("제목 : ");
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String content = scan.nextLine();
				
		// 입력받은 내용으로 객체 생성
		return new Post(title, content, "");
		
	}
	
	private static Post input() {
		// 제목 , 내용, 작성자를 입력
		Post post = inputBase();
		
		System.out.println("작성자 : ");
		String writer = scan.next();
		
		post.setWriter(writer);
		// 입력받은 내용으로 객체 생성
		return post;
		
	}
	
	


	private static void update(ObjectInputStream ois, ObjectOutputStream oos) {
		try {
		
			//게시글 번호를 입력
			System.out.println("번호 : ");
			int num = scan.nextInt();
			scan.nextLine();
			
			//수정할 제목, 내용을 입력하여 객체 생성
			Post post = inputBase();
			
			//객체에 게시글 번호를 입력받은 번호로 수정
			post.setNum(num);
			
			//서버에 메뉴 번호, 수정할 내용을 전송
			oos.writeObject(post);
			oos.flush();
			
			//서버에서 결과를 받아서 알림 출력
			boolean res = ois.readBoolean();
			if(res) {
				System.out.println("게시글을 수정했습니다.");
			}else {
				System.out.println("게시글을 수정하지 못했습니다.");
			}
			
		}catch(Exception e){
			System.out.println("업데이트 예외 발생");
		}
	
	}

	private static void delete(ObjectInputStream ois, ObjectOutputStream oos) {
		
		try {
			//삭제할 게시글 번호를 입력
			System.out.println("번호 : ");
			int num = scan.nextInt();
			scan.nextLine();
			
			//서버에 번호를 전송
			oos.writeInt(num);
			oos.flush();
			
			//서버에서 보낸 결과를 이용하여 알림
			boolean res = ois.readBoolean();
			
			if(res) {
				System.out.println("게시글을 삭제했습니다.");
			}else {
				System.out.println("게시글을 삭제하지 못했습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static void search(ObjectInputStream ois, ObjectOutputStream oos) {
		try {
			//서버에게 전체 게시글을 요청 후 출력
			List<Post> list = (List<Post>)ois.readObject();
			if(!printList(list)) {
				//return;
			}
			//조회할 게시글 번호를 입력
			System.out.println("번호 : ");
			int num = scan.nextInt();
			scan.nextLine();
			//서버에게 게시글 번호를 전송
			oos.writeInt(num);
			oos.flush();
			//서버에게 게시글을 받아서 출력
			Post post = (Post)ois.readObject();
			if(post == null) {
				System.out.println("등록되지 않거나 삭제된 게시글입니다.");
			}else {
				post.print();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


	private static boolean printList(List<Post> list) {
		if(list == null || list.size() == 0){
			System.out.println("등록된 게시글이 없습니다.");
			return false;
		}
		for(Post post : list) {
			System.out.println(post);
		}
		return true;
	}


	private static void printMenu() {
		System.out.println("-------------------");
		System.out.println("1. 게시글 등록");
		System.out.println("2. 게시글 수정");
		System.out.println("3. 게시글 삭제");
		System.out.println("4. 게시글 조회");
		System.out.println("5. 종료");
		System.out.println("-------------------");
		System.out.println("메뉴 선택 : ");
		
	}
	


}


