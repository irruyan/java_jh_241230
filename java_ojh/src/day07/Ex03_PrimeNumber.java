package day07;

public class Ex03_PrimeNumber {

	public static void main(String[] args) {
		// 정수 num가 소수인지 아닌지 판별하는 코드

		int num = 7;
		int i;
		
		for(i = 2; i <= num; i++) {
			if(num % i == 0) {
				break;
			}
		}
		if(i == num) {
			System.out.println(num + "소수");
		}
		else {
			System.out.println(num + "아님");
		}
		
		System.out.println();
		
		if(isPrimeNumber(num)) {
			System.out.println(num + "소수");
		}
		else {
			System.out.println(num + "아님");
		}
		
		// 100 이하의 소수를 판별하기 위해 배열을 이용하여 작성
		// i가 소수이면 i번지에 true, 아니면 false를 저장
		
		boolean primeArray [] = new boolean[101];
		
		for(i = 1; i <= 100; i++) {
			if(isPrimeNumber(i)) {
				primeArray[i] = true;
			}
			else {
				primeArray[i] = false;
			}
			
			primeArray[i] = isPrimeNumber(i);
		}
		//primeArray 를 이용하여 소수들만 출력하는 코드
		
		for (i = 1; i <= 100; i++) {
			if(primeArray[i]) {
				System.out.print(i + " ");
			}
		}
		
		
	}
	
	public static boolean isPrimeNumber(int num) {
		int i;
		for(i = 2; i < num; i++) {
			if(num % i == 0) {
				break;
			}
		}
		if(i == num) {
			return true;
		}
		return false;
	}

}
