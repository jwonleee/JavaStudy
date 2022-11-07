package Programmers;

import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		int[] result = {2, 4, 8};
		System.out.println(solution(result));
	} //main 끝
	
	
    public static int solution(int[] common) {
        int answer = 0;
        int a = common[1] - common[0]; //등차
        int b = common[1] / common[0]; //등비
        
        	if(common[2] - common[1] == a) {
        		answer = common[common.length-1] + a;
        	} else if(common[2] / common[1] == b) {
        		answer = common[common.length-1] * b;
        	} 
        
        return answer;
    }
}