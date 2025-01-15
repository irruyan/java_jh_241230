package day10;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Ex02_List2 {

	public static void main(String[] args) {
		/* 클래스 형변환
		 * 구현 클래스(ArrayList)의 객체를 인터페이스(List)로 자동 클래스 형변환 할 수 있다.
		 * */
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(1,1));
		list.add(new Point(1,2));
		
		System.out.println(list);
		
		Point p = list.get(0);
		p.setX(10);
		p.setY(10);
		
		System.out.println(list);
		
		Point p2 = new Point(list.get(1));
		
		p2.setX(10);
		p2.setY(10);
		
		System.out.println(list);

	}

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Point{
	private int x, y;
	public Point(Point p) {
		x = p.x;
		y = p.y;
	}

}