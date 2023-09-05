package chapter13;

import java.util.*;

//생산자 Cook
class Cook2 implements Runnable {
	private Table2 table;

	public Cook2() {}
	public Cook2(Table2 table) {
		this.table = table;
	}

	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum()); //임의의 요리를 하나 선태해서 table에 추가
			table.add(table.dishNames[idx]);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
	}
} //end Cook2

//소비자 Customer2
class Customer2 implements Runnable {
	private Table2 table;
	private String food;

	public Customer2() {}
	public Customer2(Table2 table, String food) {
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();

			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
} //end Customer2

//공유 자원 Table - 진열대 역할
class Table2 {
	String[] dishNames = {"donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>(); //테이블 위의 접시들

	//생산자 메서드 - add
	public synchronized void add(String dish) { //synchronized 추가
		while(dishes.size() >= MAX_FOOD) { //테이블에 요리가 꽉 차 있으면
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting.");
			try {
				wait(); //COOK 스레드를 기다리게 함, lock 반납하고 대기실로
				Thread.sleep(500);
			} catch (InterruptedException e) { }
		}
		dishes.add(dish);
		System.out.println("Dishes: " + dishes.toString());
	}

	//소비자 메서드 - remove
	public void remove(String dishName) {
		synchronized(this) {
			String name = Thread.currentThread().getName();

			//1. 테이블에 음식이 없는 경우
			while(dishes.size() == 0) { //0.5초마다 음식이 추가되었는지 확인, 테이블에 음식이 없으면 소비자가 기다리게
				System.out.println(name + "is waiting.");
				try {
					wait(); //CUST 스레드를 기다리게 함, lock 반납하고 대기실로
					Thread.sleep(500);
				} catch (InterruptedException e) { }
			}
			//2. 테이블에 음식이 있는 경우
			while(true) { //테이블에 음식이 있으면
				for(int i = 0; i < dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify(); //COOK에게 통보, 요리 놓을 자리 있다고 깨우기
						return;
					}
				}

				//3. 테이블에 원하는 음식이 없는 경우
				try {
					System.out.println(name + " is waiting.");
					wait(); //CUST 스레드를 기다리게 함, lock 반납하고 대기실로
					Thread.sleep(500);
				} catch (Exception e) { }
			}

		} //synchronized
	} //end remove()

	public int dishNum() {
		return dishNames.length;
	}
} //end Table2

public class WainNorifyOfThread2 {
	public static void main(String[] args) throws Exception{
		Table2 table = new Table2();

		new Thread(new Cook2(table), "COOK").start();
		new Thread(new Customer2(table, "donut"), "CUST1").start();
		new Thread(new Customer2(table, "burger"), "CUST2").start();

		Thread.sleep(2000);
		System.exit(0);
	}
}
