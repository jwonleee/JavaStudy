package chapter7;

class Outer3 {
	int value = 10;

	class Inner {
		int value = 20;

		void method1() {
			int value = 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer3.this.value);
		}
	} // Inner클래스의 끝
} // Outer클래스의 끝

public class Exercise7_27 {

	public static void main(String[] args) {

		Outer3 o3 = new Outer3();
		Outer3.Inner inner = o3.new Inner();
		
		inner.method1();
	}
}
