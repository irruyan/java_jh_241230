package day24_Test;

import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		
		int port = 3000;
		String serverIP;
		try {
			serverIP = "192.168.20.34";
			
			Socket socket = new Socket(serverIP, port);
			System.out.println("연결");
			
		}catch(Exception e){
			
		}

	}

}
