package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex09_ObjectStream2 {
	
	static Scanner scan = new Scanner(System.in);
	static List<Car> list = new ArrayList<Car>();
	
	/*
	 * 프로그램 종료할때 저장하기
	 * 프로그램 시작전에 불러오기
	 * 
	 * 1. 자동차 추가
	 * 2. 자동차 조회(전체)
	 * 3. 종료
	 */

	public static void main(String[] args) {
		
		int menu;
		String fileName = "src/day12/car.txt";
		
		load(fileName, list);
		
		do {
			printMenu();
			
			menu = scan.nextInt();
			scan.nextLine();
			
			runMenu(menu);
			
		}while(menu != 3);
		
		save(fileName, list);

	}


	private static void save(String fileName, List<Car> list) {
		try(FileInputStream fos = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fos)){
			
			List<Car> tmp = (List<Car>)ois.readObject();
			list.addAll(tmp);
			
		} catch (FileNotFoundException e) {
			System.out.println("not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("i/o exception");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
		
	}


	private static void load(String fileName, List<Car> list) {
		
		try(FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(list);
			
		} catch (FileNotFoundException e) {
			System.out.println("not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("i/o exception");
		}
		
	}


	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			addCar();
			break;
		case 2:
			searchCar();
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("wrong number");

		}
		
	}

	private static void searchCar() {
		print(list, s->true);
	}

	private static void print(List<Car> list, Predicate <Car> c) {
		print(list, c, false);
	}
	
	private static void print(List<Car> list, Predicate<Car> c, boolean isCount) {
		Stream<Car> stream = list.stream();
		AtomicInteger index = new AtomicInteger(1);
		stream
			.filter(c)
			.forEach(s->{
				int num = index.getAndIncrement();
				System.out.println((isCount ? num + ". " : "") + s);	
		});
	}

	private static void addCar() {
		System.out.print("추가할 차 이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("추가할 차 브랜드를 입력하세요 : ");
		String brand = scan.next();
		
		list.add(new Car(name,brand));
		//Car ca = new Car(name, brand);
		//list.add(ca);
		
	}

	private static void printMenu() {
		System.out.println("------------");
		System.out.println("1. 차 추가");
		System.out.println("2. 차 조회");
		System.out.println("3. 종료");
		System.out.println("------------");
		System.out.print("메뉴 선택 : ");
		
	}

}



@Data
@AllArgsConstructor
class Car implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1455289863100321662L;
	private String name;
	private String brand;
	@Override
	public String toString() {
		return name + " - " + brand;
	}
	
	
}