package chapter14;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		
		//14-4. 두 개의 주사위를 굴려서 나온 눈의 합이 6인 경우를 모두 출력하시오.
		IntStream.rangeClosed(1, 6) //1, 2, 3, 4, 5, 6
				 .boxed() //Stream<Integer>
				 .flatMap(i -> IntStream.rangeClosed(1, 6).boxed().map(j -> new Integer[]{i, j}))
				 //위와 똑같이 하나 더 만들고 flatMap으로 평면화 시킨 다음에 그 값들을 Integer[]에 넣음
				 .filter(arr -> arr[0] + arr[1] == 6)
				 .collect(Collectors.toList());
		
		
		//14-6. 문자열의 길이가 가장 긴 길이 출력
		String[] strArr = {"aaa", "bb", "c", "dddd"};
		
		int strStream = Stream.of(strArr)
										 .mapToInt(String::length)
										 .max().orElse(0);
		System.out.println(strStream);
		
		OptionalInt maxStringLength = Stream.of(strArr)
                .mapToInt(String::length)
                .max();
        System.out.println(maxStringLength.getAsInt());
        
        //14-7. 임의의 로또 번호 정렬해서 출력
        new Random().ints(1, 46).distinct().limit(6).sorted().forEach(System.out::println);
	}
}
