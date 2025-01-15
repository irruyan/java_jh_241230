package day10;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Ex10_Dictionary {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Word> list = new ArrayList<Word>();

	public static void main(String[] args) {
		/* ----------------
		 * 1. 단어 등록 : apple(사과, 회사명), 이미 등록된 단어입니다.
		 * 2. 단어 수정 : apple(사과, 회사명(애플)), 단어가 수정되었습니다.
		 * 3. 단어 삭제 : apple -> 단어가 삭제되었습니다.
		 * 4. 단어 검색 : a -> apple : 사과, 회사명(애플)
		 * 5. 종료
		 * 
		 */
		
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
			insertWord();
			
			break;
		case 2:
			updateWord();
			
			break;
		case 3:
			deleteWord();
			
			break;
		case 4:
			searchWord();
			
		case 5:
			System.out.println("프로그램 종료");
			break;
		default:
			System.out.println("올바른 메뉴가 아닙니다.");
		}
		
		
	}

	private static void searchWord() {
		// 단어 입력
		System.out.println("단어 : ");
		String word = scan.nextLine();
		int count = 0;
		// 단어장에 있는 단어가 검색 단어를 포함하고 있으면 출력
		for(Word tmp : list) {
			if(tmp.getWord().contains(word)) {
				System.out.println(tmp);
				count++;
			}
		}
		if(count==0) {
			System.out.println("일치하는 단어가 없습니다.");
		}
		
	}

	private static void deleteWord() {
		// 단어를 입력
		System.out.println("단어 : ");
		String word = scan.nextLine();
		// 단어가 있으면 단어를 삭제 후 알림문구 출력
		// 없으면 알림문구 출력
		if(list.remove(new Word(word,""))){
			System.out.println("단어를 삭제했습니다.");
		}
		else {
			System.out.println("일치하는 단어가 없습니다.");
		}
	}

	private static void updateWord() {
		System.out.println("단어 : ");
		String word = scan.nextLine();
	
		System.out.println("뜻 : ");
		String meaning = scan.nextLine();
		
		Word wordObj = new Word(word, meaning);
		
		int index = list.indexOf(wordObj);
		if(index < 0) {
			System.out.println("일치하는 단어가 없습니다.");
			return;
		}
		
		list.set(index, wordObj);
		System.out.println("단어를 수정했습니다.");
		
	}

	private static void insertWord() {
		
		System.out.println("단어 : ");
		String word = scan.nextLine();
		
		System.out.println("뜻 : ");
		String meaning = scan.nextLine();
		
		Word wordObj = new Word(word,meaning);
		
		if(list.contains(wordObj)) {
			System.out.println("이미 등록된 단어입니다.");
			return;
		}
		
		list.add(wordObj);
		System.out.println("단어를 등록했습니다.");
		System.out.println(list);
		
		
		
	}

	private static void printMenu() {
		System.out.println("1. 단어 등록");
		System.out.println("2. 단어 수정");
		System.out.println("3. 단어 삭제");
		System.out.println("4. 단어 검색");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		
	}

}

@Data
@AllArgsConstructor
class Word{
	private String word, meaning;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}

	@Override
	public String toString() {
		return word + " : " + meaning;
	}

}
