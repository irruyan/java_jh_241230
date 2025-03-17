package day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class Ex01_Server {
	
	private static List<Post> list = new ArrayList<Post>();
	
	public static void main(String[] args) {
		
		int port = 5001;
		String fileName = "src/day16/data.txt";
		String fileName2 = "src/day16/count.txt";
		
		try {
			list = (List<Post>) load(fileName);
			Integer count = (Integer) load(fileName2);
			count = count == null ? 0 : count;
			Post.setCount(count);
			
			if(list == null) {
				list = new ArrayList<Post>();
			}
			
			ServerSocket serverSocket = new ServerSocket(port);
			while(true) {
			try {
				Socket socket = serverSocket.accept();
				System.out.println("연결 성공");
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			
				while(true) {
					//메뉴를 입력받음
					int menu = ois.readInt();
					//입력받은 메뉴에 맞는 기능을 실행
					runMenu(menu, oos, ois);
				}
				
				}catch(Exception e) {
					System.out.println("연결 종료");
					save(fileName, list);
				}
			}
			
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				save(fileName, list);
				save(fileName2, Post.getCount());
			}
	
			
		
	}

	
	
	private static void runMenu(int menu, ObjectOutputStream oos, ObjectInputStream ois) {
		
		switch(menu) {
		case 1:
			insert(oos, ois);
			break;
		case 2:
			update(oos, ois);
			break;
		case 3:
			delete(oos, ois);
			break;
		case 4:
			search(oos, ois);
			break;
		case 5:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("올바른 메뉴 선택이 아닙니다.");
		}
	}



	private static void insert(ObjectOutputStream oos, ObjectInputStream ois) {
		try {
			//게시글 정보를 받음
			Post post = new Post((Post)ois.readObject());
			
			//게시글을 등록
			//결과를 보냄
			oos.writeBoolean(list.add(post));
			oos.flush();
			
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
		System.out.println(list);
		
	}


	private static void update(ObjectOutputStream oos, ObjectInputStream ois) {
		try {
			// 수정할 객체를 클라이언트에서 받음
			Post post = (Post) ois.readObject();
			
			// 객체가 없으면 false를
			int index = list.indexOf(post);
			boolean res = true;
			
			if(index < 0) {
				res = false;
			}
			// 있으면 객체를 수정하고 true를 전송
			//기존 학생 정보를 가져와서 수정
			else {
				Post tmp = (Post)list.get(index).clone();
				
				tmp.setTitle(post.getTitle());
				tmp.setContent(post.getContent());
				list.set(index, tmp);
			}
			oos.writeBoolean(res);
			oos.flush();
			System.out.println(list);
			
			}catch(Exception e) {
				System.out.println("업데이트 예외발생(서버)");
		}
	}


	private static void delete(ObjectOutputStream oos, ObjectInputStream ois) {
		try{
			//클라이언트가 보내준 게시글 번호를 받아옴
			int num = ois.readInt();

			//받아온 번호로 객체를 생성
			//삭제를 하고 결과를 클라이언트에게 전송
			/*
			 * Post post = new Post(num);
			 * boolean res = list.remove(post);
			 * oos.writeBoolean(res);
			 */
			oos.writeBoolean(list.remove(new Post(num)));
			oos.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}


	private static void search(ObjectOutputStream oos, ObjectInputStream ois) {
		
		try {
			//전체 게시글을 클라이언트에게 전송
			List<Post> tmpList = new ArrayList<Post>();
			tmpList.addAll(list); // 복사본을 만들어서 보냄
			
			oos.writeObject(list);
			oos.flush();
			
			//게시글 번호를 입력 받음
			int num = ois.readInt();
			
			//게시글을 클라이언트에게 전송
			int index = list.indexOf(new Post(num));
			Post post = null;
			if(index >= 0) {
				post = list.get(index);
				post.view();
				list.set(index, post);
			}
			oos.writeObject(post);
			oos.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void save(String fileName, Object obj) {
		try(FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(obj);
			
		} catch (Exception e) {
			System.out.println("----------");
			System.out.println("불러오기 실패");
			System.out.println("----------");
		}
		
	}

	private static Object load(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			return ois.readObject();
			
		} catch (Exception e) {
			System.out.println("----------");
			System.out.println("불러오기 실패");
			System.out.println("----------");
		}
		return null;
	}





}
