package day15.socket3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import lombok.AllArgsConstructor;


//Client 클래스를 이용하여 서버와 클라이언트가 문자열을 주고 받는 예제
@AllArgsConstructor
public class Client {
	
	private Socket socket;
	
	private final static String EXIT = "EXIT";
	
	public void receive() {
		Thread t2 = new Thread(()->{
			try {
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				while(true) {
					String str = ois.readUTF();
					System.out.println("수신 : " + str);
					if(str.equals(EXIT)) {
						break;
					}
				}
				System.out.println("수신 기능을 종료합니다.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		t2.start();
	}
	
	public void send() {
		Thread t1 = new Thread(()->{
			Scanner scan = new Scanner(System.in);
			
			try {
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

				while(true) {
					
					System.out.println("입력(종료 : " + EXIT + ") : ");
					String str = scan.nextLine();
					
					oos.writeUTF(str);
					oos.flush();
					
					if(str.equals(EXIT)) {
						break;
					}
					
				}
				System.out.println("전송 기능을 종료합니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}
		});
		t1.start();
	}

}
