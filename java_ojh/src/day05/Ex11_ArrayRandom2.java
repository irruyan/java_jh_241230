package day05;

public class Ex11_ArrayRandom2 {

	public static void main(String[] args) {
		// 1~10 사이의 중복되지 않은 랜덤한 수 6개를 배열에 저장
		//반복 : 저장된 개수가 6개가 될 때까지
		
		//랜덤한 수 6개를 배열에 저장
		
		int size = 6;
		int [] rand = new int[size];
		
		int max = 10, min = 1;
		boolean result = false;
		
		for(int i = 0; i < size; i++) {
			
			rand[i] = (int)(Math.random() * (max - min + 1) +min);
			if(rand[i] == size) {
				result = false;
				
			}
			else {
				rand[i] = size;
			}
			System.out.println(rand[i]);
		}
		

		
		/* 중복 제거
		boolean result = false;
		
		for(int i = 0; i < rand.length; i++) {
			if(rand[i] == size) {
				result = true;
				break;
				
			}
		}
		*/
	}

}
