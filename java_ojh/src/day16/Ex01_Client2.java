package day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ex01_Client2 {
	static Scanner scan = new Scanner(System.in);
	static List<Post> list = new ArrayList<Post>();
	
	static ObjectOutputStream oos;
	static ObjectInputStream ois;

	public static void main(String[] args) {
		// day14 post 예제를 활용하여 게시글 관리 프로그램 작성
		// 네트워크 통신을 이용하여 서버와 클라이언트로 작업
		
		String ip = "127.0.0.1";
		int port = 5001;
		
		//프로그램 시작 전 서버와 연결 요청 후 연결이 실패하면 종료, 연결이 성공하면 프로그램 실행
		try {
			Socket socket = new Socket(ip, port);
			System.out.println("프로그램을 시작합니다.");
			
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			
		}catch(Exception e) {
			System.out.println("서버와의 연결에 실패했습니다.");
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		int menu = 0;
		do {
			printMenu();
			try {
				menu = inputInt(true);
				
				runMenu(menu);
				
		}catch(MenuException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요.");
		}
			
		}while(menu != 5);

	}
	
	private static int inputInt(boolean isMenu) {
		try {
			return inputInt();
		}catch(InputMismatchException e) {
			if(isMenu) {
				throw new MenuException();
			}
			throw new InputMismatchException();
		}
	}
	
	private static int inputInt() {
		String str = scan.nextLine(); 
		try {
			return Integer.parseInt(str);
		}catch(NumberFormatException e) {
			throw new InputMismatchException();
		}
		
	}

	

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			insert();
			break;
		case 2:
			update();
			break;
		case 3:
			delete();
			break;
		case 4:
			search();
			break;
		case 5:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("올바른 메뉴 선택이 아닙니다.");
		}
		
	}

	
	private static void insert() {
		
	}
	private static void update() {
	
	}

	private static void delete() {
	
	}

	private static void search() {
		
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

class MenuException extends RuntimeException{
	
	public MenuException(String message) {
		super(message);
	}
	public MenuException(){
		super("올바른 매뉴가 아닙니다.");
	}
}
