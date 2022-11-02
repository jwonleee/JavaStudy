package chapter4;

public class ch4_15 {

	public static void main(String[] args) {
		
		int number = 12321;
		int tmp = number;
		                                   
		int result = 0; //변수 number를 거꾸로 변환해서 담을 변수
		
		while(tmp != 0) { 
			
			int r = number%10;
			
			result = result*10 +r;
			number = number/10;
			System.out.println(result);
			System.out.println(number);
			
			break;
		}
		
		if(number == result) {
			System.out.println( number + "는 회문수 입니다.");
		} else {
			System.out.println( number + "는 회문수가 아닙니다.");
		}
	}
}
