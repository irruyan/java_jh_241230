package day04;

public class Ex08_Class2 {

	public static void main(String[] args) {
		//(10, 10) 위치에 점을 생성
		Point1 p1 = new Point1(10, 10);
		p1.print();
		// 점의 위치를 (20, 20)으로 이동한 후 출력
		p1.move(20, 20);
		p1.print();

	}
}
	
	// 화면에 점을 나타내는 클래스
class Point1{
	
	// 정보 : x, y 좌표
	// 기능 : x, y 좌표 출력, 좌표 이동 가능
	
	//필드 :  x, y 좌표
	private int x, y;
	
	//메소드 : x, y 좌표 출력, 좌표 이동 가능
	public void print() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	public void move(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	//생성자
	public Point1() {}

	public Point1(int x, int y) {

		this.x = x;
		this.y = y;
	}
	
	
	
	
	
}


