package chapter6;

import java.util.Arrays;

public class Exercise6_20 {
	
	public static int[] shuffle (int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			int ran = (int)(Math.random() * arr.length); //값 0~8
			int ran2 = (int)(Math.random() * arr.length); //값 0~8
			// 랜덤값 2개 설정해서 바꿔줌
			int temp = arr[ran];
			arr[ran] = arr[ran2];
			arr[ran2] = temp;
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





