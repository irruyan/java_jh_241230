package day01;

public class Ex11_OperatorInvrement {

	public static void main(String[] args) {

		int num1 = 10, num2 = 10;
		
		System.out.println("증가 전 num1(전위형) : " + num1);
		System.out.println("증가 전 num2(후위형) : " + num2);
				
		
		++num1;
		num2++;
		
		System.out.println("증가 후 num1(전위형) : " + num1);
		System.out.println("증가 후 num2(후위형) : " + num2);
		
		System.out.println("======== 절 취 선 ==========");
		
		
		System.out.println("증가 전 num1(전위형) : " + num1);
		System.out.println("증가 전 num2(후위형) : " + num2);
				
		
		System.out.println("증가 중 num1(전위형) : " + ++num1);
		System.out.println("증가 중 num2(후위형) : " + num2++);
		
		System.out.println("증가 후 num1(전위형) : " + num1);
		System.out.println("증가 후 num2(후위형) : " + num2);
		
		
	}

}
