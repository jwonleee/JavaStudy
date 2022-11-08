package Programmers;

import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		
		System.out.println(solution("allpe","apple"));
	} //main 끝
	
	
    public static int solution(String before, String after) {
        int answer = 0;
        String str = "";
        
        for (int i = before.length() - 1; i >= 0; i--) {
        	 str = str + before.charAt(i);
//        	 System.out.println(str); // hello
        }
        
        if(str.equals(after)) {
        	answer = 1;
        } else {
        	answer = 0;
        }
        
        return answer;
    }
}