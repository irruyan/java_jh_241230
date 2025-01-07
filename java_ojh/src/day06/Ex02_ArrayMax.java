package day06;

public class Ex02_ArrayMax {

	public static void main(String[] args) {
		/*
		 * 배열에 저장된 값 중 가장 큰 값을 출력
		 */
		int [] arr = new int [] {-1, -10, -9, -20, -3, -4};
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++) { // 반복문 : 배열 내 모든 수를 비교
			
			if(max < arr[i]) {// 두 개의 값을 비교해서 큰 수를 출력?
				max = arr[i]; // max에 가장 큰 값을 저장
			} 
		}
		System.out.println("배열에서 가장 큰 수는 : " + max);
			
	}

}
