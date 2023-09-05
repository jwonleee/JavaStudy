package chapter13;

public class ThreadCreate {
	public static void main(String[] args) {
		ThreadCreate_1 t1 = new ThreadCreate_1();
		
		Runnable r = new ThreadCreate_2();
		Thread t2 = new Thread(r);
		//Thread t2 = new Thread(new ThreadCreate_2()); 한줄로
		
		t1.start();
		t2.start();
	}
} //end main

class ThreadCreate_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}
} //end ThreadCreate_1

class ThreadCreate_2 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			//currentThread() - 현재 실행중인 쓰레드의 참조 반환
			//getName() - 쓰레드의 이름 반환
		}
	}
} //end ThreadCreate_2
