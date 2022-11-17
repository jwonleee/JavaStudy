package chapter7;

public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for(int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}
	}
}


class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		
		for(int i = 0; i <= cards.length; i++) { // 인덱스 0, 1, 2, .... 19까지 값을 집어넣음
			
			cards[i].num =+ 1;
			
			if(i == 9) {
				cards[i].num = 1;
			}
			
			
		}
			
	}
 } // SutdaDeck 끝

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