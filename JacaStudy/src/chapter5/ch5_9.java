package chapter5;

public class ch5_9 {

	public static void main(String[] args) {
		
		char[][] star = {
			{ '*', '*', ' ', ' ', ' '},
			{ '*', '*', ' ', ' ', ' '},
			{ '*', '*', '*', '*', '*'},
			{ '*', '*', '*', '*', '*'}
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
			
		System.out.println();
		
            for(int i = 0; i < star.length; i++) {
			for(int j = star[i].length; j > 0; j++) {
				result[j][i] = star[3-i][j];
			}
		}
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
