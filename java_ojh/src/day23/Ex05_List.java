package day23;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex05_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Point> list = new ArrayList<Point>();
		
		
		//list.add(new Point());
		//생성자가 없음
		//list.add(new Point(1,2));
		
		//list.add(new Point(1));
		//리스트에 추가하려면 Point 클래스의 객체가 와야 하는데 정수가 옴
		//list.add(1);
		
		
		
		/*
		List<Object> list = new ArrayList<Object>();
		list.add(new Point());
		list.add("안녕");
		list.add(1);
		 * 
		 */
		

	}

}

@Data

class Point{
	int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	


}
