package day20;

import java.util.ArrayList;
import java.util.List;

public class Ex01_Client {

	/*
	 * 쇼핑몰 구현

	 * - 관리자 : admin / admin
	 * - 제품 추가, 수정, 삭제, 입고
	 * - 제품 추가
	 *   - 제품 코드(6자리, ABC001), 분류, 제품명, 옵션, 가격을 등록
	 *   - ABC001, 문구, 볼펜, 빨강, 1천원
	 *   - DEF001, 의류, 셔츠, XL
	 *   - XYZ001, 식품, 우유, 1L
	 *   - 분류는 문구, 의류, 식품, 가전, 기타로 고정
	 *   - 각 분류마다 분류코드가 지정
	 *     - 문구 : ABC, 의류 : DEF, 식품 : XYZ, 가전 : ELC, 기타 : ETC
	 *   - 제품 코드는 분류코드에 등록된 순서 3자리를 만들어서 총 6자리로 고정
	 * - 제품 입고
	 *   - 제품 코드, 수량을 입력해서 제품을 입고
	 * - 제품 구매
	 *  - 로그인한 사용자만 제품 구매 가능, 미 로그인 시 제품 조회 불가
	 *  - 등록된 제품을 선택 후 수량을 선택해서 구매
	 *  - 결제 생략
	 * - 제품 조회
	 *  - 분류를 이용하여 조회
	 * - 회원 가입
	 *  - 아이디, 비번, 비번확인을 입력해서 회원 가입
	 * - 로그인
	 *  - 아이디, 비번을 입력하여 회원이면 제품 조회, 아니면 메인
	 * 
	 * 메인메뉴
	 *  1. 로그인
	 *  2.  회원 가입
	 *  3. 종료
	 * 
	 * 관리자 메뉴(admin으로 로그인 시)
	 *  1. 제품 등록
	 *  2. 제품 수정
	 *  3. 제품 삭제
	 *  4. 제품 입고
	 *  5. 로그아웃
	 * 
	 * 사용자 메뉴(사용자 로그인 시)
	 *  1. 제품 조회
	 *  2. 로그 아웃
	 *  
	 * 제품 조회 메뉴
	 *  1. 문구 / 2. 의류 / 3. 식품 / 4. 가전 / 5. 기타 / 6. 전체 / 7. 이전으로
	 * 
	 */
	
	private static List<Product> list = new ArrayList<Product>();
	
	public static void main(String[] args) {
		
		int menu = 0;
		do {
			
			printMainMenu();
			
			runMainMenu();
			
		}while(menu != 3);
		

	}

	private static void runMainMenu() {
		// TODO Auto-generated method stub
		
	}

	private static void runMainMenu(int menu, Object id, Object pw, Object pwCheck) {
		switch(menu) {
		case 1:
			login();
			break;
		case 2:
			join(id, pw, pwCheck);
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
	}

	private static void join(Object id, Object pw, Object pwCheck) {
		//아이디, 비번, 비번확인 입력
		System.out.print("아이디를 입력하세요 : ");
		
		System.out.print("비번을 입력하세요 : ");
		
		System.out.print("비번확인을 입력하세요 : ");
		
		
	}

	private static void login() {
		// 아이디, 비번 입력
		System.out.print("아이디를 입력하세요 : ");
		
		System.out.print("비번을 입력하세요 : ");
		
	}

	private static void printMainMenu() {
		
		System.out.println("----------");
		System.out.println("1. 로그인");
		System.out.println("2. 회원 가입");
		System.out.println("3. 종료");
		System.out.println("----------");
		
	}

}
