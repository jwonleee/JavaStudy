package Programmers;

import java.util.Arrays;

class Solution2 {
	
	public static void main(String[] args) {
		int[] result = {1, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4};
		System.out.println(solution(result));
	} //main 끝


	public static int solution(int[] array) {
		int answer = 0;
		int count = 0;

		Arrays.sort(array);
		System.out.println(Arrays.toString(array)); // [1, 2, 3, 3, 3, 4, 4, 4, 4]

		for(int i = 0; i < array.length - 1; i++) {
			
			for(int j = i+1; j < array.length; j++) {
				
				if(array[i] == array[j]) {
 					count += 1;
 					answer = array[i];
 					
 					
				} else if(array.length == 1) {
					answer = array[i];
				} //최빈값 여러개일 때 -1 반환
			}

		} 
		return answer;
	}
}