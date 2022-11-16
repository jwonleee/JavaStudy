package Programmers;

import java.util.Arrays;

class Solution3 {

	public static void main(String[] args) {
		
		String s = "abcabcadc";
//		System.out.println(solution(s));
		
	} //main 끝


	public static String solution(String s) {
		String answer = "";
		String[] arr = s.split("", s.length()); // String 배열에 split으로 쪼개서 s길이만큼 담기
//		System.out.println(Arrays.toString(arr)); // [a, b, c, a, b, c, a, d, c]
		int count = arr.length;
		
		for(int i = 0; i < arr.length; i++) { // arr.lenght = 9
			for(int j = 0; j < arr.length ; j++ ) {
				
				if( arr[i] == arr[j] ) { // 배열은 삭제가 안되니 뒤에서 앞으로 땡겨옴
					 for(int k = i; k < count-1; k++) {
						arr[k] = arr[k+1];
					}
					count--;
				}
				
			}
		}
		
		for(int i = 0; i < count; i++) {
			answer += arr[i];
		}
		
		System.out.println(answer);
		
		
		
		
		


		
		return answer;

	}

}