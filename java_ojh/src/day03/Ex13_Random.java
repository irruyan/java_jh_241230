package day03;

import java.util.Random;

public class Ex13_Random {

	public static void main(String[] args) {

		int min = 1, max = 77;
		
		int r = (int)(Math.random() * (max - min + 1) + min);
		System.out.println(r);
		
		Random random = new Random();
		
		r = random.nextInt(max - min + 1) + min;
		System.out.println(r);
	}

}
