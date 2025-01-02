package day03;

import java.util.Scanner;

public class Ex10_ForInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		for( ; ; ) {
			System.out.print("문자를 입력하세요 : ");
			char i = scan.next().charAt(0);
			if(i == 'q')
				break;
					
		}
		System.out.println("프로그램 종료");
			
	}

}
