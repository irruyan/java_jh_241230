package day23;

public class Ex09_Exception {

	public static void main(String[] args) {
		
		double num1 = 1, num2 = 0;
		
		try {
			if(num2 ==0) {
				throw new Exception();
			}
			System.out.println(num1 + " / " + num2 + " = " + num1/num2);
			
		}catch(Exception e) {
			
			System.out.println("0으로 나눌 수 없습니다.");
		}
		

	}

}
