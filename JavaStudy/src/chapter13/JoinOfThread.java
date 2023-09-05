package chapter13;

public class JoinOfThread {
	static long startTime = 0;
	
	public static void main(String[] args) {
		JoinOfThread_1 th1 = new JoinOfThread_1();
		JoinOfThread_2 th2 = new JoinOfThread_2();
		
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis(); //시작 시간
		
		try {
			th1.join(); //main스레드가 th1의 작업이 끝날 때까지 기다림
			th2.join(); //main스레드가 th2의 작업이 끝날 때까지 기다림
		} catch (InterruptedException e) {	}
		
		System.out.print("소요시간: " + (System.currentTimeMillis() - JoinOfThread.startTime)); //종료 시간
	}
}

class JoinOfThread_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	}
} //end JoinOfThread_1

class JoinOfThread_2 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	}
} //end JoinOfThread_2
