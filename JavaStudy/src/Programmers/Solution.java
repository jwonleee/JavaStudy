package Programmers;

import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		
		System.out.println(solution(numbers, 5));
	} //main 끝
	
	
	public static int solution(int[] numbers, int k) { // k번째 사람이면
        int answer = 1;
        
        if(numbers.length % 2 == 0) { //  = 짝수이면
        	int i = 0;
        	while(true) { // 무한반복
        		if(i < k) {
        			answer = answer + 2;
        		
        		if(i == k-1) break;
        		i++;
        	}
        } 
       
    }
		return answer;
}
}