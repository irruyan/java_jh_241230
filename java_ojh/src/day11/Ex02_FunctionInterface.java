package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex02_FunctionInterface {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("hong", "000101-3"));
		list.add(new Person("Dong", "601212-1"));
		list.add(new Person("King", "000101-1"));
		list.add(new Person("Sing", "801111-2"));
		
		//이름에 'o' 가 포함된 사람의 정보를 출력
		print1(list, p->p.getName().contains("o"));
		System.out.println("-----------");
		//성별이 여성인 사람의 정보를 출력
		print1(list, p->p.getGender().equals("F"));
		System.out.println("-----------");
		
		//생일이 12월인 사람의 정보를 출력
		print1(list, p->Integer.parseInt(p.getNum().substring(2,4)) == 12);
		
	}
	public static void print1(List<Person>list, Predicate<Person> p) {
		for(Person person : list) {
			if(p.test(person)) {
				System.out.println(person);
			}
		}
	}
	


}

@Data
@AllArgsConstructor
class Person{
	private String name;
	private String num;
	
	public String getGender() {
		String gender = num.substring(7, 8);
		switch(gender) {
		case "1", "3":
			return "M";
		case "2", "4":
			return "F";
		default:
			throw new RuntimeException("잘못된 성별");
		}
	}
}