package day03;

public class Ex19_NestingPrimeNumber {

	public static void main(String[] args) {

		int num, count = 0;
		
		for(num = 2; num <= 100; num++) {
			count = 0;
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					count++;
				}
			}
			
			if(count == 2) {
				System.out.print(num + " ");
			}
		}
		
		
	}

}
