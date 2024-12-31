package day02;

import java.util.Scanner;

public class Ex10_Scanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println("입력받은 정수 : " + num);
		
		System.out.print("실수를 입력하세요 : ");
		double num2 = scan.nextDouble();
		System.out.println("입력받은 실수 : " + num2);
		
		System.out.print("단어를 입력하세요 : ");
		String str = scan.next();
		System.out.println("입력받은 단어 : " + str);
		
		System.out.print("문자를 입력하세요 : ");
		char ch = scan.next().charAt(0);
		System.out.println("입력받은 문자 : " + ch);
		
		scan.nextLine();
		System.out.println("문장을 입력하세요 : ");
		String str2 = scan.nextLine();
		System.out.println("입력받은 문장 : " + str2);
	
	}

}
