package chapter13;

public class SleepOfThread {
	public static void main(String[] args) {
		SleepOfThread_1 th1 = new SleepOfThread_1();
		SleepOfThread_2 th2 = new SleepOfThread_2();
		
		th1.start();
		th2.start();
		
		try {
			th1.sleep(2000);
		} catch (InterruptedException e) {}
		
		System.out.print("<<main 종료>>");
	}// end main
}

class SleepOfThread_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 종료>>");
	}
} //end SleepOfThread_1

class SleepOfThread_2 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.print("<<th2 종료>>");
	}
} //end SleepOfThread_2
