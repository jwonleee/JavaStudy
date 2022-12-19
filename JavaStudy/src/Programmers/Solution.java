package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
   
   public static void main(String[] args) {
      
//	  int[][] result = {{80, 70},
//			  			{90, 50},
//			  			{40, 70},
//			  			{50, 80}}; //75, 70, 55, 65
	  
//	  int[][] result = {{80, 70},
//			  			{70, 80},
//	  					{30, 50},
//	  					{90, 100},
//	  					{100, 90},
//	  					{100, 100},
//			  			{10, 30}};
	  
	  int[][] result = {{1, 2},
			  			{1, 1},
			  			{1, 1}};
			  
      System.out.println(Arrays.toString(solution(result)));
      
   }
   
   public static int[] solution(int[][] score) {
	   
	   ArrayList<Double> scoreList = new ArrayList<Double>(score.length);//리스트만들어서 중간값 넣기
	   
	   int[] answerArr = new int[score.length];//받은 배열 크기 만큼 새로운 배열 생성

	
			
	   for(int i = 0; i < score.length; i++) { //for문 돌면서
		   scoreList.add(i,(double)(score[i][0] + score[i][1]) / 2); //2차원 배열의 원소를 더하고 나눠서 평균값을 구하고, answer 배열에 저장
 	   }
	   for(Double i :scoreList) {
		   System.out.print(i + "  "); //75  75  40  95  95  100  20  
	   }
	   
	   
	   for(int i = 0; i < answerArr.length; i++) {
		   int rank = 1;
		   
		   for(int j = 0; j < answerArr.length; j++) { //사람수만큼 반복
			   
			   if(scoreList.get(i) < scoreList.get(j)){ //한번씩 돌면서 자기보다 큰 값이 있으면 rank +1
				   rank++; //랭크 하나씩 뒤로
				   answerArr[i] = rank;
			   } 
		   }
		   
		   if(answerArr[i] == 0) {
			   answerArr[i] = 1;
		   }
	   }
	  
	   
	return answerArr;
}

}