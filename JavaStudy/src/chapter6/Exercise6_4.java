package chapter6;

public class Exercise6_4 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
	}
	
}

class Student1 { //1 지우고 보기
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student() { //기본 생성자
		
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		return (float)(Math.round((getTotal() / 3f) * 10) / 10.0) ;
	}
//		(getTotal() / 3f) * 10 = 78.66666
//		Math.round((getTotal() / 3f) * 10) = 787.0
//		(float)(Math.round((getTotal() / 3f) * 10) / 10.0 = 78.7
//		전체적으로 float 형변환 필요
	
}
