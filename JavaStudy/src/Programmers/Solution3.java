package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

class Solution3 {

	public static void main(String[] args) {
		
		String s = "abcabcadc";
		System.out.println(solution(s));
//		System.out.println(answer);
		
	} //main 끝


	public static String solution(String s) {
		String answer = "";
		String[] arr = s.split("", s.length()); // String 배열에 split으로 쪼개서 s길이만큼 담기
		
		String[] result = new String[arr.length]; // 겹치는 값이 없을 경우에 담을 String 배열
//		System.out.println(Arrays.toString(arr)); // [a, b, c, a, b, c, a, d, c]
		
		for(int i = 0; i < arr.length; i++) { // arr.lenght = 9, i=0~8
			for(int j = 0; j < arr.length ; j++ ) { // j=0~8
				
				if (arr[i].indexOf(arr[j]) == -1) { // 값이 다르면(같은 배열이니까 상관X)
					result[i] = arr[i]; // 그 값을 겹치는 값이 없는 배열에 넣음
				} else { // 값이 같으면
					if(i == j) { continue; } // 본인 자신과 비교하는 경우는 그냥 넘어감
					result[i] = null; // 겹치는 값이 없는 배열의 값을 null로 정한 후 break;
					break;
				}		
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			if(result[i] == null) {
				
			} else {
				answer += result[i];
			}
		}
		
		char[] charArr = answer.toCharArray();
		Arrays.sort(charArr);
		answer = String.valueOf(charArr);
		
		  
		return answer;
	}
	
		
		
		

}

