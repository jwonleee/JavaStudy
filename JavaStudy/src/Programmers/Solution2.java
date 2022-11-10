package Programmers;

import java.util.Arrays;

class Solution2 {
	
	public static void main(String[] args) {
		int[] result = {1, 2, 2, 2, 3, 4};
		System.out.println(solution(result));
	} //main 끝


	public static int solution(int[] array) {
		
		int max = 0;
		int count = 0;

		Arrays.sort(array);
		System.out.println(Arrays.toString(array)); // [1, 2, 3, 3, 3, 4, 4, 5]

//		int[] overlap = new int[1000];

		for(int i = 0; i < array.length; i++) {
				for(int j = i+1; j < array.length; j++) {
					
					if(array[i] == array[j]) {
						
							
						if(max != array[i]) {
							
							
						count += 1;
						max = array[i];
							
							
						}
						
					}
						

				
						
				}
		
		}
		
//		System.out.println(Arrays.toString(overlap));
				//최빈값 여러개일 때 -1 반환
		
		
		return max;
	} 
}
