package day06;

public class Ex03_ArrayCopy {

	public static void main(String[] args) {
		int [] arr1 = new int [] {1,3,5,7,9};
		int [] arr2;
		
		// arr1에 있는 값을 arr2에 복사하는 코드
		print(arr1);
		
		arr2 = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		arr1[0] = 10;
		print(arr2);
		
		int arr3[] = new int [arr2.length];
		System.arraycopy(arr2, 0, arr3, 0, arr2.length);
		arr2[0] = 10;
		print(arr3);
		
		int arr4 [] = new int [arr3.length];
		System.arraycopy(arr3, 0, arr4, 2, 2);
		print(arr4);
		
	}
	
	public static void print(int []arr) {
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
