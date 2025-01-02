package day03;

public class Ex19_NestingPrimeNumber {

	public static void main(String[] args) {

		int num = 2;
		int count = 0;
		
		for(num=2; num<=100; num++) {
			for(int i=1; i<=num; i++) {
				if(num % 1 == 0) {
					count++;
				}
				if(count == 2) {
					System.out.print(num + " ");
				}
			}
			
		}
		
		
	}

}
