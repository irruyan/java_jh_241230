package day04;

public class Ex05_Method3_Multiple {

	public static void main(String[] args) {
		
		int num = 0;
		
		for(num = 2; num <=9; num++) {
			System.out.println(num + "단");
			Multiple(num);
		}

		
	}
	
	
	/*2단 ~ 9단까지 구구단 메소드
	 * 리턴타입 : int
	 * 매개변수 : int X -> 없음 -> void 
	 * 메소드명 : Multiple
	 */
	
	public static void Multiple(int num) {
	
		for(int i=1; i<=9; i++) {	
			System.out.println(num + " X " + i + " = " + num*i);
			}
		}
}
