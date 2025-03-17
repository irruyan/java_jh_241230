package day18;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01_Client {

	/*
	 * 은행 계좌 관리 프로그램
	 * - 접속
	 *  - 은행, 이름, 계좌번호, 비밀번호
	 * - 계좌 개설
	 *  - 은행, 이름, 계좌번호, 비밀번호, 비밀번호 확인 
	 * - 종료
	 *  
	 *  - 예금 조회
	 *  - 입금
	 *  - 출금
	 *  - 이전
	 *  
	 *  주의사항
	 *   - 한 계좌에 여러명이 동시에 접근하는 경우 먼저 접근한 사람이 사용하도록 처리
	 */
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String ip = "127.0.0.1";
		int port = 5001;
		Socket socket;
		ObjectOutputStream oos;
		ObjectInputStream ois;
		
		//접속 성공
		
		try {
			socket = new Socket(ip, port);
			System.out.println("연결 성공");
			
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
		}catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		int menu;
		do {
			printMenu();
			
			menu = scan.nextInt();
			
			runMenu(menu, oos, ois);
		}while(menu != 3);
		
		
		
	}

	private static void runMenu(int menu, ObjectOutputStream oos, ObjectInputStream ois) {
		switch(menu) {
		case 1:
			login(oos, ois);
			break;
		case 2:
			open();
			
			break;
		case 3: 
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("잘못된 메뉴 선택입니다.");
		}
		
	}

	private static void open() {
		// TODO Auto-generated method stub
		
	}

	private static void login(ObjectOutputStream oos, ObjectInputStream ois) {
		Bank bank = intputAccount();
		System.out.println("접속 중");
		System.out.println("같은 계정으로 다른 사용자가 먼저 사용중이면 대기할 수 있습니다.");
		//서버와 통신해서 account 가 일치하는지 확인 -> 서버에게 account와 일치하는 계좌 정보 요청
		try {
			oos.writeInt(1);
			oos.writeObject(bank);
			oos.flush();
			
			boolean res = ois.readBoolean();
			if(!res) {
				System.out.println("계좌가 일치하지 않습니다.");
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//일치하지 않으면 안내문구 후 종료
		
	}

	private static Bank intputAccount() {
		
		return null;
	}

	private static void printLogInMenu() {
		System.out.println("------------");
		System.out.println("1. 예금조회");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 이전");
		System.out.println("------------");
		
	}

	private static void printMenu() {
		System.out.println("------------");
		System.out.println("1. 접속");
		System.out.println("2. 계좌 개설");
		System.out.println("3. 종료");
		System.out.println("------------");
		
	}

	private static void inputBase() {
		System.out.println("1. 은행명 : ");
		String bankName = scan.nextLine();
		System.out.println("2. 이름 : ");
		String customerName = scan.nextLine();
		System.out.println("3. 계좌번호 : ");
		int account = scan.nextInt();
		System.out.println("4. 비밀번호 : ");
		int password = scan.nextInt();
		
	}

}
