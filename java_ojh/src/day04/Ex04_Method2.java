package day04;

public class Ex04_Method2 {

	public static void main(String[] args) {
		for(int num = 1; num <= 100; num++) {
			/*if(isPrimeNumber(num)) {
				System.out.print(" ");
			}*/
			System.out.print(isPrimeNumber(num)? num + " " : "");
		}
		System.out.println();
		
		int num = 7;
		if(isPrimeNumber(num)) {
			System.out.println(num + "는 소수");
		}else {
			System.out.println(num + "는 소수가 아닙니다");
		}
		
	}

		

	
	
	
	/* 기능 : 정수가 소수인지 아닌지 판별
	 * 매개변수 : 정수 => int num
	 * 리턴타입 : 소수판별 -> boolean
	 * 메소드명 : isPrimeNumber
	 */
	public static boolean isPrimeNumber(int num) {
		if(num == 1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			// 1과 자기자신을 제외한 수 중에서 약수를 찾으면 소수가 아님
			if(num % i == 0) {
				return false;
			}
		}
		// 못 찾으면 소수
		return true;
	}

}
