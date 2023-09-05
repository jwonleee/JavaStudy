package chapter13;

public class SynchronizedOfThread {
	public static void main(String[] args) {
		Runnable r = new SynchronizedOfThread_1();
		new Thread(r).start();
		new Thread(r).start();
	}
}

class Account {
	private int balance = 1000; //private으로 해야 동기화 의미 있음
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000); } catch (InterruptedException e) { }
			balance -= money;
		}
	}
} //end Account

class SynchronizedOfThread_1 implements Runnable {
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			//100, 200, 300 중 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance: " + acc.getBalance());
		}
	}
}
