package day01;

public class Ex13_EvenNumber {

	public static void main(String[] args) {

		int num1 = 3;
		boolean isEven = (num1 % 2 == 0);
		System.out.println(num1 + "은 짝수인가? " + ((num1/2) == 0));
		System.out.println(num1 + "은 짝수인가? " + isEven);
		
		int num2 = 4;
		System.out.println(num2 + "는 짝수인가? " + ((num2/2) != 0));
		
	}

}
