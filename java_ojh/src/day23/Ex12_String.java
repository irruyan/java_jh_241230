package day23;

import java.util.Scanner;

public class Ex12_String {

	public static void main(String[] args) {
		// 문자열을 입력받아 출력하고, 문자열이 EXIT인 경우 종료하는 프로그램
		
		String str;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("입력 : ");
			str = scan.next();
			System.out.println("출력 : " + str);
			
		}while(!str.equals("EXIT"));

	}

}
