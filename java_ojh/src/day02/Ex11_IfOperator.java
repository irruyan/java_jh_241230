package day02;

import java.util.Scanner;

public class Ex11_IfOperator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		
		System.out.print("산술연산자를 입력하세요 : ");
		char operator = scan.next().charAt(0);
		
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		
		
		if(operator == '+')
			System.out.println("" + num1 + " " + operator + " " + num2 + " = " + (num1 + num2));
		else if(operator == '-')
			System.out.println("" + num1 + " " + operator + " " + num2 + " = " + (num1 - num2));
		else if(operator == '*')
			System.out.println("" + num1 + " " + operator + " " + num2 + " = " + (num1 * num2));
		else if(operator == '/')
			System.out.println("" + num1 + " " + operator + " " + num2 + " = " + ((double)num1 / num2));
		else if(operator == '%')
			System.out.println("" + num1 + " " + operator + " " + num2 + " = " + (num1 % num2));
		else
			System.out.println("잘못된 연산자가 입력되었습니다.");
		
		
	}

}
