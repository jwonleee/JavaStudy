package chapter13;

public class DaemonThread implements Runnable{
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		Thread t = new Thread(new DaemonThread());
		t.setDaemon(true); //데몬 스레드 지정
		t.start();
		
		//main 스레드 - 1부터 10까지 카운트하는 루프를 실행
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
				System.out.println(i);
				if(i == 5) autoSave = true;
		}
	} //end main

	//daemon 스레드
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3 * 1000); //3초마다 변수 autoSave 값을 인하여 autoSave() 메서드 호출
			} catch (InterruptedException e) { }
				//autoSave값이 true이면 autoSave 호출
				if(autoSave) autoSave();
		}
	} //end run
	
	public void autoSave() {
		System.out.println("작업파일이 자동저장 되었습니다.");
	}
}