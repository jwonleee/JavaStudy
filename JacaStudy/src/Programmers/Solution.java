package Programmers;

import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		int[] result = {1, 2, 3, 4};
		System.out.println(solution(result));
	} //main 끝
	
	
    public static int solution(int[] common) {
        int answer = 0;
        int a = common[1] - common[0]; //등차
        int b = common[1] / common[0]; //등비
        
        for(int i = 2; i < common.length; i++) {
        	if(common[2] - common[1] == a) {
        		answer = common[i] + a;
        	} else if(common[2] / common[1] == b) {
        		answer = common[i] * b;
        	} 
        }
        
        return answer;
    }
    
   
    
}