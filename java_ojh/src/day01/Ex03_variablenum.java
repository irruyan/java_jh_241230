package day01;

public class Ex03_variablenum {

	public static void main(String[] args) {
		byte num1 = 1;
		//num1 = 12345;
		System.out.println(num1);
		int num2 = 123456789;
		//num2 = 123456789012;
		System.out.println(num2);
		long num3 = 123456789012L;
		System.out.println(num3);
		
		float num4 = 3.14F;
		System.out.printf("%.9f\n", num4);
		
		double num5 = 3.14;
		System.out.printf("%.23f\n", num5);
		
		int num6 = 0x10; // 16진수 10 => 16
		System.out.println(num6);
		
		int num7 = 010; // 8진수 10 => 8
		System.out.println(num7);
		
		int num8 = 0b10;  // 2진수 10 => 2
		System.out.println(num8);
		
		int num9 = 'A';  // A에 해당하는 정수값 저장
		System.out.println(num9);
		
		double num10 = 1e3;  // 1*10^3 => 1000
		System.out.println(num10);

	}

}
