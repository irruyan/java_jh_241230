package day21;

import java.util.Scanner;

public class Ex02_Main {
	
	private static Scanner scan = new Scanner(System.in);
	

	// 단어장 프로그램
	public static void main(String[] args) {
		
		System.out.println("<단어장 프로그램>");
		System.out.print("ID를 입력하세요. : ");
		
		String id = scan.next();

		int menu;
		
		boolean isAdmin = id.equals("admin");
		
		do {
			if(isAdmin) {
				printAdminMenu();
				menu = scan.nextInt();
				runAdminMenu(menu);
				return;
			}else {
				printUserMenu();
				menu = scan.nextInt();
				runUserMenu(menu);
				return;
			}
		
		}while(menu != 3);
		
	}


	private static void printMenu(boolean isAdmin) {
		// TODO Auto-generated method stub
		
	}


	private static void runUserMenu(int menu) {
		switch(menu){
		case 1:
			break;
		case 2:
			break;
		case 3:
			System.out.println("프로그램 종료합니다.");
			break;
		}
		
	}


	private static void runAdminMenu(int menu) {
		switch(menu){
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			System.out.println("프로그램 종료합니다.");
			break;
		}
		
		
	}


	private static void printUserMenu() {
		System.out.println("-----------");
		System.out.println("1. 단어 검색");
		System.out.println("2. 내 검색 단어 보기");
		System.out.println("3. 프로그램 종료");
		System.out.println("-----------");
		
	}


	private static void printAdminMenu() {
		System.out.println("-----------");
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.println("-----------");
		
		
	}

}
