package Programmers;

import java.util.Arrays;

class Solution2 {
	
	public static void main(String[] args) {
		int[] result = {1, 2, 3, 3, 3, 4};
		System.out.println(solution(result));
	} //main 끝
	
	
    public static int solution(int[] common) {
    	 int answer = 0;
          int count = 1;
         int[] arr = new int[6];
         
         Arrays.sort(common);
         System.out.println(Arrays.toString(common)); // [1, 2, 3, 3, 3, 4]
        
         for(int i = 0; i < common.length; i++) {
        	 for(int j = 0; j < i; j++) {
        		 if(common[i] != common[j]) {
        			 arr[i] += count;
        		 }


        	 }
         }
         System.out.println(Arrays.toString(arr));
         
         return answer;
    }
    
   
    
}