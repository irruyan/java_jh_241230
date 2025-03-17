package day23;

import lombok.Data;

public class Ex06_Class {

	public static void main(String[] args) {
		// 1. 객체 생성
		// 2. null값에 대한 예외처리
		MyStudent std = new MyStudent(); // <- 객체 생성 형태 외워
		//클래스명 변수명 = new 클래스명();
		print(std);

	}
	
	public static void print(MyStudent std) {
		System.out.println(std.getGrade() + "학년");
		System.out.println(std.getClassNum() + "반");
		System.out.println(std.getNum() + "번호");
		System.out.println(std.getName());
	}

}

@Data
class MyStudent{
	int grade, classNum, num;
	String name;
}