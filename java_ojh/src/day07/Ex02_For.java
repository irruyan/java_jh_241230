package day07;

public class Ex02_For {

	public static void main(String[] args) {
		// 1부터 10까지 합을 구하는 코드
		// 1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10
		
		int sum = 0;
		int max = 10;
		int even = 2;
		for(int i = 1; i <= max; i++) {
			
			if(i % even != 0) {
				sum += i;
			}
			else {
				sum -= i;
			}
		}
		System.out.println(sum);
	}

}
