package day10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Ex13_Phone {
	/*
	 * 1. 전화번호 추가 : 동명이인 허용
	 * 2. 전화번호 수정 : 이름과 일치하는 목록을 출력, 수정하려는 전화번호 선택, 새 전화번호를 입력받아 수정
	 * 3. 삭제
	 * 4. 조회 : 이름을 입력, 이름이 포함된 전화번호를 출력
	 */
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<PhoneNumber> list = new ArrayList<PhoneNumber>();
	
	public static void main(String[] args) {
		
		int menu = 0;
		
		
		do {
			printMenu();
			
			menu = scan.nextInt();
			scan.nextLine();
			
			runMenu(menu);
			
			
		}while(menu != 5);

	}

	private static void runMenu(int menu) {
		
		switch(menu) {
		case 1:
			addPhoneNum();
			break;
		case 2:
			updatePhoneNum();
			break;
		case 3:
			deletePhoneNum();
			break;
		case 4:
			searchPhoneNum();
			break;
		case 5:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("올바른 메뉴가 아닙니다.");
		}
		
	}

	private static void addPhoneNum() {
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println("전화번호(예 : 010-0000-0000) : ");
		String phoneNumber = scan.nextLine();
		
		//정규표현식 체크
		String regex = "^\\d{2,3}(-\\d{4}){2}$";
		
		if(!Pattern.matches(regex, phoneNumber)) {
			System.out.println("올바른 번호형식이 아닙니다.");
			return;
		}
		
		PhoneNumber pn = new PhoneNumber(name, phoneNumber);
		list.add(pn);
		System.out.println("전화번호를 등록했습니다.");
		
	}

	private static void updatePhoneNum() {
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		ArrayList<PhoneNumber> tmpList = searchPhoneNumList(name);
		
		for(int i = 0; i < tmpList.size(); i++) {
			System.out.println(i+1 + ". " + tmpList.get(i));
		}
		
		System.out.print("수정할 번호 선택 : ");
		int index = scan.nextInt() - 1;
		scan.nextLine();
		
		PhoneNumber pn = tmpList.get(index);
		
		System.out.println("이름 : ");
		String newName = scan.nextLine();
		System.out.println("전화번호(예 : 010-0000-0000) : ");
		String phoneNumber = scan.nextLine();
		
		pn.update(newName, phoneNumber);
		System.out.println("수정이 완료됐습니다.");
		
	}

	private static void deletePhoneNum() {
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		ArrayList<PhoneNumber> tmpList = searchPhoneNumList(name);
		
		if(!printPhoneNumberList(tmpList, true)) {
			return;
		}
		
		/*
		for(int i = 0; i < tmpList.size(); i++) {
			System.out.println(i+1 + ". " + tmpList.get(i));
		}
		*/
		
		System.out.print("삭제할 번호 선택 : ");
		int index = scan.nextInt() - 1;
		
		PhoneNumber pn = tmpList.get(index);
		
		list.remove(pn);
		System.out.println("전화번호가 삭제 되었습니다.");
		
		
		
	}

	private static ArrayList<PhoneNumber> searchPhoneNumList(String name) {
		
		ArrayList<PhoneNumber> tmpList = new ArrayList<PhoneNumber>();
		
		for(PhoneNumber pn : list) {
			if(pn.getName().contains(name)) {
				tmpList.add(pn);
			}
		}
		
		return tmpList;
	}

	private static void searchPhoneNum() {
		System.out.println("이름 : ");
		String name = scan.nextLine();
		
		ArrayList<PhoneNumber> pList = searchPhoneNumList(name);
		printPhoneNumberList(pList, false);
		
		/*
		for(PhoneNumber pn : list) {
			if(pn.getName().contains(name)) {
				System.out.println(pn);
			}
		}
		*/
	}
	
	private static boolean printPhoneNumberList(ArrayList<PhoneNumber> pList, 
			boolean isNumber) {
		if(pList == null || pList.size() == 0) {
			System.out.println("결과가 없습니다.");
			return false;
		}
		for(int i = 0; i < pList.size(); i++){
			if(isNumber) {
				System.out.print(i+1 + ". ");
			}
			System.out.println(pList.get(i));
		}
		return true;
	}

	private static void printMenu() {
		
		System.out.println("-------------");
		System.out.println("1. 전화번호 추가");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 삭제");
		System.out.println("4. 전화번호 조회");
		System.out.println("5. 프로그램 종료");
		System.out.println("-------------");
		System.out.print("메뉴 선택 : ");
		
	}

}

@Getter
@Setter
@AllArgsConstructor
class PhoneNumber{
	private String name;
	private String phoneNumber;
	@Override
	public String toString() {
		return name + " : " + phoneNumber;
	}
	public void update(String newName, String phoneNumber2) {
		this.name = newName;
		this.phoneNumber = phoneNumber;
		
	}
	
	
	
	
}
