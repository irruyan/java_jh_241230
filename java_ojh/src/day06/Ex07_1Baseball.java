package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07_1Baseball {

	public static void main(String[] args) {
		int [] com = createRandomArray(1, 9, 3);
		System.out.println(Arrays.toString(com));
		
		int strike, ball;
		int [] user = new int[3];
		
		
		//반복문
		do {
			strike = 0;
			ball = 0;
			user = new int[3];
			if(!inputNum(user)) {
				continue;
			}
			//정수 입력
			inputNum(user);
			
			//스트라이크 판별
			strike = getStrike(com, user);
			
			// 볼 판별
			ball = getBall(com,user);
						
			printResult(strike, ball);
			
			
		}while(strike < 3);
		System.out.println("프로그램을 종료합니다.");
	}

	//------------- 매소드 -----------------
	
	public static boolean inputNum(int[] user) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개 입력(1~9, 중복X) : ");
		boolean outOfBounds = false;
		boolean duplicated = false;
		for(int i = 0; i < user.length; i++) {
			int tmp = scan.nextInt();
			if(tmp < 1 || tmp >9) {
				outOfBounds = true;
			}
			if(contains(user, tmp)) {
				duplicated = true;
			}
			user[i] = tmp;
		}
		if(outOfBounds || duplicated) {
			System.out.println("범위를 벗어나거나 중복된 수가 있습니다.");
		}
		return !outOfBounds && !duplicated;
	}
	
	
	public static void printResult(int strike, int ball) {
		if(strike != 0) {
			System.out.print(strike + "S ");
		}
		
		if(ball != 0) {
			System.out.print(ball + "B ");
		}
		
		if(strike == 0 && ball == 0) {
			System.out.print("3 Out!!");
		}
		System.out.println();
		System.out.println();
		
	}

	public static int getBall(int[] com, int[] user) {
		// 볼 판별 : 같은 개수 - 스트라이크 개수 = 볼의 개수
		int count = 0;
		for(int tmp : com) {
			if(contains(user, tmp)) {
				count++;
			}
		}
		return count - getStrike(com, user);
	}

	private static boolean contains(int[] user, int num) {
		for(int tmp : user) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}

	public static int getStrike(int[] com, int[] user) {
		//스트라이크 구해주는 메소드
		int strike = 0;
		for(int i = 0; i < com.length; i++) {
		if(com[i] == user[i]) {
			strike++;
			}
		}
		return strike;
	}

	public static int[] createRandomArray(int min, int max, int size) {
		if(max < min) {
			int tmp = max;
			max = min;
			min = tmp;
		}
		
		//반복 : 3개의 수를 생성
		if(max - min + 1 < size) {
			return null;
		}
		if(size <=0) {
			return null;
		}
		int count = 0;
		int [] arr = new int[size];
		
		do {
			int r = (int)(Math.random() * (max - min +1) +min);
			
			if(!contains(arr,r)) {
				arr[count++] = r;
			}
			
		}while(count<3);
		
		return arr;
	}

}
