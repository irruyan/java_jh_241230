package day02;

public class Ex03_OperatorConditional {

	public static void main(String[] args) {

		int num = 3;
		boolean isEven = num % 2 == 0;
		
		System.out.println(num + "는 짝수? " + isEven);
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + "는 " + result);
	}

}
