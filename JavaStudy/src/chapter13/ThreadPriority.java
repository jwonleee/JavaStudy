package chapter13;

public class ThreadPriority {
	public static void main(String[] args) {
		ThreadPriority_1 th1 = new ThreadPriority_1();
		ThreadPriority_2 th2 = new ThreadPriority_2();
		
		th2.setPriority(7);
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		
		th1.start();
		th2.start();
	}
} //end main

class ThreadPriority_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("-");
			for(int x = 0; x < 100000000; x++); //시간 지연용 for문
		}
	}
} //end ThreadPriority_1

class ThreadPriority_2 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print("|");
			for(int x = 0; x < 100000000; x++);
		}
	}
} //end ThreadPriority_2
