package day03;

import java.util.Scanner;

public class Ex04_ForDivisor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("약수를 구하려는 정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			
			if(num % i == 0) {			
			System.out.print(i + " ");
			}
		}
	}
}
