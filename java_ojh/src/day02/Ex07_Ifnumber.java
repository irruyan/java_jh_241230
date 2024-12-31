package day02;

public class Ex07_Ifnumber {

	public static void main(String[] args) {

		int num = -10;
		
		if(num > 0) {
			System.out.println(num + "는 양수");
		}
		else if(num == 0){
			System.out.println("0");
		}
		else
			System.out.println(num + "는 음수");
	}

}
