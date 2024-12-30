package day01;

public class Ex07_VariableNaming {

	public static void main(String[] args) {
		int num = 10;
		
		int NUM = 10;
		
		// int int; 예약어(키워드) 사용불가
		
		// int 1num = 10; 변수 시작은 숫자 불가능
		
		int _num = 10; 
		
		// int n um = 10;
		// int %num = 10; 특수문자는 _와 $만 가능
		
		// int num = 20; 중복 선언 불가
		
		System.out.println(num);
		System.out.println(NUM);
		System.out.println(_num);
	}

}
