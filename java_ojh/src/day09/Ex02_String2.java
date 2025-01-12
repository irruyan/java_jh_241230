package day09;

import java.util.Scanner;

public class Ex02_String2 {

	public static void main(String[] args) {
		/*파일명을 수정하는 기능
		 * 기존 파일명을 입력받고(test.txt)
		 * 수정하려는 파일명을 입력받아(확장자 제외)
		 * 파일명 수정
		 * 
		 * 입력 : test.txt
		 * 수정 : 연습
		 * 결과 : 연습.txt
		 * 
		 * lastIndexOF, substring, replace
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일명을 입력하세요 : ");
		String fileName = scan.nextLine();
		
		System.out.print("파일명을 수정하세요 : ");
		String newFileName = scan.nextLine();
				
		//확장자 찾기
		int index = fileName.lastIndexOf(".");
		
		if (index <0) {
			System.out.println("확장자가 없는 파일명입니다.");
			return;
		}
		
		String oldFileName = fileName.substring(0, index);
		
		fileName = fileName.replace(oldFileName, newFileName);
		
		System.out.println("결과 : " + fileName);
		
	}

}
