package day03;

import java.util.Scanner;

public class Ex16_WhileInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		char ch = 'a';
		
		while(ch != 'q') {
			System.out.print("input : ");
			ch = scan.next().charAt(0);
			
		}
		System.out.println("Done");
		
	}

}
