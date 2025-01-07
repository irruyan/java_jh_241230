package day06;

import java.util.Arrays;
import java.util.Collections;

public class Ex06_ArraySort {

	public static void main(String[] args) {
		//정렬 예제
		int [] arr = new int[] {1, 3, 5, 7 , 9, 2, 4, 6, 8, 10};
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		Ex05_EnhancedFor.print2(arr);
	
		int [] arr2 = new int[] {1, 3, 5, 7 , 9, 2, 4, 6, 8, 10};
		
		// Arrays.sort(배열) : 오름차순으로 정렬
		Arrays.sort(arr2);
		// Arrays.toString(배열) : 배열을 문자열로 변환. [값1, 값2, ...]
		System.out.println(Arrays.toString(arr2));
		
		Integer [] arr3 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
		/*
		 * 내림차순, 기본 자료형 불가 Integer 배열을 활용
		 */
		Arrays.sort(arr3, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr3));
	}

}
