package Programmers;

import java.util.Arrays;

class Solution2 {
	
	public static void main(String[] args) {
		int[] result = {1, 2, 3, 3, 3, 4, 4, 4};
		System.out.println(solution(result));
	} //main 끝
	
	
    public static int solution(int[] array) {
    	int answer = 0; //최빈값
        int count = 0;
//        int[] newarr = new int[];
         
         Arrays.sort(array);
         System.out.println(Arrays.toString(array)); // [1, 2, 3, 3, 3, 4]
        
         for(int i = 0; i < array.length; i++) {
        	 if(array[i] > count) {
        		 count = array[i];
        	 }
         }
         
         
         
         
         
         
//         for(int i = 0; i < common.length; i++) {
//        	 
//        	 for(int j = i+1; j < common.length - 1; j++) {
//        		 
//        		 if(common[i] == common[j]) {
//        			 count += 1;
//        			 answer = common[i];
//        		 } else if(common[i] != common[j]) {
//        			 break;
//        			 
//        		 }
//        	 }
//         }
//         System.out.println(Arrays.toString(arr));
         
         return answer;
    }
    
   
    
}