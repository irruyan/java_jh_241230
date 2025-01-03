package day04;

import java.util.Random;
import java.util.Scanner;

public class Ex10_Homework {

	public static void main(String[] args) {
		
		/*
		 * UpDown 게임 참고
		 * 메뉴
		 * 1. UpDown 게임 실행
		 * 2. 최고 기록 확인 - 몇 번만에 맞췄는지 최고기록 하나만
		 * 3. 프로그램 종료
		 * 메뉴 선택 : 2
		 * 게임을 실행한 적이 없습니다.
		 * 메뉴
		 * 1. UpDown 게임 실행
		 * 2. 최고 기록 확인
		 * 3. 프로그램 종료
		 * 메뉴선택 : 1
		 * 입력 : 50
		 * Down!
		 * 입력 : 25
		 * 정답!
		 * 메뉴
		 * 1. UpDown 게임 실행
		 * 2. 최고 기록 확인
		 * 3. 프로그램 종료
		 * 메뉴선택 : 2
		 * 2회
		 * 메뉴로 가려면 엔터를 입력하세요.
		 * 메뉴
		 * 1. UpDown 게임 실행
		 * 2. 최고 기록 확인
		 * 3. 프로그램 종료
		 * 메뉴선택 : 3
		 * 프로그램을 종료합니다.
		 */
		
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int min = 0, max =100;
		int r = random.nextInt(max - min + 1) + min;
		
		
		
		for( ; ; ) {
			
			System.out.print("숫자 입력 (1~100) : ");
			int num = scan.nextInt();
			
			if(num < r) {
				System.out.println("up");
				}
			else if(num > r){
				System.out.println("down");				
				}
			else {
				System.out.println("Correct!");
				break;
			}
			
		}
	}

}
