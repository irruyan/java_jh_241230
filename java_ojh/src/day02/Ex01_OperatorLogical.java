package day02;

public class Ex01_OperatorLogical {

	public static void main(String[] args) {
		
		int score = 80;
		boolean isB = 80 <= score && score < 90;		
		
		System.out.println(score + "점은 B입니까? " + isB);
	
		int age1 = 15;
		boolean isAdult1 = age1 > 19;
		
		System.out.println(age1 + "살은 성인입니까? " + isAdult1);
		System.out.println(age1 + "살은 미성년자입니까? " + !isAdult1);
		
		int num = -1;
		boolean isPositive = num > 0 || num == 0;
		System.out.println(num + "는 0 이상인가? " + isPositive);
			
		
	}

}
