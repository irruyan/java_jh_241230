package day10;

import java.util.ArrayList;

public class Ex01_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Collection 인터페이스의 자식 인터페이스
		 * List는 인터페이스
		 * ArrayList는 List 인터페이스의 구현 클래스
		 *  - List 인터페이스의 구현 클래스
		 *  - 제네릭 클래스
		 *   - 멤버변수 / 메서드의 타입이 정해지지 않은 클래스
		 *   - 타입을 객체를 생성할 때 정함
		 *   - 타입은 클래스만 가능 int가 아니라 Integer임.
		 */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		list.add(1, 11);
		
		System.out.println(list);
		
		list.remove((Integer)10);
		
		System.out.println(list);
		
		list.remove(0);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		System.out.println(list.contains(20));
		
		System.out.println(list.indexOf(20));

	}

}
