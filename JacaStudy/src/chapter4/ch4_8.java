package chapter4;

public class ch4_8 {

	public static void main(String[] args) {
//		int x = 0;
//		int y = 0;
		int answer = 0;
		
		for(int x = 0; x <= 10; x++) {
			
			for(int y = 0; y <= 10; y++) {
				
				answer = 2*x + 4*y;
				if(answer == 10) {
					System.out.println("x: " + x + ", y: " + y);
				} 
				
			}
			
		}
		
		
		char ch = ' ';
		System.out.println("나" + ch + "가");
	}
}
