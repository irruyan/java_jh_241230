package day05;

public class Ex12_Lotto {

	public static void main(String[] args) {
		
		/* 1~45 사이의 6개의 랜덤한 수를 생성, 1개의 보너스 번호 생성
		 * 1~45 사이의 정수 6개를 입력 받아 입력한 정수가 몇 등인지 확인하는 코드
		 * 
		 * 1등 : 6개 / 2등 : 5개, 보너스 / 3등 5개
		 * 4등 : 4개 / 5등 : 3개 / 나머지 : 꽝
		 */
		
		int num = 0;
		int count = 0;
		int [] arr = new int[6];
		
		int min = 1, max = 45;
	
		//랜덤으로 중복되지 않은 배열 생성
		arr = createRandomArray(min, max, 6);
		
		//반복문 : 랜덤으로 생성된 숫자가 배열에 있으면 반복, 없으면 종료
		contains(arr, num);
		printArray(arr);
			//랜덤으로 보너스 번호를 생성
		
		//반복문 : 6번
			//번호 입력
		
		//랜덤번호(배열)와 입력 번호의 일치하는 개수를 셈
		
		//일치하는 개수에 따라 등수 출력
		
			// 6개 일치 = 1등
			// 5개 일치
				//보너스도 일치 : 2등
				// 아니면 3등
		
	}
	
	public static int [] createRandomArray(int min, int max, int size) {
		if(size <= 0) {
			return null;
		}
		int [] arr = new int [size];
		
	for(int i = 0; i < size; i++) {
			
			arr[i] = (int)(Math.random() * (max - min + 1) +min);
		
		}
	return arr;
		
		
	}
	
	
	public static void printArray(int [] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
	}
	
	
	public static boolean contains(int [] arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	

}
