package homework_ex2;

import lombok.Data;

@Data
public class Student {
	
	private int grade, classNum, num;
	private String name;
	
	
	//학생 개인의 성적을 담고 있는 배열
	public Subject[] list;
}
