package chapter14;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamRandomRange {

	public static void main(String[] args) {
		//임의의 수
		IntStream intStream = new Random().ints(1, 10); //혹은 ints(10, 1, 9) 하면 limit가 10임
		intStream.limit(5).forEach(System.out::print); //limit이 없으면 무한스트림
		System.out.println();
		
		//특정 범위의 정수
		IntStream rangeStream = IntStream.range(1, 10);
		rangeStream.forEach(System.out::print);
		System.out.println();
		IntStream rangeStream2 = IntStream.rangeClosed(1, 10);
		rangeStream2.forEach(System.out::print);
	}
}
