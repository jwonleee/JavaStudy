package chapter13;

import java.util.*;

//생산자 Cook
class Cook implements Runnable {
	private Table table;
	
	public Cook() {}
	public Cook(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		int idx = (int)(Math.random() * table.dishNum()); //임의의 요리를 하나 선태해서 table에 추가
		table.add(table.dishNames[idx]);
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
		}
	}
} //end Cook

//소비자 Customer
class Customer implements Runnable {
	private Table table;
	private String food;
	
	public Customer() {}
	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			if(eatFood()) //음식을 소비
				System.out.println(name + " ate a " + food);
			else
				System.out.println(name + " failed to eat. :(");
		}
	}
	boolean eatFood() {
		return table.remove(food); //테이블에서 음식을 제거
	}
} //end Customer

//공유 자원 Table - 진열대 역할
class Table {
	String[] dishNames = {"donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>(); //테이블 위의 접시들

	//생산자 메서드 - add
	public synchronized void add(String dish) { //synchronized 추가
		if(dishes.size() >= MAX_FOOD) { //ArrayList 찼을 때
			return;
		}
		dishes.add(dish);
		System.out.println("Dishes: " + dishes.toString());
	}

	//소비자 메서드 - remove
	public boolean remove(String dishName) {
		synchronized(this) {

			while(dishes.size() == 0) { //0.5초마다 음식이 추가되었는지 확인
				String name = Thread.currentThread().getName();
				System.out.println(name + "is waiting.");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) { }
			}

			for(int i = 0; i < dishes.size(); i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					return true;
				}
			}

		} //synchronized
		return false;
	} //end remove()
	
	public int dishNum() {
		return dishNames.length;
	}
} //end Table

public class WainNorifyOfThread1 {
	public static void main(String[] args) throws Exception{
		Table table = new Table();
		
		new Thread(new Cook(table), "COOK").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(5000);
		System.exit(0);
	}
}
