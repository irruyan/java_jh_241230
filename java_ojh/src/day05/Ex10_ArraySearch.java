package day05;

public class Ex10_ArraySearch {

	public static void main(String[] args) {
		/*
		 * 다음 배열에 num 이 있는지 없는지 판별하는 코드
		 */
		
		int [] array = new int[] {1,2,3,4,5};
		int num = 4;
		boolean result = false;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == num) {
				result = true;
				break;
			}
		}
		
		if(result) {
			System.out.println(num + " 는 배열에 있음");
		}
		else {
			System.out.println(num + " 는 배열에 없음");
		}
		
		
		if(contains(array, num)) {
			System.out.println(num + " 는 배열에 있음");
		}
		else {
			System.out.println(num + " 는 배열에 없음");
		}
		
		if(contains(array, 3, num)) {
			System.out.println(num + " 는 배열의 3자리 안에 있음");
		}
		else {
			System.out.println(num + " 는 배열의 3자리 안에 없음");
		}
	}
	
	/* 배열에 num 가 있는지 없는지 알려주는 메소드
	 * 매개변수 : 배열과 num -> int [] arr, int num
	 * 리턴타입 : 있는지 없는지 => boolean
	 * 메소드명 : contains
	 */
	
	public static boolean contains(int [] arr, int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	/* 배열 중 0번지부터 n개를 비교하여 num가 있는지 없는지 알려주는 메소드
	 * 매개변수 : 배열, 비교 개수, num -> int [] arr, int count, int num
	 * 리턴타입 : 있는지 없는지 => boolean
	 * 메소드명 : contains
	 */
	
	public static boolean contains(int [] arr, int count, int num) {
		if(arr.length < count) {
			count = arr.length;
		}
		
		for(int i = 0; i < count; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}

}
