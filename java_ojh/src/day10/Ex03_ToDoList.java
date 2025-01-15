package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03_ToDoList {

	static Scanner scan = new Scanner(System.in);
	
	static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		/*
		 * 1. 할일 등록 -> 1) 등원 / 2) 수업
		 * 2. 할일 삭제 -> 1) 등원 삭제
		 * 3. 할일 조회 -> 1) 수업
		 * 4. 종료
		 * 
		 */
		
		int menu, count = 0;
		do {
			//메뉴 출력
			printMenu();
			
			menu = scan.nextInt();
			scan.nextLine();
			//메뉴 실행
			runMenu(menu);
				
			}while(menu != 4);

	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			insertToDO();
			
			break;
		case 2:
			deleteToDo();
			
			break;
		case 3:
			printToDoList();
			
			break;
		case 4:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("올바른 메뉴가 아닙니다.");
		}
		
	}



	private static boolean printToDoList() {
		if(list.size() == 0) {
			System.out.println("등록된 할 일이 없습니다.");
			System.out.println("**********");
			return false;
		}
		
		// 할일 리스트 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i+1 + ". " + list.get(i));
		}
		return true;
	}

	private static void deleteToDo() {
		// 할일 리스트 출력 -> 번호를 입력 -> 리스트에서 삭제(방법은?)
		if(!printToDoList()) {
			return;
		};
		
		System.out.print("삭제할 할 일의 번호 선택 : ");
		int index = scan.nextInt() - 1;
		
		if(index >= list.size() || index < 0) {
			System.out.println("잘못된 번호 입니다");
			return;
		}
		
		list.remove(index);
		
	}

	private static void insertToDO() {
		
		// 안내문구 출력 -> 할일을 입력 ->할일을 리스트에 추가
		
		System.out.print("할 일 : ");
		String toDo = scan.nextLine();
		list.add(toDo);
		System.out.println("할 일을 등록 했습니다.");
		System.out.println("**********");
		
	}

	private static void printMenu() {
		
		System.out.println("1. 할일 등록");
		System.out.println("2. 할일 삭제");
		System.out.println("3. 할일 조회");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 : ");
		
	}

}
