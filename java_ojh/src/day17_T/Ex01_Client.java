package day17_T;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ex01_Client {
	
	static private Scanner scan = new Scanner(System.in);
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//서버와 연결
		String ip = "192.168.40.3";
		int port = 5002;
		Socket socket;
		ObjectOutputStream oos;
		ObjectInputStream ois;
		
		try {
			socket = new Socket(ip, port);
			System.out.println("연결 성공");
			//IO스트림
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (Exception e) {
			System.out.println("서버연결 실패");
			System.out.println("프로그램을 종료합니다.");
			return;
		} 
				
		int menu;
		do {
			printMenu();
			
			menu = scan.nextInt();
			
			runMenu(menu, oos, ois);
			
		}while(menu != 3);

	}
	
	private static void runMenu(int menu, ObjectOutputStream oos, ObjectInputStream ois) {
		switch(menu) {
		case 1:
			//io스트림을 넘겨줌
			play(ois, oos);
			break;
		case 2:
			//io스트림을 넘겨줌
			recordView(ois, oos);
			break;
		case 3:
			System.out.println("program has done");
			break;
		default:
			System.out.println("wrong number");
		}
	}
	

	private static void play(ObjectInputStream ois, ObjectOutputStream oos) {
		
		//랜덤 리스트 생성
		List<Integer> nums = randomList(1, 9, 3);
		
		Record r = playGame(nums);
		
		//서버에 전송
		sendRecord(r, ois, oos);
	}

	private static void sendRecord(Record r, ObjectInputStream ois, ObjectOutputStream oos) {
		try {
			// 메뉴 전송
			oos.writeInt(1);
			// 기록 전송
			oos.writeObject(r);
			oos.flush();
			//서버에게 결과를 확인받고 실패한 경우 알림
			boolean res = ois.readBoolean();
			if(!res) {
				System.out.println("결과가 기록되지 않았습니다.");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static List<Integer> randomList(int min, int max, int size) {
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() < size) {
			set.add(random(min, max));
		}
		list.addAll(set);
		Collections.shuffle(list);
		System.out.println(list);
		
		return list;
	}

	private static void recordView(ObjectInputStream ois, ObjectOutputStream oos) {
		try {
			//메뉴를 서버에 전송
			oos.writeInt(2);
			oos.flush();
			// 전송받은 기록 리스트를 받아옴
			List<Record> list = (List<Record>) ois.readObject();
			// 받아온 기록 리스트를 출력
			printRecords(list);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void printRecords(List<Record> list) {
		if(list == null || list.isEmpty()) {
			System.out.println("등록된 기록이 없습니다");
			return;
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ". " + list.get(i));
		}
		
	}

	private static void printMenu() {
		System.out.println("-------");
		System.out.println("1. Play Game");
		System.out.println("2. Record");
		System.out.println("3. Exit");
		
	}

	public static Record playGame(List<Integer> nums) {
		int strike, ball;
		List<Integer> user = new ArrayList<Integer>();
		int count = 0;
		
		do {
			user.clear();
			System.out.print("입력 : ");
			
			while(user.size() < 3) {
				user.add(scan.nextInt());
			}
			++count;
			
			strike = getStrike(nums, user);
			
			ball = getball(nums, user);
			
			printResult(strike, ball);
			
		}while(strike < 3);
		
		//닉네임 입력
		System.out.println("이니셜 입력(최대 3자) : ");
		String nickName = scan.next();
		return new Record(count, nickName);
	}
	
	private static void printResult(int strike, int ball) {
		if(strike != 0) {
			System.out.print(strike + "S");
		}
		
		if(ball != 0) {
			System.out.print(ball + "B");
		}
		
		if(strike == 0 && ball == 0) {
			System.out.println("Out");
		}
		System.out.println();
		
	}

	private static int getball(List<Integer> nums, List<Integer> user) {
		int count = 0;
		for(int num : nums) {
			if(user.contains(num)) {
				count++;
			}
		}
		return count - getStrike(nums, user);
	}

	private static int getStrike(List<Integer> nums, List<Integer> user) {
		int count = 0;
		for(int i = 0; i < nums.size(); i++) {
			if(nums.get(i) == user.get(i)){
				count++;
			}
		}
		return count;
	}

	private static int random(int min, int max) {
		if(max < min) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random() * (max - min + 1) + min);
	}

}
