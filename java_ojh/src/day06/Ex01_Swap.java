package day06;

public class Ex01_Swap {

	public static void main(String[] args) {
		/*
		 * 두 정수의 값을 바꾸는 코드
		 */
		
		int num1 = 10, num2 = 20;
		
		System.out.println(num1 + " " + num2);
		
		int tmp = num1; // tmp, num1, num2 = 10 10 20
		num1 = num2; // 10 20 20
		num2 = tmp; // 10 20 10
		
		System.out.println(num1 + " " + num2);
		
	}

}
