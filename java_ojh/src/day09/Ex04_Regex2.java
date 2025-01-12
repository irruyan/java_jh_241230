package day09;

import java.util.regex.Pattern;

public class Ex04_Regex2 {

	public static void main(String[] args) {
		/*
		 * 아이디가 주어진 조건에 맞는지 확인하는 코드
		 * 조건 : 숫자 또는 영문 또는 특수문자로 이루어져있다
		 * 아이디는 최소 8자에서 13자 이다.
		 */
		
		String Id = "abc1231234";
		String regex = "[a-zA-Z0-9!@#$]{8,13}";
		
		if(Pattern.matches(regex, Id)) {
			System.out.println(Id + " is available");
		}
		else {
			System.out.println(Id + " is not available");
		}

	}

}
