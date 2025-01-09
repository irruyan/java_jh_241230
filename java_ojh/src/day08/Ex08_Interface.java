package day08;

public class Ex08_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ConsoleProgram.num);
		ConsoleProgram cp = new StudentScoreProgram();
		cp.run();
		ConsoleProgram.test();
	}

}

//인터페이스 정의
interface ConsoleProgram{
	
	/*public static final */int num = 10;
	
	void run();
	
	void printMenu();
	
	void runMenu(int menu);
	
	//default 메소드는 나중에 추가 돼도 기존 구현 클래스들에게 문제를 일으키지 않습니다.
	default void func1() {
		
	}
	static void test(){
		System.out.println("정적 메소드");
	}
}

//인터페이스를 이용하여 구현 클래스를 정의
// -> 메소드 오버라이딩을 통해 인터페이스의 추상 메소드를 구현
class StudentScoreProgram implements ConsoleProgram{

	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("MENU");
	}

	@Override
	public void runMenu(int menu) {
		// TODO Auto-generated method stub
		System.out.println("UNDER THE MENU");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Program is running");
	}
	
}

interface Program{
	void run();
}

/*
 * Program의 run과 ConsoleProgram의 run은 둘 다 추상메소드기때문에 오버라이딩이 필요
 */
interface GeneralProgram extends Program, ConsoleProgram{
	
}



