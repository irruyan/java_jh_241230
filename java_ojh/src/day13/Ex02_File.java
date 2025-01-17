package day13;

import java.io.File;
import java.io.IOException;

public class Ex02_File {

	public static void main(String[] args) {
		
		//String fileName = "D:\\test\\test.txt";
		String fileName = "src/day13/test.txt";
		
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("존재");
			
			if(file.isDirectory()) {
				System.out.println("폴더");
			}
			
			else if(file.isFile()) {
				System.out.println("file");
			}
			
			System.out.println("파일명(폴더) : " + file.getName());
			System.out.println("절대 경로 : " + file.getAbsolutePath());
			System.out.println("상대 경로 : " + file.getPath());
			
			if(file.delete()) {
				System.out.println("파일 삭제 완료");
			}
			else {
				System.out.println("파일을 삭제하지 못함");
			}
			return;
		}
		System.out.println("존재하지 않음");
		
		
		
		/*if(file.mkdir()) {
			System.out.println("폴더가 생성됨");
		}
		else {
			System.out.println("폴더가 이미 있거나 생성 실패");
		}*/
		
		try {
			if(file.createNewFile()) {
				System.out.println("파일을 생성했습니다");
			}
			else {
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {
			System.out.println("예외 발생");
		}

	}

}
