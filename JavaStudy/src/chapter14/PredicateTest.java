package chapter14;

import java.util.function.*;

public class PredicateTest {

	public static void main(String[] args) {
		//두개의 함수 하나로 연결하기
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16); //<입력, 출력>
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		Function<String, String> h = f.andThen(g); //f 적용 후 g 적용해라
		Function<Integer, Integer> h2 = f.compose(g); //g 적용 후 f 적용해라
		
		System.out.println(h.apply("FF")); //"FF" -> 255 -> "11111111"
		System.out.println(h2.apply(2)); //2 -> "10" -> 16
		
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate(); // i >= 100
		
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));
		
		String s1 = "abc";
		String s2 = "abc";
		
		Predicate<String> p2 = Predicate.isEqual(s1);
		boolean result = p2.test(s2);
		System.out.println(result);
	}
}
