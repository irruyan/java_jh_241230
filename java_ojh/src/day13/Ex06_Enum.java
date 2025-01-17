package day13;

import java.util.Scanner;

public class Ex06_Enum {

	public static void main(String[] args) {
		
		System.out.println("계절 입력(봄:SPRING, 여름:SUMMER, 가을:FALL, 겨울:WINTER) : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		Season season = Season.valueOf(str);
		
		switch(season) {
		case SPRING:
			System.out.println("봄");
			break;
		case SUMMER:
			System.out.println("여름");
			break;
		case FALL:
			System.out.println("가을");
			break;
		case WINTER:
			System.out.println("겨울");
			break;
		}
		
		
		System.out.println("계절 입력(봄:1, 여름:2, 가을:3, 겨울:4) : ");
		
		int num = scan.nextInt();
		
		for(Season tmp : Season.values()) {
			if(num == tmp.ordinal() + 1) {
				season = tmp;
			}
		}
		
		switch(season) {
		case SPRING:
			System.out.println("봄");
			break;
		case SUMMER:
			System.out.println("여름");
			break;
		case FALL:
			System.out.println("가을");
			break;
		case WINTER:
			System.out.println("겨울");
			break;
		}

	}

}

enum Season{
	SPRING, SUMMER, FALL, WINTER
}

