package day05;

import java.util.Scanner;

public class Ex01_Day04_Homework2 {
	
	static Scanner scan = new Scanner(System.in);
	
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
		
		char menu;
		int minCount = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			// 메뉴출력
			printMenu();
			
			// 메뉴입력
			menu = scan.next().charAt(0);
			
			//메뉴에 맞는 기능을 실행
			minCount = runMenu(menu, minCount);
			
			
		}while(menu != '3');
		
	}

	private static void printMenu() {
		System.out.println("-------------");
		System.out.println("----메   뉴----");
		System.out.println("1. UpDown 게임 실행");
		System.out.println("2. 최고 기록 확인");
		System.out.println("3. 프로그램 종료");
		System.out.println("메뉴 선택 : ");
		
	}
	
	private static int runMenu(char menu, int minCount) {
		
		//메뉴에 맞는 기능을 실행
		switch(menu) {
		case '1':
			//게임을 진행 후 기록을 가져옴
			int count = playGame();
			//최고 기록과 방금 플레이한 기록을 이용해서 최고 기록을 업데이트
			minCount = recordGame(minCount, count);
			break;
		case '2':
			printRecord(minCount);
			break;
		case '3':
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("올바른 메뉴가 아닙니다.");
		}
		
		return minCount;
	}

	private static int playGame() {
		int min = 1, max = 100;
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
		
		
		return count;
	}

	private static int recordGame(int minCount, int count) {
		
		//첫 게임 후
		if(minCount == 0) {
			return count;
		}
		/*
		//현재 기록이 최고 기록보다 좋으면
		if(minCount > count) {
			return count;
		}
		//최고 기록이 좋으면
		return minCount;
		*/
		//위 조건식(3줄)을 한줄로 ↓
		return minCount > count ? count : minCount;
	}

	private static void printRecord(int minCount) {
		//기록이 있으면 횟수를 출력, 없으면 게임을 실행한 적이 없습니다.
		if(minCount != 0) {
			System.out.println("최고 기록 : " + minCount);
		}
		else {
			System.out.println("게임을 실행한 적이 없습니다.");
		}
		System.out.println("메뉴로 가려면 엔터를 입력하세요");
		scan.nextLine(); // 메뉴와 함께 입력한 엔터 처리용
		scan.nextLine(); // 메뉴로 돌아가기 위한 엔터 처리
		
	}

	
	

}
