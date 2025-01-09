package day07;

import java.util.Scanner;

public class Ex05_StudentScore2 {

	public static void main(String[] args) {
		/* 학생 성적 관리 프로그램
		 Student 클래스 작성
		 *
		 * 1. 학생 성적 추가
		 * 2. 학생 성적 조회
		 * 3. 학생 성적 수정
		 * 4. 학생 성적 삭제
		 * 5. 종료
		 * 
		 * 메뉴 선택 : 1
		 * 학년 : 1 / 반 : 1 / 번호 : 1 / 이름 : 홍길동
		 * 과목 : 국어 / 성적 : 100
		 * 
		 * 메뉴 선택 : 2
		 * 1학년 1반 1번 홍길동 국어 : 100
		 * 
		 * 메뉴 선택 : 3
		 * 수정할 학생 정보를 입력하세요.
		 * 학년 : 1 / 반 : 1 / 번호 : 1 / 과목 : 국어
		 * 수정할 성적을 입력하세요.
		 * 성적 : 95
		 * 성적이 수정되었습니다.
		 * 과목이 없거나 학생 정보가 없습니다.
		 * 
		 */
		
		//메뉴를 4를 입력하기 전까지 반복해서 출력
		
		Scanner scan = new Scanner(System.in);
		int menu, count = 0;
		//학생 성적을 관리하기 위한 배열 선언
		Student[] list = new Student [10];
		//0번지에 1학년 1반 1번 홍길동 국어 100을 가지는 객체를 저장
		list[count] = new Student(1, 1, 1, "홍길동", "국어", 100);
		count++;
		
		do {
			System.out.println("------메뉴------\r\n"
					 + "1. 성적 입력\r\n"
					 + "2. 성적 조회\r\n"
					 + "3. 성적 수정\r\n"
					 + "4. 성적 삭제\r\n"
					 + "5. 프로그램 종료\r\n"
					 + "메뉴 선택 : ");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				// 학년, 반, 번호, 이름, 과목, 성적 입력
				System.out.print("학년 : ");
				int grade = scan.nextInt();
				System.out.print("반 : ");
				int classNum = scan.nextInt();
				System.out.print("번 : ");
				int num = scan.nextInt();
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("과목 : ");
				String subject = scan.next();
				System.out.print("성적 : ");
				int score = scan.nextInt();
				//입력받은 정보를 이용해서 객체를 생성하는 코드
				Student tmp = new Student(grade, classNum, num, name, subject, score);
				//grade, classNum, num, subject가 일치하는 정보가 list에 있는지
				
				
				if(indexOf(list, count, grade, 
						classNum, num, subject) >= 0) {
					System.out.println("이미 등록된 학생 성적입니다.");
				}else {
					System.out.println("학생 성적을 추가했습니다.");
				}
				
				list[count++] = tmp;
				
				break;
			case 2:
				System.out.println("학생 성적을 조회합니다.");
				/* 0번지부터 count-1번지까지 1씩 증가하면서 list에 있는
				 * 학생 정보를 출력하는 코드
				 */
				for(int i = 0; i < count; i++) {
					list[i].print();
				}
				break;
			case 3:
				System.out.println("수정할 학생 정보 입력 : ");
				System.out.print("학년 : ");
				grade = scan.nextInt();
				System.out.print("반 : ");
				classNum = scan.nextInt();
				System.out.print("번 : ");
				num = scan.nextInt();
				System.out.print("과목 : ");
				subject = scan.next();
				System.out.println("수정할 성적 입력 : ");
				System.out.print("성적 : ");
				score = scan.nextInt();
				int index = indexOf(list, count, grade, classNum, num, subject);
				/* 0번지부터 count-1번지까지 list에서 하나씩 꺼내서
				 * list에 정보와 위에서 입력받은 값이 같으면
				 * index에 해당 번지를 저장하고 break
				 */
				
				if(indexOf(list, count, grade, 
						classNum, num, subject) >= 0) {
					//index 번지에 있는 학생의 성적을 입력받은 새 성적으로 수정
					list[index].setScore(score);
					System.out.println("수정 완료");
				}else {
					System.out.println("학생 정보 오류 : 일치하는 정보 없음");
				}
				break;
			case 4:
				// 입력
				System.out.println("삭제할 학생 정보 입력 : ");
				System.out.print("학년 : ");
				grade = scan.nextInt();
				System.out.print("반 : ");
				classNum = scan.nextInt();
				System.out.print("번 : ");
				num = scan.nextInt();
				System.out.print("과목 : ");
				subject = scan.next();
				
				// 삭제할 정보가 있는 번지를 찾음
				index = indexOf(list, count, grade, classNum, num, subject);
				
				// 삭제할 학생 정보가 있는 경우
				if(index >= 0) {
					// index 다음에 있는 데이터들을 한칸씩 당겨줌
					// index가 마지막이 아닐 때 한칸씩 당겨줌
					/*if(index != count - 1) {
						Student [] arr = new Student[list.length];
						System.arraycopy(list, 0, arr, 0, count);
						System.arraycopy(list, index+1, arr, index, count - index - 1);
						list = arr;
					}*/
					for(int i = index; i < count -1 ; i++) {
						list[i] = list[i + 1];
					}
					// 개수를 1 감소
					count--;
				}
				else {
					System.out.println("학생 정보 오류 : 일치하는 정보 없음");
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default :
				System.out.println("잘못된 입력");
			}
		}while(menu != 5);
	}
	
	
	//list 와 비교하여 일치하는 정보가 있는지 확인하는 메소드
	public static int indexOf(Student [] list, int count, 
			int grade, int classNum, int num, String subject) {
		
		for(int i = 0; i < count; i++) {
			if(list[i].equal(grade, classNum, num, subject)){
				return i;
			}
		}
		return -1;
		
	}

}


