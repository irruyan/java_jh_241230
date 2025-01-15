package day10;

import java.util.HashSet;
import java.util.Random;

public class Ex05_Set2 {

	public static void main(String[] args) {
		// 1~9 랜덤한 수 생성, 중복되지 않는 3개의 수 출력
		
		int min = 1;
		int max = 20;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 3) {
			int r =	(int)(Math.random() * (max - min + 1) +min);
			set.add(r);
		}
		
		System.out.println(set);

	}

}
