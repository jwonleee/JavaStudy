package Programmers;

import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		int[] result = {1, 2, 3, 4};
		System.out.println(solution(result));
	} //main 끝
	
	
    public static int solution(int[] common) {
        int answer = 0;
        
        
        	if(common[2] - common[1] == common[1] - common[0]) {
        		answer = common[common.length - 1] + common[1] - common[0];
        	} else if(common[2] / common[1] == common[1] / common[0]) {
        		answer = common[common.length - 1] * common[1] / common[0];
        	} 
        
        
        return answer;
    }
    
   
    
}