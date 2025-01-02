package day03;

public class Ex15_WhileEvenNumber {

	public static void main(String[] args) {

		int i = 1;
		
		while(i <= 10) {
			if(i % 2 == 0) {
				System.out.println(i + " ");
			}
			i++;
		}
		
		i = 0;
		while(++i <= 10) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i + " ");
		}
		
	}

}
