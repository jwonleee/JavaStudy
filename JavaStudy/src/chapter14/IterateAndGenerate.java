package chapter14;

import java.util.stream.Stream;

public class IterateAndGenerate {

	public static void main(String[] args) {
		//iterate(T seed, UnaryOperator f) 단항 연산자
		Stream<Integer> intStream = Stream.iterate(0, n -> n + 2);
		intStream.limit(10).forEach(System.out::println);
		
		//generate(Supplier s) : 주기만 하는 것 입력x, 출력o
		Stream<Integer> oneStream = Stream.generate(() -> 1);
		oneStream
		.limit(5)
		.forEach(System.out::println);
	}
}
