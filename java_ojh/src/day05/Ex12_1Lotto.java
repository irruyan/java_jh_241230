package day05;

import java.util.Scanner;

public class Ex12_1Lotto {
	

	public static void main(String[] args) {
		
		int min = 1, max = 45;
		
		int [] lotto = Ex11_1ArrayRandom2.createRandomArray(min, max, 6);
		
		Ex11_1ArrayRandom2.printArray(lotto);
		
		int bonus;
		
		do {
			bonus = (int)(Math.random() * (max - min + 1) + min);
		}while(Ex11_1ArrayRandom2.contains(lotto, bonus));
		
		System.out.println("Bonus : " + bonus);
		
		int user [] = new int [6];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("로또 번호를 입력하세요 : ");
		
		for(int i = 0; i < user.length; i++) {
			user[i] = scan.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < lotto.length; i++) {
			if(Ex11_1ArrayRandom2.contains(user, lotto[i])) {
				count++;
			}
		}
		
		switch(count) {
		
		case 6:
			System.out.println("1등!");
			break;
		
		case 5:
			if(Ex11_1ArrayRandom2.contains(user, bonus)) {
				System.out.println("2등!");
			}
			else {
				System.out.println("3등!");
			}
			break;
		case 4:
			System.out.println("4등!");
			break;
		case 3:
			System.out.println("5등!");
			break;
		default:
			System.out.println("꽝");
		
		}
		
	}

}
