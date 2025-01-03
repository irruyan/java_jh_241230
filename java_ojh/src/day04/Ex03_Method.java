package day04;

import java.util.Scanner;

public class Ex03_Method {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("최대공약수를 구할 2개의 정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int lcm = lcm2(num1, num2);
		int lcm2 = lcm3(num1, num2);
		
		System.out.println();
		System.out.println(num1 + " 과 " + num2 + " 의 최대공약수는 ");
		System.out.println(lcm);
		System.out.println(lcm2);
		
		int min = 1, max = 10;
		int r = random2(min, max);
		System.out.println("랜덤 " + r);

	}

	/* ForGCD
	 * 기능 : 두 정수의 최대 공약수를 알려주는 메소드
	 * 매개변수 : 두 정수, 최대공약수 => int num1, num2, div
	 * 리턴타입 : 정수 => int
	 * 메소드명 : gcd, gcd2
	 * 
	 * 
	 * 기능 : 두 정수의 최대 공약수를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 두 정수의 최대공약수 정수 => int
	 * 메소드명 : gcd, gcd2
	 */
	
	/**
	 * * 기능 : 두 정수의 최대 공약수를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 두 정수의 최대공약수 정수 => int
	 * 메소드명 : gcd, gcd2
	 * @param num1
	 * @param num2
	 * @param div
	 * @return
	 */
	//public static int gcd(int num1, int num2, int div) {
		//int gcd = for(int k=1;k<=num1;k++) {
		//	(num1 % k == 0) && (num2 % k == 0);
		
		//return gcd;
	//}
	
	public static int gcd2(int num1, int num2) {
		
		int gcd2 = 1;
		
		for(int i=1 ; i<=num1 ; i++) {
			if(num1 % i == 0) {
				if(num2 % i ==0) {
					gcd2 = i;
				}
			}
		}
		
		return gcd2;
	}
		
	/* 기능 : 두 정수의 최소 공배수를 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 두 정수의 최소 공배수 => 정수 => int
	 * 메소드명 : lcm / lcm2
	 */
	public static int lcm2(int num1, int num2) {
		int count = 1;
		
		for(int i=num1 ;  ; i+=num1) {
			if(i % num2 == 0 ) {
				return i;

			}
		}
	}
	public static int lcm3(int num1, int num2) {
		//최대 공약수를 알 때 최소 공배수를 계산
		/* A : Ga, B : Gb
		 * L : Gab => A*B/G
		 */
		return num1 * num2 / gcd2(num1, num2);
		
	}
	
	/* 기능 : 최소값과 최대값 사이의 랜덤한 수 생성
	 * 매개변수 : 최소값, 최대값 => int min, int max
	 * 리턴타입 : 랜덤한 수 => int
	 * 메소드명 : random2
	 */
	public static int random2(int min, int max) {
		
		return (int)(Math.random()*(max - min + 1) + min);
	}
}