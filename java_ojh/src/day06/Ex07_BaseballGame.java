package day06;

import java.util.Scanner;

import day05.Ex11_1ArrayRandom2;

public class Ex07_BaseballGame {

	public static void main(String[] args) {
		/*
		 * 숫자 야구 게임 구현(1~9)
		 * S : 숫자가 같고 위치가 같음
		 * B : 숫자는 있지만 위치가 다름
		 * O : 일치하는 숫자가 하나도 없음
		 */
		
		//중복되지 않는 랜덤한 수 3자리 생성
		int min = 1, max = 9;
		int correctNum [] = Ex11_1ArrayRandom2.createRandomArray(min, max, 3);
		Ex11_1ArrayRandom2.printArray(correctNum);
		
		
		Scanner scan = new Scanner(System.in);
		
		//반복문
			//3자리 입력
			System.out.println("3개의 번호를 입력하세요 : ");
			int num = scan.nextInt();
			int count = 0;
			int count2 = 0;
			// 중복 숫자 검사
			
			switch(count-count2) {
			case 6 :
				System.out.println("1B");
				break;
			case 5 :
				System.out.println("2B");
				break;
			case 4 :
				System.out.println("3B");
				break;
			case 3 :
				System.out.println("3B");
				break;
			case 2 :
				System.out.println("3B");
				break;
			case 1 :
				System.out.println("3B");
				break;
			default :
				System.out.println("3O, Game Over");
			}
			
			// 자릿수 검사
				// 1개 : 1S, 2개 : 2S, 3개 : 3S(프로그램 종료)
		
	}

}
