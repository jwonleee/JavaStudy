package chapter7;

public class Exercise7_3 {
	public static void main(String args[]) {
		Deck d = new Deck(); // 카드 한벌(Deck)을 만든다.
		Card c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c); // System.out.println(c.toString());과 같다.
		d.shuffle(); // 카드를 섞는다.
	}
}


class Deck {
	final int CARD_NUM = Card.Kind.values().length * Card.Number.values().length; // 카드의 개수
	Card cardArr[] = new Card[CARD_NUM]; // Card객체 배열을 포함

	Deck ()   { //cardArr[]에 담아야 함
		int i = 0;
		
		for(Card.Kind kind: Card.Kind.values()) { //Card객체의 Kind의 kind변수: values=모든 열거형에 자동적으로 추가해주는 메서드
			for(Card.Number num: Card.Number.values()) {
				cardArr[i++] = new Card(kind, num); //카드의 객체를 cardArr 배열에 하나씩 담음
			}
		}
	}
	
	
	Card pick(int index) {
		// 지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
		return cardArr[index];
	}

	Card pick() { // Deck에서 카드 하나를 선택한다.
		int index = (int) (Math.random() * CARD_NUM);
		return pick(index);
	}

	void shuffle() { // 카드의 순서를 섞는다.
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * CARD_NUM);
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
} // Deck클래스의 끝
//   Card클래스

class Card {
	enum Kind {
		CLOVER, HEART, DIAMOND, SPADE
	}

	enum Number {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}

	Kind kind;
	Number num;

	Card() {
		this(Kind.SPADE, Number.ACE);
	}

	Card(Kind kind, Number num) {
		this.kind = kind;
		this.num = num;
	}

	public String toString() {
		return "[" + kind.name() + "," + num.name() + "]";
	} // toString()의 끝
} // Card클래스의 끝