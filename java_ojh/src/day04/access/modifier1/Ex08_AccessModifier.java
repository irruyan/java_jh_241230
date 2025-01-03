package day04.access.modifier1;

import day04.access.modifier2.B;

public class Ex08_AccessModifier {
		
	public static void main(String[] args) {
		
		A a1 = new A(); // 동일 패키지
		B b1 = new B(); // 다른 패키지(임포트 필요)
		
		a1.name = "홍길동"; // public : 다른 패키지, 다른 클래스 사용가능
		b1.name = "임꺽정";
		
		a1.address = "서울시";
		//b1.address = "서울시"; // default : 다른 패키지 사용 불가
		
		// private : 같은 패키지도 사용 불가
		//a1.num = "000101-1234567";
		//b1.setNum("001101-1234567");
		//System.out.println(b1.getNum());

	}
}


