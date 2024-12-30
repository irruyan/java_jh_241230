package day01;

public class Ex08_VariableCasting {

	public static void main(String[] args) {
		double num1 = 1;
		
		int num2 = 'A';
		
		long num3 = 1234;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
		int num4 = (int)3.14;
		
		int num5 = (int)123L;
		
		double result = (double)1 / 2;
		
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(result);
		
	}

}
