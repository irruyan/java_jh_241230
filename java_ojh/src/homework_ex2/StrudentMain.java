package homework_ex2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StrudentMain {

	/*
	 * 학생 성적 관리 프로그램을 작성하세요.
	 * 1. 학생 등록
	 *  - 학년, 반, 번호, 이름
	 *  - 키(학년, 반, 번호) 동일하면 등록하지 않음
	 * 2. 학생 수정
	 *  - 키를 입력받아 학생이 있는지 찾고, 있으면 수정
	 *  - 수정하는 정보는 학년, 반, 번호, 이름을 수정
	 *  - 이미 등록된 학생 정보(1, 1, 1 오준호)에 다른 사람을 입력하지 못하게 막음
	 * 3. 학생 삭제
	 *  - 학년, 반, 번호를 입력받아 학생이 있는지 찾고 있으면 삭제
	 * 4. 과목 등록
	 *  - 학년, 학기, 과목명을 입력받아 없으면 등록
	 * 5. 과목 수정
	 *  - 학년, 학기, 과목을 입력받아 있으면 학년, 학기, 과목을 입력받아 수정
	 *  - 수정하려는 과목이 이미 등록된 과목이면 수정하지 않음
	 * 6. 과목 삭제
	 * 7. 성적 등록
	 * 8. 성적 수정
	 * 9. 성적 삭제
	 * 10. 학생 조회
	 * 11. 과목 조회
	 * 12. 성적 조회
	 */
	
	//등록된 과목을 관리할 과목 리스트
			static ArrayList<Subject> subjectList = new ArrayList<Subject>();
			//등록된 학생을 관리할 학생 리스트
			static ArrayList<Student> studentList = new ArrayList<Student>();
			//입력을 위한 Scanner
			static Scanner scan = new Scanner(System.in);
			
	public static void main(String[] args) {
		
		int menu = 0; //예외처리 때문에 초기화를 해야 함.
			
		do {
			//메뉴 출력
			printMenu();
				
			try {
				//메뉴 선택
				menu = scan.nextInt();
					//메뉴 실행
				runMenu(menu);
				}
				//입력 타입이 안 맞는 경우
				catch(InputMismatchException e) {
					System.out.println("올바른 입력이 아닙니다!");
					scan.nextLine();//잘못 입력한 값을 입력 버퍼에서 지우기 위함
				}
				
			}while(menu != 13);

		
	}
	
	private static void printMenu() {

		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 과목 등록");
		System.out.println("5. 과목 수정");
		System.out.println("6. 과목 삭제");
		System.out.println("7. 성적 등록");
		System.out.println("8. 성적 수정");
		System.out.println("9. 성적 석제");
		System.out.println("10.학생 조회");
		System.out.println("11.과목 조회");
		System.out.println("12.성적 조회");
		System.out.println("13.종료");
		System.out.print("메뉴 선택 : ");
		
	}
	
	
	private static void runMenu(int menu) {

		switch(menu) {
		case 1:
			System.out.println("학생 등록 기능 구현 예정");
			break;
		case 2:
			System.out.println("학생 수정 기능 구현 예정");
			break;
		case 3:
			System.out.println("학생 삭제 기능 구현 예정");
			break;
		case 4:
			System.out.println("과목 등록 기능 구현 예정");
			break;
		case 5:
			System.out.println("과목 수정 기능 구현 예정");
			break;
		case 6:
			System.out.println("과목 삭제 기능 구현 예정");
			break;
		case 7:
			System.out.println("성적 등록 기능 구현 예정");
			break;
		case 8:
			System.out.println("성적 수정 기능 구현 예정");
			break;
		case 9:
			System.out.println("성적 삭제 기능 구현 예정");
			break;
		case 10:
			System.out.println("학생 조회 기능 구현 예정");
			break;
		case 11:
			System.out.println("과목 조회 기능 구현 예정");
			break;
		case 12:
			System.out.println("과목 사제 기능 구현 예정");
			break;
		case 13:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("올바른 메뉴가 아닙니다.");
			break;
		}
		
	}

}
