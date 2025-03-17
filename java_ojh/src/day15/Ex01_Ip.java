package day15;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex01_Ip {

	public static void main(String[] args) {
		// InetAdress 클래스 예제
		
		// 내부 IP 주소
		try {
			InetAddress address = InetAddress.getByName("localhost");
			System.out.println(address);
			
			address = InetAddress.getByName("www.naver.com");
			System.out.println(address);
			
			InetAddress [] list = InetAddress.getAllByName("www.naver.com");
			System.out.println(Arrays.toString(list));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
