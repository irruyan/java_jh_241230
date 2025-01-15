package day12;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Ex01_FuntionInterface {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("hong", "000101-3", 24));
		list.add(new Person("Dong", "601212-1", 64));
		list.add(new Person("King", "000101-1", 24));
		list.add(new Person("Sing", "801111-2", 44));		
		
		//print를 이용하여 사람들의 이름을 출력
		print(list, p->System.out.println(p.getName()));
		System.out.println("-----------");
		//print를 이용하여 사람들의 전체정보를 출력
		print(list, p->System.out.println(p));
		System.out.println("-----------");
		//print를 이용하여 사람들의 주민번호를 출력
		print(list, p->System.out.println(p.getNum()));
		System.out.println("-----------");
		
		//xx0101-x
		Person p = randomNum(()->{
			int year = (int)(Math.random()*(99 - 0 + 1) + 0);
			DecimalFormat df = new DecimalFormat("");
			String yearStr = df.format(year);
			int gender = (int)(Math.random()*(4 - 1 + 1) + 1);
			String num = yearStr + "0101-" + gender;
			return new Person("", num, 0);
		});
		System.out.println(p);
		System.out.println("-----------");
		
		printString(list, p1->p1.getName());
		System.out.println("-----------");
		
		printString(list, p1->p1.getNum());
		System.out.println("-----------");
		
		// 모든 사람들의 나이를 1 증가
		replacePerson(list, p1->{
		p1.setAge(p1.getAge() + 1);
		return p1;
		});
		
		
		// 홍길동인 사람의 이름을 홍씨라고 변경
				replacePerson(list, p1->{
					if(p1.getName().equals("hong")) {
						p1.setName("HONG");
					}
				
				return p1;
				});
			
		print(list,p1->System.out.println(p1));
		
		
	}
	
	//UnaryOperator은 매개변수 타입이 A이고 리턴타입이 A
	public static void replacePerson(List<Person> list, UnaryOperator<Person> op) {
		for(int i = 0; i < list.size(); i++) {
			list.set(i, op.apply(list.get(i)));
		}
	}
	
	//Function은 매개변수 타입이 A이고 리턴타입이 B
	
	public static void printString(List<Person> list, Function<Person, String>f) {
		for(Person p : list) {
			System.out.println(f.apply(p));
		}
	}
	
	//Supplier는 매개변수가 없고, 리턴타입이 있음
	// random으로 주민번호 생성, 사람 객체를 return
	
	public static Person randomNum(Supplier<Person> p) {
		return p.get();
		
	}
	
	//Consumer는 매개변수가 있고, 리턴타입이 없어서 보통 출력문으로 활용
	public static void print(List<Person> list, Consumer<Person> c) {
		for(Person p : list) {
			c.accept(p);
		}
	}

}

@Data
@AllArgsConstructor
class Person{
	private String name;
	private String num;
	private int age;
	
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