package chapter7;

import java.util.Arrays;

public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
		
	}
}


class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i = 0; i < cards.length; i++) { // 인덱스 0, 1, 2, .... 19까지 값을 집어넣음
			
			if ((i == 0 || i == 2 || i == 7) && i < 10) { // num = 1, 3, 8이어야 하기 때문에 && 앞의 138만 k가 붙어야 하니까
				cards[i] = new SutdaCard(i+1, true); // 인덱스 0,2,7이면 새로운 객체 생성하면서 num=1K,3K,8K
			} else {
				cards[i] = new SutdaCard(i%10 + 1, false); // 0,1,3,4,5,6,7,9,0,1,2,...나머지 잘 생각해서
			}
//			cards[i] = new SutdaCard(num, isKwang);
		}	
	}
	
	void shuffle() {
		for(int i = 0; i < cards.length; i++) {
			int j = (int)Math.random();
			
			SutdaCard tmp = cards[i]; //cards[i]의 타입이 SutdaCard임
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	
	SutdaCard pick(int index) { // 인덱스 값 받으면
		if (0 <= index && index < cards.length) {// 만약 인덱스 값 0~19 		
		return cards[index]; // 인덱스 위치 반환
		} else {
		return null; // 범위 밖이면 null값!!!!!!!빼먹지 말기
		}
	}
	
	
	SutdaCard pick() {
		int ran = (int)(Math.random() * cards.length); // 인덱스 0~19
		return cards[ran]; // 임의의 위치 반환
	}
	
	
 } // SutdaDeck class 끝

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	//info() 대신 object클래스의 toString()을 오버라이딩
	public String toString() {
		return num + (isKwang ? "K" : "");
	
	}
}