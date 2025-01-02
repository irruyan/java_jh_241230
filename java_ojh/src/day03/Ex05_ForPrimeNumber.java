package day03;
import java.util.Scanner;

public class Ex05_ForPrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				count++;				
			}
		}
		
		if(count == 2) {
			System.out.println(num + "는 소수");
		}
		else {
			System.out.println(num + "는 소수가 아님");
		}

	}
}
