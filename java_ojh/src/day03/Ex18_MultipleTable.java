package day03;

public class Ex18_MultipleTable {

	public static void main(String[] args) {

		int num = 2;
		
		for(num = 2; num <=9; num++) {
			System.out.println(num + "단");
			for(int i=1; i<=9; i++) {	
			System.out.println(num + " X " + i + " = " + num*i);
			}
		}
	}		
	
}

