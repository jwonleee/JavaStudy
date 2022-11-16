package Programmers;

import java.util.Arrays;

class Solution4 {
	
	public static void main(String[] args) {
		int[] result = {1, 2, 3, 3, 3, 4, 4, 4, 3, 5};
		System.out.println(solution(result));
	} //main 끝


	public static int solution(int[] array) {
		
		int result = 0;
		int count = 1;
		int max = 0;

		Arrays.sort(array);
		System.out.println(Arrays.toString(array)); // [1, 2, 3, 3, 3, 3, 4, 4, 4, 5]

//		int[] overlap = new int[1000];

		
		if(array.length == 1) { // 길이가 1일때 값
			result = array[0];
		}
			
			for(int i = 0; i < array.length; i++) { // 회문돌면서 확인
				for(int j = i+1; j < array.length; j++) {
					
					if(array[i] == array[j]) {
						
						if(array[i] != array[j]) { // 앞의 count하고 배열값이 다른 것 임을 알려줘여함 그리고 max갑 비교도 필요
							count = 0;
							break;
						}
						
						count ++;
						max = count;
						break;
					} 
					
				}
			}
		
		return result;
	} 
}
