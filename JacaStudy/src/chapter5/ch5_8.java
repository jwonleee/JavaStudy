package chapter5;

public class ch5_8 {

	public static void main(String[] args) {
		
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		int count = 0;
		
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == answer[i+1]) {
				count += 1;
			} else {
				continue;
			}
			System.out.print(answer[i]);
		}
		
		for(int i = 0; i < counter.length; i++) {
			
//			if(cou) {
//				System.out.print("*");
//			}
			
			System.out.println();
		}
	}
}
