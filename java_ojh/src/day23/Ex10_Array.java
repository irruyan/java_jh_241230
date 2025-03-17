package day23;

public class Ex10_Array {

	public static void main(String[] args) {
		int [] arr = new int [5];
		
		//배열의 번지는 크기보다 작아야 함, arr.length 까지 가면 범위를 벗어남
		for(int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
