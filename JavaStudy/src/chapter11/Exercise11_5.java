package chapter11;

import java.util.*;

class Student implements Comparable { //this와 매개변수 비교
	String name;
	int ban;
	int no;
	int kor, eng, math;

	Student(String name, int ban, int no, int kor, int eng, int math) { //전부있는 생성자
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() { //총계 메서드
		return kor + eng + math;
	}

	float getAverage() { //평균 메서드
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() { //값확인 메서드
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}

	public int compareTo(Object o) { //비교메서드
		
		if(o instanceof Student) { //형변환 여부 확인, 왼쪽에는 참조변수를 오른쪽에는 타입(클래스명)이 피연산자로 위치
			Student s = (Student)o; //Student 타입으로 매개변수를 형변환해줌(줄여줌)
			return this.name.compareTo(s.name); //현재 이름과 매개변수의 이름 비교 (오름차순 = 작은값 -> 큰값, ㄱ -> ㅎ)
		} else {
			return -1; // 아니면 내림차순
		}

		
	}
}

public class Exercise11_5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("홍길동", 1, 1, 100, 100, 100));
		list.add(new Student("남궁성", 1, 2, 90, 70, 80));
		list.add(new Student("김자바", 1, 3, 80, 80, 90));
		list.add(new Student("이자바", 1, 4, 70, 90, 70));
		list.add(new Student("안자바", 1, 5, 60, 100, 80)); //객체 홍길동-남궁성-김자바-이자바-안자바 순서로 담음
		
		Collections.sort(list); // list에 저장된 요소들을 정렬한다.(compareTo()호출 하면서 객체자신과 매개변수 비교함)
		
		
		Iterator it = list.iterator();

		while (it.hasNext())
			System.out.println(it.next());

	}
}
