package day04;

import java.util.Scanner;

public class Ex09_Menu1 {

	public static void main(String[] args) {
		/* do-while
		 * 메뉴
		 * 1. 프로그램 실행
		 * 2. 종료
		 * 메뉴 선택 : 1
		 * 문자 입력(종료 : q) : 1
		 * 문자 입력(종료 : q) : a
		 * 문자 입력(종료 : q) : q
		 * 메뉴
		 * 1. 프로그램 실행
		 * 2. 종료
		 * 메뉴 선택 : 2
		 * 프로그램을 종료 합니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		char menu;
		
		do {
			printMenu();
			menu = scan.next().charAt(0);
			runMenu(menu);
			
		}while(menu != '2');
		
	
	}
	
	/**
	 * 메뉴를 콘솔에 출력하는 메소드
	 */
	public static void printMenu() {
		System.out.println("-------------");
		System.out.println("    메뉴");
		System.out.println("1. 프로그램 실행");
		System.out.println("2. 프로그램 종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");
		
	}
	/**
	 * 
	 * @param menu
	 */
	public static void runMenu(char menu) {
		
		switch(menu) {
		case '1':
			program();
			break;
		
		case '2':
			System.out.println("프로그램을 종료합니다.");
			break;
			
		default:
			System.out.println("잘못된 메뉴입니다.");
		}
		
	}
	/**
	 * 프로그램 실행 메소드
	 */
	public static void program() {
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			System.out.print("문자를 입력하세요(종료 = q) : ");
			ch = scan.next().charAt(0);					
		}while(ch != 'q');
		
	}

}
