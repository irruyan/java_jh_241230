package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex06_ListSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(1);
		list1.add(3);
		
		System.out.println(list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		
		System.out.println(list1);
		
		Collections.sort(list1);
		
		System.out.println(list1);
		
		System.out.println("------");
		
		list1.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1 - o2;
			}
		
		});
		
		//list1.sort((o1, o2) -> o2 - o1);
		
		System.out.println(list1);

	}

}
