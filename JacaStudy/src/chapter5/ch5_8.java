package chapter5;

import java.util.Arrays;

public class ch5_8 {

	public static void main(String[] args) {
		
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		int count = 0;
		
		Arrays.sort(answer);
		
//		System.out.println(Arrays.toString(answer));
		// [1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4]
		
		for(int i = 0; i < answer.length; i++) {
 			counter[answer[i]-1]++;
		}
		
		
		for(int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);
			
			for(int j = 0; j < counter[i]; j++) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
		
	}
}
