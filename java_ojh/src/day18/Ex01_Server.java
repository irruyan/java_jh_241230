package day18;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex01_Server {

	public static void main(String[] args) {
		int port = 5001;
		
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			Socket socket = serverSocket.accept();
			System.out.println("연결 성공");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
