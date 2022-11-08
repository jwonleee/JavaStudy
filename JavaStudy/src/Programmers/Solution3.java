package Programmers;

import java.util.Arrays;

class Solution3 {

	public static void main(String[] args) {
		System.out.println(solution("2three45sixseven"));
	} //main 끝


    public static int solution(String s) {
    		int answer = 0;
    	    String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    	    
    	    for(int i = 0; i < words.length; i++) {
    	    	s = s.replace(words[i],String.valueOf(i));
//    	    	s = s.replaceAll(arr[i], Integer.toString(i));
//    	    	System.out.println(s);
    	    }
//    	    System.out.println();
    	    answer = Integer.parseInt(s);
    	    return answer;
    }



}