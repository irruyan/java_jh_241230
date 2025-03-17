package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex03_Student {
	
	/*
	 * 1. 학생 추가 - 학년, 반, 번호, 이름

	 * 2. 학생 조회
	 * 	2-1. 학년 조회 : 학년
	 *  2-2. 반 조회 : 학년, 반
	 *  2-3. 번호 조회 : 학년, 반, 번호
	 *  2-4. 전체 조회 ㅣ X
	 * 3. 종료
	 */
	
	static Scanner scan = new Scanner(System.in);
	static List<Student> list = new ArrayList<Student>();

	public static void main(String[] args) {
		
		list.add(new Student(1, 1, 1, "hong"));
		list.add(new Student(1, 1, 2, "song"));
		list.add(new Student(2, 1, 1, "kong"));
		list.add(new Student(3, 1, 1, "dong"));
		list.add(new Student(3, 2, 1, "pong"));
		
		
		int menu;
		
		do {
			printMenu();
			
			menu = scan.nextInt();
			scan.nextLine();
			
			runMenu(menu);
			
		}while(menu != 3);

	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			addStudent();
			break;
		case 2:
			searchStudent();
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		case 4:
			deleteStudent();
			break;
		default:
			System.out.println("올바른 메뉴가 아닙니다.");
		}
		
	}

	private static void deleteStudent() {
		// 이름 입력
		System.out.print("삭제할 학생의 이름을 입력하세요 : ");
		String name = scan.nextLine();
		
		// 이름을 포함하는 학생들을 번호와 함께 출력
		List<Student> tmplist =
				list
				.stream()
				.filter(s->s.getName().contains(name))
				.collect(Collectors.toList());
		print(tmplist, s->true, true);
		//삭제할 번호를 입력
		System.out.println("삭제할 학생 번호 : ");
		int count = scan.nextInt();
		
		// 입력받은 번호에 맞는 개체를 가져옴
		Student tmp = tmplist.get(count-1);
		
		//리스트에서 삭제할 객체를 이용하여 제거
		list.remove(tmp);
		
	}

	private static void searchStudent() {
		printSearchMenu();
		
		int menu = scan.nextInt();
		scan.nextLine();
		
		runPrintMenu(menu);
		
	}

	private static void runPrintMenu(int menu) {
		switch(menu) {
		case 1:
			searchGrade();
			break;
		case 2:
			searchClassNum();
			break;
		case 3:
			searchNum();
			break;
		case 4:
			searchAll();
			break;
		default:
			System.out.println("올바른 메뉴가 아닙니다.");
		}
		
	}

	private static void searchGrade() {
		// 학년 입력
		System.out.print("검색할 학년을 입력하세요 : ");
		int grade = scan.nextInt();
		// 리스트에서 학년이 같은 학생들을 출력
		print(list, s->s.getGrade() == grade);
				
	}
	
	
	private static void searchClassNum() {
		System.out.print("검색할 학년을 입력하세요 : ");
		int grade = scan.nextInt();
		
		System.out.print("검색할 반을 입력하세요 : ");
		int classNum = scan.nextInt();
		
		print(list, s->s.getGrade() == grade && s.getClassNum() == classNum);
		
	}

	private static void searchNum() {
		System.out.print("검색할 학년을 입력하세요 : ");
		int grade = scan.nextInt();
		
		System.out.print("검색할 반을 입력하세요 : ");
		int classNum = scan.nextInt();
		
		System.out.print("검색할 학생의 번호를 입력하세요 : ");
		int studentNum = scan.nextInt();
		
		print(list, s->s.getGrade() == grade && 
				s.getClassNum() == classNum &&
				s.getStudentNum() == studentNum);
		
	}

	private static void searchAll() {
		//학생 전체를 출력
		print(list, s->true);
		
	}
	
	private static void print(List<Student> list, Predicate <Student> p) {
		print(list, p, false);
	}
	
	private static void print(List<Student> list, Predicate<Student> p, boolean isCount) {
		Stream<Student> stream = list.stream();
		AtomicInteger index = new AtomicInteger(1);
		stream
			.filter(p)
			.forEach(s->{
				int num = index.getAndIncrement();
				System.out.println((isCount ? num + ". " : "") + s);	
		});
	}

	private static void printSearchMenu() {
		System.out.println("------------");
		System.out.println("1. 학년 조회");
		System.out.println("2. 반 조회");
		System.out.println("3. 번호 조회");
		System.out.println("4. 전체 조회");
		System.out.println("------------");
		System.out.print("메뉴 선택 : ");
		
	}

	private static void addStudent() {
		System.out.print("추가할 학생의 학년을 입력하세요 : ");
		int grade = scan.nextInt();
		System.out.print("추가할 학생의 반을 입력하세요 : ");
		int classNum = scan.nextInt();
		System.out.print("추가할 학생의 번호를 입력하세요 : ");
		int studentNum = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("추가할 학생의 이름을 입력하세요 : ");
		String name = scan.nextLine();
		
		Student st = new Student(grade, classNum, studentNum, name);
		list.add(st);
		
		System.out.println("학생 정보를 등록했습니다.");
		
	}

	private static void printMenu() {
		System.out.println("------------");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 조회");
		System.out.println("3. 종료");
		System.out.println("4. 학생 삭제");
		System.out.println("------------");
		System.out.print("메뉴 선택 : ");
		
	}

}

@Data
@AllArgsConstructor
class Student{
	private int grade, classNum, studentNum;
	private String name;
	@Override
	public String toString() {
		return grade + "학년 " + classNum + "반 " + studentNum + "번 " + name ;
	}
	
}