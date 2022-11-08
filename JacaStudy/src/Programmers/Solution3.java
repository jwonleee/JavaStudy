package Programmers;

import java.util.Arrays;

class Solution3 {
	
	public static void main(String[] args) {
		System.out.println(solution("seven23four"));
	} //main 끝
	
	
    public static int solution(String s) {
    	    String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	    
    	    for(int i = 0; i < words.length; i++) {
    	    	s = s.replace(words[i],String.valueOf(i));
    	    int answer = Integer.parseInt(s);
    	    
    	    return answer;
    	}
    }
    
   
    
}