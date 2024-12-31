package day02;

public class Ex05_IfAdult {

	public static void main(String[] args) {

		int age = 3;
		
		if(age >= 19) {
			System.out.println(age + "세는 성인입니다.");
		}
		if(!(age >= 19)) {
			System.out.println(age + "세는 미성년자입니다.");
		}
		
		
		
		if(age >= 19) {
			System.out.println("성인");
		}
		else {
			System.out.println("미성년자");
		}
		
	}

}
