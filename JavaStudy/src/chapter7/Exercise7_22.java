package chapter7;

abstract class Shape { //추상클래스 shape
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}


class Circle extends Shape {
	double r; //반지름
	
	Circle(double r) { //하위클래스 Circle의 생성자 초기화
		this(new Point(0, 0), r);
	}
	
	Circle(Point p, double r) { //상위 클래스 멤버는 상위 생성자가 초기화/
		super(p);
		this.r = r;
	}
	
	double calcArea() { //원의 면적을 구하는 메서드
		return Math.PI * r * r;
	}
}


class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(double width, double height) {
		this(new Point(0,0), width, height);
	}

	public Rectangle(Point p, double width, double height) {
		// TODO Auto-generated constructor stub
		super(p);
		this.width = width;
		this.height = height;
	}
	
	
	boolean isSquare () {
		if(width == height) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	double calcArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
}




class Point { // Point 클래스
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}

	
}

//메인 클래스
public class Exercise7_22 {
	
	static double sumArea(Shape[] arr) {
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		

		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적의 합:" + sumArea(arr));

		
	}
}
