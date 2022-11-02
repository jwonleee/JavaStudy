package chapter5;

import java.util.Arrays;

public class ch5_8 {

	public static void main(String[] args) {
		
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		int count = 0;
		
		System.out.println(Arrays.toString(answer));
		for(int i = 0; i < answer.length; i++) {
			Arrays.sort(answer);
			if(answer[i] == answer[i+1]) {
				count += 1;
			} 
		}
		System.out.print(count);
		
//		for(int i = 0; i < counter.length; i++) {
//			
//			if(cou) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
	}
}
