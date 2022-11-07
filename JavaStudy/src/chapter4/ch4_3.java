package chapter4;

public class ch4_3 {

	public static void main(String[] args) {
		
		int sum = 0;
		int answer = 0;
		
		for(int i = 0; i <= 10; i++) {
			sum += i;
			answer += sum;
		}
		System.out.println(answer);
	}
}
