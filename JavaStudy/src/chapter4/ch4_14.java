package chapter4;

import java.util.Scanner;

public class ch4_14 {

	public static void main(String[] args) {
		
		// 1~100사이의 임의의 값을 얻어서 answer에 저장
		int answer = (int)(Math.random()*100) + 1;
		int input = 0; //사용자 입력 저장 공간
		int count = 0; //시도횟수를 세기 위한 변수
		
		try (// 화면으로부터 사용자 입력을 받기 위해서 Scanner클래스 사용
		Scanner scan = new Scanner(System.in)) {
			do {
				count++;
				System.out.println("1과 100사이의 값을 입력하세요: ");
				input = scan.nextInt(); //입력받은 값을 변수 input에 저장
				
				if(input > answer) {
					System.out.println("더 작은 수를 입력하세요");
				} else if(input < answer) {
					System.out.println("더 큰 수를 입력하세요");
				} else {
					System.out.println("맞췄습니다");
					System.out.println("시도횟수는 " + count + "번 입니다.");
					break;
				}
				
			} while(true); //무한반복문
		}
}
}
