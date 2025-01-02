package day03;

import java.util.Scanner;

public class Ex17_DoWhileInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		char ch;
		
		do {
			System.out.print("입력 : ");
			ch = scan.next().charAt(0);
			
		}while(ch != 'q');
			
		System.out.println("Done");
	}

}
