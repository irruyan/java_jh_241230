package day01;

public class Ex12_OperatorComparison {

	public static void main(String[] args) {
		
		int num1 = 1, num2 = 2;
		
		System.out.println(num1 + " > " + num2 + " ? " + (num1 > num2));
		System.out.println(num1 + " >= " + num2 + " ? " + (num1 >= num2));
		System.out.println(num1 + " < " + num2 + " ? " + (num1 < num2));
		System.out.println(num1 + " <= " + num2 + " ? " + (num1 <= num2));
		System.out.println(num1 + " == " + num2 + " ? " + (num1 == num2));
		System.out.println(num1 + " != " + num2 + " ? " + (num1 != num2));
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");

		System.out.println(str1 + "==" + str2 + " ? " + (str1 == str2));
		
		System.out.println(str1 + "==" + str3 + " ? " + (str1 == str3));
		
		System.out.println("======== 절 취 선 ==========");

		System.out.println(str1 + " equals " + str2 + " ? " + (str1.equals(str2)));
		
		System.out.println(str1 + " equals " + str2 + " ? " + (str1.equals(str3)));
		
		
	}

}