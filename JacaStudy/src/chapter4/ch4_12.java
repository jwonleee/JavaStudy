package chapter4;

public class ch4_12 {

	public static void main(String[] args) {
		
//		10단까지 나옴
		 for(int i = 2; i < 9; i+=3) {
			for(int j = 1; j <= 3; j++) {
				
				System.out.printf(i + "x" + j + "=" + i*j + "\t");
				System.out.printf(i+1 + "x" + j + "=" + (i+1)*j + "\t");
				
				if(i < 8) {
					System.out.printf(i+2 + "x" + j + "=" + (i+2)*j + "\t");
				}
					
				System.out.println();
			}
			System.out.println();
		}
		
		
//		for(int i = 2; i <= 8; i+=3) {
//			for(int j = 1; j <= 3; j++) {
//				System.out.printf(i + "x" + j + "=" + i*j + "\n");
//			}
//			 System.out.println();
//		}
		
	}
}
