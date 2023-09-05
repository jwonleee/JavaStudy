package chapter11;

import java.util.*;

class Studentt implements Comparable<Object> { //다시보기
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Studentt(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() { //합계
		return kor + eng + math;
	}

	float getAverage() { //평균
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString()   {
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+getTotal() 
				+","+getAverage() 
				;
	}

	public int compareTo(Object o) { //비교메서드
		if (o instanceof Studentt) {
			Studentt tmp = (Studentt) o; //형변환 가능한지 보고, Stuendtt로 캐스팅
			
			return name.compareTo(tmp.name);
		} else {
			return -1; //오른쪽이 더 큼
		}
	}
	
} // class Student



public class Exercise11_6 {
	//TreeSet의 subSet(Object from, Object to)를 사용, 중복허용x, 순서o

	static int getGroupCount(TreeSet treeset, int from, int to) {
		
		Studentt s1 = new Studentt("", 0, 0, from, from, from); //이름,반,번호 / 국,영,수
		Studentt s2 = new Studentt("", 0, 0, to, to, to);
		
		return treeset.subSet(s1, s2).size();
	}
	
	
	public static void main(String[]   args)   {
		
		TreeSet<Studentt> set = new TreeSet<>(new Comparator() {  // 익명클래스
		
			public int compare(Object o1, Object o2)   {
				if(o1 instanceof Studentt && o2 instanceof Studentt)   { 
				Studentt s1 = (Studentt)o1;
				Studentt s2 = (Studentt)o2;
				
				return (int)(s1.getAverage() - s2.getAverage()); 
			}
				
				return   -1;
			}
		});
		
	
	set.add(new Studentt("홍길동",1,1,100,100,100)); //점수 추가
	set.add(new Studentt("남궁성",1,2,90,70,80));
	set.add(new Studentt("김자바",1,3,80,80,90));
	set.add(new Studentt("이자바",1,4,70,90,70));
	set.add(new Studentt("안자바",1,5,60,100,80)); 
	
	
	Iterator it = set.iterator(); //확인하려고
	
	while(it.hasNext())
		System.out.println(it.next());
	
	
	System.out.println("[60~69] :"+getGroupCount(set,60,70));
	System.out.println("[70~79] :"+getGroupCount(set,70,80));
	System.out.println("[80~89] :"+getGroupCount(set,80,90));
	System.out.println("[90~100] :"+getGroupCount(set,90,101)); 
	}
	
}
