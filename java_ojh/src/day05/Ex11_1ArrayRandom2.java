package day05;

public class Ex11_1ArrayRandom2 {

	public static void main(String[] args) {
		
		int count = 0;
		int [] arr = new int[6];
		
		int min = 1, max = 45;
		
		while(count < arr.length) {
			
			int r = (int)(Math.random() * (max - min + 1) + min);
			boolean result = false;
			
			for(int i = 0; i < arr.length; i++) {
				
				if(arr[i] == r) {
					result = true;
					break;
				}
			}
			
			if(result) {
				continue;
			}
			
			arr[count] = r;
			count++;
			// arr[count++] = r;
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println();
		System.out.println();

		//printArray(arr);
		
		
		while(count < arr.length) {
			
			int r = (int)(Math.random() * (max - min + 1) + min);
			
			if(contains(arr,r)) {
				continue;
			}
			
			arr[count++] = r;
			
			boolean result = false;
			
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
		printArray(arr);
		}
		
		int [] arr2 = createRandomArray(min, max, max);
		
		

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
}
