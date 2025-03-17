package day23;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex15_Chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point4 p = new Point4(10, -10);
		
		//print1은 리턴이 void여서 체이닝을 사용할 ㅅ ㅜ없음
		p.print1();
		System.out.println("---------");
		//print2는 리턴이 point4 객체여서 point4에서 제공하는 메소드를 이어서 체이닝할수 있음
		p.print2().print1();
		System.out.println("---------");
		//tostring은 리턴이 string 이어서 string 에서 제공하는 
		//substring을 체이닝으로 사용 가능
		String str = p.print2().toString().substring(3);
		System.out.println("---------");
		
		//system클래스의 필드로 객체 out이 있고, printstream에서 제공하는 println을 사용
		System.out.println(str);

	}

}

@Data
@AllArgsConstructor
class Point4{
	private int x, y;
	
	public void print1() {
		System.out.println(x + " , " + y);
	}
	
	public Point4 print2() {
		System.out.println(x + " , " + y);
		return this;
	}
}