package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex02_Stream {

	public static void main(String[] args) {
		
		List<Person2> list = new ArrayList<Person2>();
		
		list.add(new Person2("Hong", 20, "남"));
		list.add(new Person2("Honey", 20, "여"));
		list.add(new Person2("Santa", 80, "남"));
		list.add(new Person2("Gong", 75, "여"));
		
		//남자들의 정보만 출력
		Stream<Person2> stream = list.stream();
		stream
			.filter(p->p.getGender().equals("남")) // 남자들만 남도록
			.forEach(p-> System.out.println(p)); // 정보를 출력
		
		System.out.println("-----------------");
		//나이가 30미만인 여자들의 정보만 출력
		stream = list.stream();
		stream
			.filter(p -> p.getAge() < 30)
			.filter(p -> p.getGender().equals("여"))
			.forEach(p -> System.out.println(p));
		System.out.println("-----------------");
		//여자들의 수
		stream = list.stream();
		long count = stream
						.filter(p -> p.getGender().equals("여"))
						.count();
		System.out.println("count of women is : " + count);
		System.out.println("-----------------");
		
		//사람들의 평균 나이 계산
		// map()은 Person2를 R로 리턴
		// mapToInt()는 Person2를 Integer로 리턴
		stream = list.stream();
		//OptionalDouble avg = stream.mapToInt(Person2::getAge).average();
		OptionalDouble avg = stream.mapToInt(p->p.getAge()).average();
		
		if(avg.isPresent()) {
			System.out.println("평균 나이 : " + avg.getAsDouble());
		}else {
			System.out.println("일치하는 사람이 없습니다.");
		}
		
		System.out.println("-----------------");
		
		stream = list.stream();
		double avg2 = stream.mapToInt(Person2::getAge).average().orElse(0);
		System.out.println("평균 나이 : " + avg2);
		
		System.out.println("-----------------");
		
		stream = list.stream();
		List<Person2> list2 = stream
								.filter(p->p.getAge()>30)
								.collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println("-----------------");
		
		stream = list.stream();
		
		AtomicInteger index = new AtomicInteger(0);
		
		stream.forEach(p -> {
			int curIndex = index.getAndIncrement();
			System.out.println(curIndex + 1 + ". " + p);
		});
						
	}

}

@Data
@AllArgsConstructor
class Person2{
	private String name;
	private int age;
	private String gender;
}