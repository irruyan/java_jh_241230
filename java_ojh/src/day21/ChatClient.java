package day21;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.List;
import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ChatClient {
	
	private String id;
	private Socket socket;
	private List<Chat> list;
	
	private final String exit = "exit";
	
	public void receive() {
		Thread t = new Thread(()->{
			try (ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {
				
				while(true) {
					//문자열 대신 Chat 객체를 받고
					Chat chat = (Chat) ois.readObject();
					//채팅 내용이 exit와 같으면 종료
					if(chat.getChat().equals(exit)) {
						break;
					}
					//받은 객체를 출력
					System.out.println(chat);
					//객체를 채팅 내역에 추가
					list.add(chat);
				}
			} catch (SocketException e) {
				System.out.println("상대방이 나갔습니다. 종료하려면 " + exit + "를 입력하세요.");
			} catch (Exception e) {
				
			}
		});
		t.start();
	
	}
	
	public void send() {
		
		Scanner scan = new Scanner(System.in);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream()))	{
			
			System.out.println("채팅을 시작합니다.");
			System.out.println("종료하려면 exit 를 입력하세요.");
			while(true) {
				if(socket == null || socket.isClosed()) {
					throw new SocketException();
				}
				String str = scan.nextLine();
				//문자열이 아닌 Chat의 객체를 전송
				Chat chat = new Chat(id, str);
				oos.writeObject(chat);
				oos.flush();
				if(str.equals(exit)) {
					break;
				}
				//채팅 기록에 추가
				list.add(null);
			}
			}catch(Exception e) {
				//e.printStackTrace();
			} finally {
				System.out.println("채팅을 종료합니다.");
			}
			
		}
	
	public void run() {
		
		//send 와 receive를 이용하여 호출
		receive();
		send();
		
	}
	
	
	

}
