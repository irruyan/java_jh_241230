package day03;

import java.util.Scanner;

public class Ex06_ForGCD {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("최대공약수를 구할 2개의 정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int div = 0;
		
		for(int i=1 ; i<=num1 ; i++) {
			if(num1 % i == 0) {
				System.out.print(num1 + "의 약수는" + i + " ");
			}
		}
		
		System.out.println();
		
		for(int j=1 ; j<=num2 ; j++) {
			if(num2 % j ==0) {
				System.out.print(num2 + "의 약수는" + j + " ");
				}
		}		
		
		for(int k=1 ; k<=num1 ; k++) {
			if(num1 % k == 0 && num2 % k ==0) {
				div = k;
			}
		}
		
		System.out.println();
		System.out.println(num1 + " 과 " + num2 + " 의 최대공약수는 " + div);
		
	}

}
