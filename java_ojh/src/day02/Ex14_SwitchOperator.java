package day02;

import java.util.Scanner;

public class Ex14_SwitchOperator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		char operator;
		
		System.out.print("첫번째 정수 입력(0~10) : ");
		num1 = scan.nextInt();
		System.out.print("산술 연산자 입력(+,-,*,/,%) : ");
		operator = scan.next().charAt(0);
		System.out.print("두번째 정수 입력(0~10) : ");
		num2 = scan.nextInt();
		
		switch(operator) {
		case '+':
			System.out.println("" + num1 + " " + operator + " " + num2 + " " + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println("" + num1 + " " + operator + " " + num2 + " " + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println("" + num1 + " " + operator + " " + num2 + " " + " = " + (num1 * num2));
			break;
		case '/':
			System.out.println("" + num1 + " " + operator + " " + num2 + " " + " = " + ((double)num1 / num2));
			break;
		case '%':
			System.out.println("" + num1 + " " + operator + " " + num2 + " " + " = " + (num1 % num2));
			break;
		default:
			System.out.println("잘못된 정수 혹은 연산자가 입력되었습니다.");
		}
		
	}

}
