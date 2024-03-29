package chapter11;

import java.util.*;

class Student2 { //다시보기
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int total; //총점
	int schoolRank; //전교등수
	
	
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor+eng+math;
	}

	int getTotal() {
		return total;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}


	public int compareTo(Object o) {
		if(o instanceof Student2) { //형변환 가능여부 확인
			Student2 st = (Student2) o; //캐스팅
			return st.getTotal() - this.getTotal(); // 총점기준 내림차순 정렬
			//this.getTotal() - st.getTotal() 은 오름차순 정렬
		} else {
			return -1;
		}
	}
	
	public String toString()   {
		return   name 
		+","+ban 
		+","+no 
		+","+kor 
		+","+eng 
		+","+math
		+","+getTotal()
		+","+getAverage()
		+","+schoolRank    // 새로추가 
		;
	}
	
	
	
} // class Student

public class Exercise11_8 {

	public static void calculateSchoolRank(List list) { 
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다. 정렬할 때 compareTo메서드 실행됨
		
		int prevRank = -1; //이전 전교등수
		int prevTotal = -1; //이전 총점
		int length = list.size();
	
		/*
		(2) 아래의 로직에 맞게 코드를 작성하시오.
		1. 반복문을 이용해서 list에 저장된 Student 객체를 하나씩읽는다.
		1.1 총점(total)이 이전총점(prevTotal)과 같으면 이전 등수(prevRank)를 등수(schoolRank)로 한다.
		1.2 총점이 서로 다르면, 등수(schoolRank)의 값을 알맞게 계산해서 저장한다.
		    이전에 동점자 였다면, 그 다음 등수는 동점자의 수를 고려해야 한다. (실행결과 참고)
		1.3 현재 총점과 등수를 이전총점(prevTotal)과 이전등수(prevRank)에 저장한다.
		*/
		
		for(int i = 0; i < length; i++) {
			Student2 s = (Student2)list.get(i); //Student2 객체 하나씩 꺼냄
			
			if(s.total == prevTotal) { //값이 같으면
			   s.schoolRank = prevRank; //schoolRank는 이전 랭크값이랑 같지만, i+1은 나옴
			} else {
				s.schoolRank =  i + 1; //다시 생각해보기!!!A.......
			}
			
			prevRank = s.schoolRank; //현재등수를 이전 등수에 저장
			prevTotal = s.total; //현재총점을 이전 총점에 저장
		}
		
		
		
	}
	
	public static void main(String[] args) {
		ArrayList<Student2> list = new ArrayList<>();
		list.add(new Student2("이자바", 2, 1, 70, 90, 70));
		list.add(new Student2("안자바", 2, 2, 60, 100, 80));
		list.add(new Student2("홍길동", 1, 3, 100, 100, 100));
		list.add(new Student2("남궁성", 1, 1, 90, 70, 80));
		list.add(new Student2("김자바", 1, 2, 80, 80, 90));
		
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
