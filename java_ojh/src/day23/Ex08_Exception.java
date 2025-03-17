package day23;

public class Ex08_Exception {

	public static void main(String[] args) {
		int num1 = 1, num2 = 0;
		
		// 0으로 나누면 예외 발생
		
		try {
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
		}catch(ArithmeticException e){
			System.out.println("프로그램 종료");
		}
		
		

	}

}
