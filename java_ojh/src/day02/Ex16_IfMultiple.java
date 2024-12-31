package day02;

public class Ex16_IfMultiple {

	public static void main(String[] args) {

		int num = 5;
		
		if (num % 6 == 0)
			System.out.println("6의 배수 입니다.");
		else if (num % 3 == 0)
				System.out.println("3의 배수 입니다.");
		else if (num % 2 == 0)
					System.out.println("2의 배수 입니다.");
		else
			System.out.println("2, 3, 6의 배수가 아닙니다.");
		
		
		int num2 = 5;
		if(num2 % 2 == 0 && num2 % 3 != 0) {
			System.out.println(num2 + "는 2의 배수입니다.");
		}
		else if(num2 % 3 == 0 && num2 % 2 !=0) {
			System.out.println(num2 + "는 3의 배수입니다.");
		}
		else if(num2 % 6 == 0) {
			System.out.println(num2 + "는 6의 배수입니다.");
		}
		else
			System.out.println("2, 3, 6의 배수가 아닙니다.");
		
		int num3 = 6;
		if(num3 % 2 == 0) 
		{
			if(num3 % 3 == 0) 
			{
				System.out.println("6의 배수");
			}
			else 
			{
				System.out.println("2의 배수");
			}
		}
			else if(num3 % 3 == 0) 
			{
				System.out.println("3의 배수");
			}
			else
				System.out.println("2, 3, 6의 배수가 아닙니다.");
		
	}

}
