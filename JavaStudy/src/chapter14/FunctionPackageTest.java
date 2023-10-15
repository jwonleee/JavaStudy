package chapter14;

import java.util.*;
import java.util.function.*;

public class FunctionPackageTest {
	
	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
		Consumer<Integer> c = i -> System.out.print(i + ", ");
		Predicate<Integer> p = i -> i%2 == 0;
		Function<Integer, Integer> f = i -> i/10*10; //i의 1의 자리 없앰
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list);
		System.out.println(list);
		printEvenNum(p, c, list);
		List<Integer> newList = doSomething(f, list);
		System.out.println(newList);
	} //end main
	
	//변환 작업
	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());
		
		for(T i : list) {
			newList.add(f.apply(i)); //일의 자리를 없애서 새로운 list에 저장
		}
		return newList;
	} //end doSomething
	
	//필터링, 소비자
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i)) //짝수 검사
				c.accept(i); //i -> System.out.print(i + ", "); 화면에 i출력
		}
		System.out.println("]");
	} //end printEvenNum
	
	//공급자
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i = 0; i < 10; i++) {
			list.add(s.get());
		}
	} //end makeRandomList
}
