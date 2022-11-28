package chapter7;

public class Exercise7_18 {

	public static void action(Robot r) { //static 필수
		if(r instanceof DanceRobot) { //true, 형변환 가능하면
			DanceRobot a = (DanceRobot)r; //매개변수 상위클래스 r을 하위클래스 a에 넣음
			a.dance(); //DanceRobot형 참조변수로 dance()메서드 부르기
		} else if(r instanceof SingRobot) {
			SingRobot b = (SingRobot)r;
			b.sing();
		} else if(r instanceof DrawRobot) {
			DrawRobot c = (DrawRobot) r;
			c.draw();
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	} // main
}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}