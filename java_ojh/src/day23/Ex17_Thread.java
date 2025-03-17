package day23;

public class Ex17_Thread {

	public static void main(String[] args) {
		//쓰레드를 이용하여 +를 100번 출력하는 쓰레드를 생성해서 실행,
		// -를 100번 출력하는 쓰레드를 생성하고 실행
		
		myThread th = new myThread();
		th.start(); // run은 단순 메소드 호출임, 스레드를 생성하지 않음
		Thread th2 = new Thread(new myThread2());
		th2.start();
		Thread t3 = new Thread(()->{
			for(int i = 1; i <= 100; i++) {
				System.out.print("=");
			}
		});
		t3.start();

	}

}

class myThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.print("+");
		}
	}
}

class myThread2 implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.print("-");
		}
	}

}