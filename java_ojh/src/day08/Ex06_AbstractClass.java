package day08;

public class Ex06_AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A1 a1 = new A1();
		A1 a = new B1();
		//자식 클래스인 B1클래스를 이용하여 객체를 생성 후 업캐스팅을 이용하여
		//클래스 형변환을 함
				
	}

}

abstract class A1{
	
}

class B1 extends A1{
	
}

//추상 메소드가 있으면 클래스도 추상 클래스여야 한다.
abstract class A2{
	public abstract void print();
	
	public void print2() {}
}

abstract class B2_1 extends A2{
	
}

class B2_2 extends A2{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("printinggggg");
		
	}
	
}