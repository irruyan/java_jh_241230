package day10;

import java.util.HashMap;

public class Ex11_Map {

	public static void main(String[] args) {
		
		// Map 인터페이스 : Key값과 Value값을 관리, Key - 중복불가
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("abc123", "pwabc123");
		map.put("qwe1234", "pwabc123");
		map.put("abc123", "pwqwe1234");
		
		System.out.println(map);
		
		System.out.println(map.get("abc1234"));
		System.out.println(map.get("abc123"));
		System.out.println("----------------");
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("abc"));
		System.out.println(map.containsKey("abc123"));
		System.out.println(map.containsValue("pwabc123"));
		
		System.out.println("삭제 전");
		System.out.println(map);
		System.out.println(map.remove("abc123"));
		System.out.println("삭제 후");
		System.out.println(map);
		
		System.out.println(map.remove("qwe1234"));
		System.out.println(map);

	}

}
