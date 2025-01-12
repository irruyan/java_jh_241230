package day09;

public class Ex10_RuntimeException {

	public static void main(String[] args) {
		
		/*ArithmeticException : 0으로 나누었을때 (a/0, a%0)*/
		
		int num1 = 1, num2 = 0;
		// System.out.println(num1/num2); // 예외발생
		System.out.println(num1 / (double)num2); // 정상 실행
		
		String str = null;
		//System.out.println(str.charAt(0));
		
		int [] arr = new int [4];
		// arr [4] = 10;
		
		// 숫자 형식이 필요한 곳에서 숫자 형식이 아닌 값을 넘겨주는 경우
		String strNum = "1234a";
		//System.out.println(Integer.parseInt(strNum));
		
		Child tmp = new Child();
		Parent p = tmp; //new Parent();
		Child c = (Child)p;
	}

}

class Parent{}
class Child extends Parent{}