package day19;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

public class Ex02_Date {

	public static void main(String[] args) {
		// 다음 문자열이 주어졌을때 문자열이 날짜 형태인지 확인하는 코드
		
		String str1 = "2025-01-27";
		
		String str2 = "25년01월27일";
		
		String str3 = "25-01-32";
		
		System.out.println(isDate1(str1));
		System.out.println(isDate1(str2));
		System.out.println(isDate1(str3));
		System.out.println("-------------");
		System.out.println(isDate2(str1));
		System.out.println(isDate2(str2));
		System.out.println(isDate2(str3));
		System.out.println("-------------");
		System.out.println(isDate3(str1));
		System.out.println(isDate3(str2));
		System.out.println(isDate3(str3));

	}
	
	
	private static boolean isDate3(String str) {
		String [] list = str.split("-");
		if(list.length != 3) {
			return false;
		}
		try {
			if(list[0].length() != 4 || list[1].length() != 2 || list[2].length() != 2) {
				return false;
			}
			int year = Integer.parseInt(list[0]);
			int month = Integer.parseInt(list[1]);
			int day = Integer.parseInt(list[2]);
			
			return true;
			
		}catch(Exception e) {
			return false;
		}
		
	}


	public static boolean isDate2(String str) {
			
		String regex = "^\\d{4}-\\d{2}-\\d{2}$";
		return Pattern.matches(regex, str);
	
	}
	
	//Date 객체를 활용
	public static boolean isDate1(String str) {
		try {
			String [] list = str.split("-");
			if(list.length == 0) {
				return false;
			}
			if(list[0].length() != 0) {
				return false;
			}
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = format.parse(str);
			return true;
			
		}catch(Exception e) {
			return false;
		}
	}

}
