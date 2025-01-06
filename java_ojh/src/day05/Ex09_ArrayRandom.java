package day05;

public class Ex09_ArrayRandom {

	public static void main(String[] args) {
		
		/*
		 * 6개짜리 배열 : 1~10사이의 랜덤한 수를 저장
		 */
		
		int size = 6;
		int [] rand = new int[size];
		
		int max = 10, min = 1;
		
		for(int i = 0; i < size; i++) {
			
			rand[i] = (int)(Math.random() * (max - min + 1) +min);
			System.out.print(rand[i] + " ");// 동일한 수가 10번 출력
		}
		
		System.out.println();
		
		int [] array2 = createRandomArray(min, max, min);
		for(int i = 0; i < size; i++) {
			System.out.println(array2[i] + " ");
		}
	}
	
	/*
	 * 크기가 주어지면 min~max 사이의 랜덤한 수를 생성하여 배열에 저장,
	 * 저장된 배열을 반환하는 메소드
	 * 매개변수 : 최소값, 최대값, 크기
	 * 리턴타입 : 랜덤으로 생성된 배열
	 * 메소드명 : createRandomArray
	 */

	public static int [] createRandomArray(int min, int max, int size) {
		if(size <= 0) {
			return null;
		}
		int [] array = new int [size];
		
	for(int i = 0; i < size; i++) {
			
			array[i] = (int)(Math.random() * (max - min + 1) +min);
		
		}
	return array;
		
		
	}
	
	
	
}
