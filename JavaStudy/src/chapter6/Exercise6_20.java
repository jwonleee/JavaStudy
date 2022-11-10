package chapter6;

import java.util.Arrays;

public class Exercise6_20 {
	
	public static int[] shuffle (int[] arr) {
		int ran = (int)Math.random();
		
		for(int i = 1; i < arr.length; i++) {
			int tmp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = tmp;
		}
		return arr;
	};
	
	
	public static void main(String[] args) {
	
		int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	} // main의 끝
}





