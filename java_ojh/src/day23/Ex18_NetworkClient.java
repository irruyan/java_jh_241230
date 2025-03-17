package day23;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex18_NetworkClient {

	public static void main(String[] args) {
		// ip, port 설정
		String ip = "192.168.40.52";
		int port = 3001;
		//ip, port를 이용하여 소켓을 생성
		try {
			Socket socket = new Socket(ip, port);
			//데이터를 주고 받음
			ObjectOutputStream oos = 
					new ObjectOutputStream(socket.getOutputStream());
			oos.writeUTF("hi");
			oos.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
