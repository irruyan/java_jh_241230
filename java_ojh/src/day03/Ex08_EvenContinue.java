package day03;

public class Ex08_EvenContinue {

	public static void main(String[] args) {

		for(int i=1 ; i<=10 ; i++) {
			if(i % 2 !=0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}

}
