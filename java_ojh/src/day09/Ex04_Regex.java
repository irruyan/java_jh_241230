package day09;

import java.util.regex.Pattern;

public class Ex04_Regex {

	public static void main(String[] args) {
		
		// 문자열이 숫자로만 되어 있는지 확인
		String str = "0012312a3";
		String regex = "^\\d+$";
		if(Pattern.matches(regex, str)) {
			System.out.println(str + " is only for numbers");
		}
		else {
			System.out.println(str + " has not only numbers");
		}
		

	}

}
