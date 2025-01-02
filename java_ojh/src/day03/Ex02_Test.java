package day03;

import java.util.Scanner;

public class Ex02_Test {

	public static void main(String[] args) {

		//월을 입력받고 월의 마지막 일을 출력하시오.
		// 31 : 1, 3, 5, 7, 8, 10, 12
		// 30 : 4, 6, 9 , 11
		// 28 : 2
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("마지막 일을 구하고자 하는 월을 입력해주세요 : ");
		int mon = scan.nextInt();
		
		switch(mon) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31일");
		break;
		
		case 4, 6, 9, 11:
			System.out.println("30일");
		break;
		
		case 2:
			System.out.println("28일");
		break;
		
		default:
			System.out.println("잘못된 월을 입력하셨습니다.");
		}
		
	}

}
