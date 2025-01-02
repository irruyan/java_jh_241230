package day03;

import java.util.Scanner;

public class Ex11_ForLCM {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 2개 입력 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int count = 1;
		
		for(int i=1 ;  ; i++, count++) {
						
			if(i % num1 == 0 && i % num2 == 0 ) {
				System.out.println(i + " " + count);
				break;
			}
		}
		
		
		count = 1;
		
		for(int i=num1 ; ; i+=num1, count++) {
			if(i % num2 == 0) {
				System.out.println(i + " " + count);
				break;
			}
		}
	}
}
