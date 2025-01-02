package day03;

import java.util.Random;
import java.util.Scanner;

public class Ex14_UpDown {

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int min = 0, max =100;
		int r = random.nextInt(max - min + 1) + min;
		
		
		
		for( ; ; ) {
			
			System.out.print("숫자 입력 (1~100) : ");
			int num = scan.nextInt();
			
			if(num < r) {
				System.out.println("up");
				}
			else if(num > r){
				System.out.println("down");				
				}
			else {
				System.out.println("Correct!");
				break;
			}
			
		}
		
		
	}

}
