package chapter5;

import java.util.Scanner;

public class ch5_7 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE: ch5_7 3120");
			System.exit(0);
		}
		
		//문자열을 숫자로 변환. 입력한 값이 숫자가 아닐 경우 예외가 발생
		int money = Integer.parseInt(args[0]);
		System.out.println("money = " + money);
		
		int[] coinUnit = { 500, 100, 50, 10 }; //동전의 단위
		int[] coin     = { 5, 5, 5, 5 }; //단위별 동전의 개수
		
		for(int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
		
			coinNum = money / coinUnit[i]; //금액을 동전단위로 나눠서 필요한 동전의 개수를 구함
			
			if(coinNum > coin[i]) {
				coinNum = 5;
				coin[i] = 0;
			} else {
				coin[i] -= coinNum;
			}
			
			money = money - (coinNum*coinUnit[i]); //여기 momney -= (coinNum*coinUnit[i]);하면 -2500됨
		
			System.out.println(coinUnit[i] + "원: " + coinNum);
		}
		
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); //프로그램을 종료합니다.
		}
		
		System.out.println("= 남은 동전의 개수 =");
		
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원: " + coin[i]);
		}
		
		
		
	}
}
