package chapter7;

public class Exercise7_17 {
	
	public static void main(String[] args) {
		 Unit[] group = {new Marine(), new Tank(), new Dropship()}; // Unit타입 배열 생성 후 각 class별 객체 생성
		 
		 for(int i = 0; i < group.length; i++) {
			 group[i].move(10, 20);
		 }
		
	}
}

abstract class Unit { //상위 클래스
	int x, y; // 공통 속성 x, y
	abstract void move(int x, int y); // class마다 움직인 x, y가 다름(추상메서드로 설정 -> 하위메서드에서 완성해야함)
	void stop() {}; // 공통 메서드
}

class Marine extends Unit {
	void move(int x, int y) { System.out.println(x + "," + y); };
	void stimPack() {};
}

class Tank extends  Unit {
	void move(int x, int y) { System.out.println(x + "," + y); };
	void changeMode() {};
}

class Dropship extends Unit {
	void move(int x, int y) { System.out.println(x + "," + y); };
	void load() {};
	void unload() {};
}