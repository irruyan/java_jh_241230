package day17_T;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Server {
	
	private Socket socket;
	private List<Record> list;
	
	public void run() {
		Thread t = new Thread(()->{
			try {
					ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
					ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
					System.out.println("연결 성공");
					
				while(true) {
					//메뉴를 입력받음(클라이언트에게)
					int menu = ois.readInt();
					//메뉴에 따라 기능을 실행
					runMenu(menu, ois, oos);
				}
				
			}catch(Exception e) {
				System.out.println("연결 해제");
			}
			});
			t.start();
			
			
	}
	
	private void runMenu(int menu, ObjectInputStream ois, ObjectOutputStream oos) {
		switch(menu) {
		case 1:
			insertRecord(ois, oos);
			break;
		case 2:
			recordView(ois, oos);
			break;
		}
	}
	
	
	private void insertRecord(ObjectInputStream ois, ObjectOutputStream oos) {
		try {
				// 기록을 수신
				Record r = (Record) ois.readObject();
				//기록을 추가
				boolean res = list.add(r);
				
				//기록을 정렬
				Collections.sort(list,(o1, o2)->{
					Record r1 = (Record)o1;
					Record r2 = (Record)o2;
					if(r1.getCount() != r2.getCount()) {
						return r1.getCount() - r2.getCount();
					}
					if(r1.getDate().equals(r2.getDate())) {
						return r1.getDate().compareTo(r2.getDate());
					}
					return r1.getNickName().compareTo(r2.getNickName());
				});
			
				oos.writeBoolean(res);
				oos.flush();
				System.out.println(list);
				
		} catch (Exception e) {
			System.out.println("기록 추가 시 예외 발생");
		}
		
	}

	private void recordView(ObjectInputStream ois, ObjectOutputStream oos) {
		//클라이언트에게 기록 리스트를 전송(최대 5개)
		try {
			int min = Math.min(5, list.size());
			List<Record> tmpList = list.subList(0, min);
			List<Record> sendList = new ArrayList<Record>();
			sendList.addAll(tmpList);
			oos.writeObject(sendList);
			oos.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
			

}
