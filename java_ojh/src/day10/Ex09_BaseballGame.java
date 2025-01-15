package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Ex09_BaseballGame {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		int max = 9, min = 1;
		
		ArrayList<Integer> com = new ArrayList<Integer>();
		ArrayList<Integer> user = new ArrayList<Integer>();
		
		int strike = 0, ball = 0;
		
		createRandomList(1, 9, 3, com);
		
		System.out.println(com);
		
		// 반복문
		
		while(strike != 3) {
			
			user.clear();
			
			System.out.print("정수 입력(1~9, 중복X) : ");
			for(int i = 0; i < 3; i++) {
				user.add(scan.nextInt());
			}
			
			strike = getStrike(com, user);
			
			ball = getball(com, user);
			
			printResult(strike, ball);
			
		}
		
	}

	private static void printResult(int strike, int ball) {
		
		if(strike !=0) {
			System.out.println(strike + "S");
			}
		if(ball !=0) {
			System.out.println(ball + "B");
			}
		if(strike ==0 && ball == 0) {
			System.out.println("3O");
			}
		System.out.println();
		
	}

	private static int getball(ArrayList<Integer> com, ArrayList<Integer> user) {
		// 볼 판별 : 일치하는 숫자의 개수(위치 상관X) - 스트라이크 개수
		int count = 0;
		for (int tmp : com) {
			if(user.contains(tmp)) {
				count++;
			}
		}
		return count - getStrike(com, user);
	}

	private static int getStrike(ArrayList<Integer> com, ArrayList<Integer> user) {
		//스트라이크 판별 : get(번지)
		
		int strike = 0;
		for(int i = 0; i < com.size(); i++) {
			if(com.get(i) == user.get(i)) {
				strike++;
			}
		}
		return strike;
	}

	private static void createRandomList(int min, int max, int size, 
			ArrayList<Integer> com) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size() < size) {
			int r =	(int)(Math.random() * (max - min + 1) + min);
			set.add(r);
		}
		
		com.addAll(set);
		Collections.shuffle(com);
		
	}
	
}
