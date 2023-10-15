package chapter14;

@FunctionalInterface
interface MyFunction {
	void run();
}

public class LamdaBasicTest{
	//execute 메서드의 매개변수로 람다식을 받겠다
	static void execute(MyFunction f) {
		f.run();
	}
	
	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		//람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 함
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() {
			@Override
			public void run() { //오버라이딩 - 접근제어자는 좁게 못 바꿈
				System.out.println("f2.run()");
			}
		};
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute( () -> System.out.println("run()") );
	}

}
