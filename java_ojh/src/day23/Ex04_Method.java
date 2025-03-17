package day23;

public class Ex04_Method {

	public static void main(String[] args) {
		
		int num1= 1, num2 = 2;
		sum(num1, num2);
		
		int num3 = 3, num4 = 4, num5 = 5;
		sum(num3, num4, num5);

	}

	
	
	private static void sum(int num3, int num4, int num5) {
		System.out.println(num3 + num4 + num5);
		
	}

	private static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
		
	}
	
	
	

}
