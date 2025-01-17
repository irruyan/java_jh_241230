package day13;

public class Ex04_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 th1 = new MyThread1();
		//th1.start();
		th1.run();
		
		Thread th2 = new Thread(new MyThread2());
		//th2.start();
		th2.run();
		
		Thread th3 = new Thread(()->{
			for(int i = 0; i<10000; i++) {
				System.out.print("*");
			}
		});
		th3.start();
		
		for(int i = 0; i < 10000; i++) {
			System.out.print("|");
		}
	}

}

class MyThread1 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.print("-");
		}
	}
}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10000; i++) {
			System.out.print("+");
		}
		
	}
	
}