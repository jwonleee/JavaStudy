package Programmers;

import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3};
		
		System.out.println(solution(numbers, 3));
	} //main 끝
	

	public static int solution(int[] numbers, int k) { // 던지는 사람 기준으로
        int answer = 1;
        
        if ( k == 1 ) { // 1번째 사람은 무조건 1
        	answer = 1;
        }
      
        for(int i = 2; i <= k; i++) { // 2번째부터 k번째까지 던진 사람 찾기
        	
        	answer = answer + 2; // 옆옆 사람이니까 2씩 증가
        	
        	if(answer > numbers.length) { //
        		
        		if(numbers.length % 2 != 0) { // 사람 수가 홀수면
        			
        			if(answer - 2 == numbers.length) { // 위에서 +2가 증가한 상태로 내려와서
        				answer = 2; // 총 사람수와 마지막에 서 있는 사람이 같으면 2
        			} else {
        				answer = 1; // 아니면 1
        			}
        			
        		} else { // 사람 수가 짝수면
        			answer = 1;
        		}
        		
        	}
        }
        
		return answer;
}
}




/*
 * 	int answer = 1;
	int[] count = new int[numbers.length / 2]; // 분기별로 잘라낼 숫자



	if(numbers.length % 2 == 0) { // if 사람이 짝수이면
        	for(int i = 1; i < count.length; i++) { // count[] 배열에 던지는 사람의 번호를 담음
        		count[0] = 1; // 처음에 던지는 사람은 무조건 첫번째 1번 사람
        		count[i] = count[i-1] + 2; // 반복되는 숫자 count 배열에 담음
    		} // 반복적으로 나오는 숫자 개수
        	System.out.println(Arrays.toString(count)); // 1, 3, 5
        	
        	if(numbers.length % k == 0) {
        		answer = count[numbers.length - 1];// answer 값
        	} else {
        		for(int i = 0 ; i < numbers.length - 2; i++) {
        			
        		}
        		
        	}
 
        }
 */