package day08;

public class Ex07_Final {

	public static void main(String[] args) {
		/*
		 *  final = 변하지 않는
		 *   - 변수 : 변수가 변하지 않음 => 상수
		 *   	Math.PI
		 *   - 메소드 : 메소드가 변하지 않음 => 오버라이딩 불가능
		 *   - 클래스 : 클래스가 변하지 않음 => 상속이 불가능
		 *   	String
		 */
		
		//상수는 재할당 한번만 가능
		final int max;
		max = 10;
		// max = 9; 는 에러임.
		

	}

}

final class C1{}

class C2{
	public void test1() {}
	public final void test2() {}
	
	
}

//final class인 C1은 부모가 될 수 없음
//class D1 extends C1{}

class D2 extends C2{
	@Override
	public void test1() {}
	//@Override
	// public void test2() {} // 에러 발생
}

