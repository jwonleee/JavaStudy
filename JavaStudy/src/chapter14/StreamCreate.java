package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {
	
	public static void main(String[] args) {
		//List
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> intStream = list.stream(); //list를 Stream으로 변환
		intStream.forEach(System.out::print); //최종연산 - Stream 닫힘
		//같은 Stream에 대해서 사용하지 못 하고
		intStream = list.stream(); //Stream 다시 생성 후 연산 가능
		intStream.forEach(System.out::print);
		System.out.println();
		
		//배열 - 문자
//		Stream<String> strStream = Stream.of(new String[] {"a", "b", "c", "d"});
		Stream<String> strStream = Arrays.stream(new String[] {"a", "b", "c", "d"});
		strStream.forEach(System.out::println);
		
		//배열 - 숫자
		int[] intArr = {1, 2, 3, 4, 5};
		IntStream intStream2 = Arrays.stream(intArr);
//		intStream2.forEach(System.out::println); 주석 안 걸면 오류남, 최종연산
		System.out.println("count = " + intStream2.count()); //IntStream에는 count, sum, average 등 있음
		//Stream<Integer>에는 count밖에 없음, 숫자외에도 여러 타입의 스트임이 가능해야하므로 숫자 스트림에만 사용할 수 있는 것은 없음
	}
}

