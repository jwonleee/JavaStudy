package Programmers;

public class Solution {
   
   public static void main(String[] args) {
      
      int[][] result = { {-1,-1},
    		  			 { 1, 1},
    		  			 { 1,-1},
    		  			 {-1, 1} };
      System.out.println(solution(result));
   }
   
   
   public static int solution(int[][] dots) {
       int answer = 0;
       int max = 0;
       int min = 0;
       
       
       for(int i = 0; i < dots.length; i++) {
    	   max = Math.max(dots[i], dots[0]);
    	   min = Math.min(dots[i], dots[1]);
       }
       
       
       
       
       return answer;
   }
}
