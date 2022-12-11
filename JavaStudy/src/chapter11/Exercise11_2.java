package chapter11;

import java.util.*;

public class Exercise11_2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7); //list에 3, 6, 2, 2, 2, 7 있음
		HashSet set = new HashSet(list); // 중복요소 제거, 3627 있는데 순서는 뒤섞임
		TreeSet tset = new TreeSet(set); // 중복허용x, sort됨, 2367
		
		Stack stack = new Stack(); // 스택 만듦
		
		stack.addAll(tset); //stack에 하나씩 담음, 2 - 3 - 6 - 7 순서로 담김
		
		while (!stack.empty()) // while문 반복하면서 stack이 빌때까지
			System.out.println(stack.pop()); //stack값 꺼내기, 단방향이므로 7 - 6 - 3 - 2 순서로 꺼내짐
	}
}
