package day23;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex13_Lambda {

	public static void main(String[] args) {
		
		
		List<Point3> list = new ArrayList<Point3>();
		
		list.add(new Point3(0, 0));
		list.add(new Point3(1, 1));
		list.add(new Point3(-1, -1));
		
		//printX(list);
		System.out.println();
		//printY(list);
		
		//람다식으로 x좌표가 0이상인 좌표들만 출력하는 메소드
		printList(list, p->p.getX() >= 0);
		System.out.println();
		//람다식으로 y좌표가 0이상인 좌표들만 출력하는 메소드
		printList(list, p->p.getY() >= 0);
	
		

	}
	
	
	//람다식은 메소드를 간결하게 표현해서 객체를 생성 ()->{}
	//함수형 인터페이스의 객체를 만들 때 사용(consumer, supply, function, operator)
	public static void printList(List<Point3> list, Predicate<Point3> p) {
		for(Point3 tmp : list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}

	
	
	// y좌표가 0 이상인 좌표들만 출력하는 메소드
	private static void printY(List<Point3> list) {
		for(Point3 tmp : list) {
			if(tmp.getY() >= 0) {
				System.out.println(tmp);
			}
		}
		
	}

	// x좌표가 0 이상인 좌표들만 출력하는 메소드
	private static void printX(List<Point3> list) {
		for(Point3 tmp : list) {
			if(tmp.getX() >= 0) {
				System.out.println(tmp);
			}
		}
		
	}

}



@Data
@AllArgsConstructor
class Point3{
	private int x, y;
}