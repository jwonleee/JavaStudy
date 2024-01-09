package chapter14;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamComparator {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
				);
		
		//studentStream.sorted(Comparator.comparing(Student::getBan) //1.반별 정렬
		studentStream.sorted(Comparator.comparing((Student s) -> s.getBan()) //1.반별 정렬
					 .thenComparing(Comparator.naturalOrder())) //2. 기본 정렬(총점, 내림차순)
					 .forEach(System.out::println);
	}
}

class Student implements Comparable<Student> { //기본 구현 Comparable
	String name;
	int ban;
	int totalScore;
	
	Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}
	
	String getName() {return name;}
	int getBan() {return ban;}
	int gettotalScore() {return totalScore;}
	
	//총점 내림차순을 기본 정렬로 함
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
} //end class