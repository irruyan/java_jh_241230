package day15.socket3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex04_Server {

	public static void main(String[] args) {
		int port = 5001;
		
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			
			System.out.println("연결 대기 중");
			
			Socket socket = serverSocket.accept();
			
			System.out.println("연결 성공");
			
			Client c = new Client(socket);
			c.send();
			c.receive();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
