package homework_ex2v2;

import java.util.List;

import lombok.Data;

@Data
public class Student {
	
	private int grade, classNum, num;
	private String name;
	
	
	//학생 개인의 성적을 담고 있는 배열
	public List<SubjectScore> list;
	
	//equals를 오버라이딩, 학년, 반, 번호를 이용
	
	
}
