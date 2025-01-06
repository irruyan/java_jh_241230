package day05;

import java.util.Scanner;

public class Ex01_Day04_Homework {

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
		
		//메뉴 변수 선언
		char menu; // 초기값을 반드시 해야하는 경우는? => for, while 문에서 조건식으로 들어갈때(do while 문은 괜찮다)
		
		//스캐너 선언
		Scanner scan = new Scanner(System.in);
		
		int max = 100, min = 1;
		int maxCount = 0;
		
		//반복문 : 종료를 선택할때까지 반복
		do {
			//메뉴 출력
			System.out.println("-------------");
			System.out.println("----메   뉴----");
			System.out.println("1. UpDown 게임 실행");
			System.out.println("2. 최고 기록 확인");
			System.out.println("3. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
			
			//메뉴를 입력
			menu = scan.next().charAt(0);
			
			//입력받은 메뉴에 따라 기능을 실행
			//메뉴가 1이면 게임실행, 2이면 기록 확인, 3이면 프로그램 종료
			switch(menu) {
			case '1':
				//랜덤한 정수 생성
				int random = (int)(Math.random() * (max - min + 1) +min);
				// 반복 : 맞출때까지
				System.out.println(random);
				int input, count = 0;
				do {
					++count;
					//입력
					System.out.print("입력 : ");
					input = scan.nextInt();
					// 입력한 값에 따라 결과를 출력
					// 입력한 값이 랜덤보다 크면 Down, 작으면 Up, 같으면 정답
					if(input > random) {
						System.out.println("Down!");
					}
					else if(input < random) {
						System.out.println("Up!");
					}
					else {
							System.out.println("Correct!");
						}
					}while(random != input); //랜덤한 정수와 입력한 수가 같으면 종료, 같지 않으면 반복
				//최고 기록과 비교하여 최고 기록보다 성적이 좋으면(작으면) 저장
				if(maxCount == 0 || maxCount > count) {
					maxCount = count;
				}
				break;
			case '2':
				//기록이 있으면 횟수를 출력, 없으면 게임을 실행한 적이 없습니다.
				if(maxCount != 0) {
					System.out.println("최고 기록 : " + maxCount);
				}
				else {
					System.out.println("게임을 실행한 적이 없습니다.");
				}
				System.out.println("메뉴로 가려면 엔터를 입력하세요");
				scan.nextLine(); // 메뉴와 함께 입력한 엔터 처리용
				scan.nextLine(); // 메뉴로 돌아가기 위한 엔터 처리
				break;
			case '3':
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("올바른 메뉴가 아닙니다.");
				
			}
			
			
			//종료를 선택하기 전까지 반복
		}while(menu != '3');
		
	}

}
