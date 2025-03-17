package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01_Client {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * 1. 플레이
		 *  - 플레이 종료 후 이니셜과 기록을 서버에 전송
		 * 2. 기록 조회
		 *  - 서버에게 상위 5개의 기록을 받아 출력
		 * 3. 종료
		 */
		
		//1. 플레이
		int menu = 0;
		
		ArrayList<Integer> comList = new ArrayList<Integer>();
		ArrayList<Integer> userList = new ArrayList<Integer>();
		
		do {
			int max = 9, min = 1;
			
			int strike = 0, ball =0;

			// 랜덤한 수 3개 생성(1~9)
			createRandomNum(1, 9, 3);
			System.out.println(comList); // 테스트용
			
			// 숫자 3개 입력
			System.out.println("입력 : ");
			for(int i = 0; i < 3; i++) {
				userList.add(scan.nextInt());
			}
			
			// 스트라이크 받아옴
			getStrike();
			
			// 볼 받아옴
			getBall();
			
			//결과 출력
			printResult(strike, ball);
			
		}while(menu != 3);
		
		// 2. 기록 조회
		
		

	}

	private static void getStrike() {
		
		
	}

	private static void getBall() {
		// TODO Auto-generated method stub
		
	}

	private static void printResult(int strike, int ball) {
		if(strike !=0) {
			System.out.println(strike + "S");
		}
		if(ball != 0) {
			System.out.println(ball + "B");
		}
		if(strike == 0 && ball ==0) {
			System.out.println("3O!");
		}
		
	}

	private static void createRandomNum(int max, int min, int size) {
		
		for (int i = 0; i < 3; i++) {
			int r = (int) (Math.random() * (max - min + 1) + min);
			
		}
		
		
	}

}
