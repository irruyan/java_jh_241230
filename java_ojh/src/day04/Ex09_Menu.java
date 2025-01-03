package day04;

import java.util.Scanner;

public class Ex09_Menu {

	public static void main(String[] args) {
		/*
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
		
		A:for( ; ; ) {
			System.out.println("메뉴");
			System.out.println("1. 프로그램 실행 / 2. 종료");
			char i = scan.next().charAt(0);
			if(i == '2') {
				System.out.println("프로그램 종료");
				break;
			}
			
			if(i == '1') {
				for( ; ; ) {
					System.out.println("메뉴 선택");
					System.out.print("문자를 입력하세요(종료 : q) : ");
					char j = scan.next().charAt(0);				
					if(j == 'q')
					break;
				}
			}
					
			System.out.println("메뉴");
		}
		
	}

}
