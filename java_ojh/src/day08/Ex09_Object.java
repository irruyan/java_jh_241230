package day08;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

public class Ex09_Object {

	public static void main(String[] args) throws CloneNotSupportedException {
		Point p = new Point();
		
		System.out.println(p);
		System.out.println(p.toString());
		
		Student std1 = new Student(1, 1, 1, "hong", "kor", 100);
		Student std2 = new Student(1, 1, 2, "hong", "kor", 100);
		Student std3 = new Student(1, 1, 1, "lim", "kor", 90);
		
		System.out.println(std1.equals(std2));
		System.out.println(std1.equals(std3));
		
		Student std4 = (Student)std1.clone();
		std1.score = 90;
		System.out.println(std4);

	}
	
	public void println(Object object) {
		System.out.println(object.toString());
	}

}

@Data
class Point{
	private int x, y;

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
}

@AllArgsConstructor
@ToString
class Student implements Cloneable{
	int grade, classNum, num;
	String name, subject;
	int score;
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num, subject);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum && grade == other.grade && num == other.num
				&& Objects.equals(subject, other.subject);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
}