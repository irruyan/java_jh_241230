package day01;

public class Ex02_variablechar {

	public static void main(String[] args) {
		char ch1; // 문자 변수 ch1 선언, 초기값 없음;
		// System.out.println(ch1); // 에러
		ch1 = '1'; // 저장 가능 
		System.out.println(ch1);
		
		char ch2 = '한';
		System.out.println(ch2);

		char ch3 = '\u0041';
		System.out.println(ch3);
		
		char ch4 = '\\', ch5 = '\n', ch6 = '\"';
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);

	}

}
