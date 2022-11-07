package chapter4;

public class ch4_4 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		while(true) {
			if(i % 2 == 0) {
				sum -= i;
			} else {
				sum += i;
			}
			
			if(sum >= 100) {
				break;
			}
			i++;
		}
		
		System.out.println(i);
	}
}
