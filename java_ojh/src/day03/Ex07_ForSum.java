package day03;

public class Ex07_ForSum {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		
		sum = 0;
		
		for(int i=2; i<=10; i+=2) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		
	}

}
