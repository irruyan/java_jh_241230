package day17;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 숫자야구 게임 구현
 * 기록은 서버에 저장, 영문 3자와 횟수를 기록
 * 기록이 같은 경우 먼저 등록된 순으로 순위를 출력
 * 기록은 상위 5명만
 */
public class Ex01_Server {

	public static void main(String[] args) {
		
		// 클라이언트와 네트워크 통신
		int port = 5001;
		
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			
			Socket socket = serverSocket.accept();
			System.out.println("연결 성공");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 *  1. 플레이 기록 추가
		 *   - 클라이언트가 보낸 이니셜과 기록을 저장해서 정렬
		 *   
		 *  2. 플레이 기록 전송
		 *   - 등록된 0번지부터 4번까지의 기록을 전송
		 */
		

	}

}
