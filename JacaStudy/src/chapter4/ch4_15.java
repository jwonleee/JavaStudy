package chapter4;

public class ch4_15 {

	public static void main(String[] args) {
		
		int number = 12321; //주어진 정수
		int tmp = number;
		                                   
		int result = 0; //변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp != 0) { 
			
			int n = number % 10; //맨 마지막 숫자
			
			result = result*10 + n; //result*10은 자릿수 0, 10, 100, 1000...
			number = number/10; // 하나씩 남는 숫자 찾으려고
//			System.out.println(result);
//			System.out.println(number);
			break;
		}
		
		if(number == result) {
			System.out.println( number + "는 회문수 입니다.");
		} else {
			System.out.println( number + "는 회문수가 아닙니다.");
		}
	}
}
