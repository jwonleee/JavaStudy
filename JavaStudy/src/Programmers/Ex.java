package Programmers;

public class Ex {

	public static void main(String[] args) {
		int n = 3;	
		
		System.out.println(solution(n));
	}//main의 끝
	
	public static String solution(int n) {
		StringBuffer sb = new StringBuffer(); //StringBuffer 생성
        
        
        for(int i = 0; i < n; i++) {
        	if(i%2 == 0) { //짝수이면
        		sb.append("수");
        	} else if(i%2 == 1) { //홀수이면
        		sb.append("박");
        	}
        	      	
        }
        return sb.substring(0);
    }
}
