package chapter7;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;

public class Exercise7_19 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tvv());
		b.buy(new Computer());
		b.buy(new Tvv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
		
	}
}

		class Buyer {
		int money = 1000;
		Productt[] cart = new Productt[3]; //구입할 제품을 저장하기 위한 배열
		int i = 0; //product배열 cart에 사용될 index
		
		
		void buy(Productt p) { //매개변수를 product p로 받는 buy 메서드
			if(money < p.price) { //가진돈과 Product p가 가리키는 price 제품의 가격을 비교
				System.out.println("잔액이 부족하여" + p + "을/를 살 수 없습니다.");
				return;
			} else { //가진돈이 충분하면
				money = money - p.price; //제품의 가격을 가진 돈에서 뺌
				add(p); //장바구니에 구입한 물건 담음
			}
		}


		void add(Productt p) { //장바구니에 담는 add 메서드
			if(i >= cart.length) { //i값이 장바구니의 크기보다 같거나 크면
				Productt[] tmp = new Productt[cart.length*2]; //기존의 장바구니보다 2배 큰 새로운 배열 생성
//				Arrays.copyOf(tmp, tmp.length); //기존의 장바구니의 내용을 새로운 배열에 복사 (Arrays.copyOf) - 이거 안됨
				//System.arraycopy 
				System.arraycopy(cart, 0, tmp, 0, cart.length); 
			
				cart = tmp;//새로운 장바구니와 기존의 장바구니를 바꿈
			}
			cart[i] = p; //물건을 장바구니에 저장
			i++;
			
		} // add(Product p)

		
		void summary() {
			String item = "";
			int sum = 0;
			
			for(int i = 0; i < cart.length; i++) {
				if(cart[i] == null)  //장바구니에 물건이 없으면 멈춤
					break;
			
				item += cart[i] + ",";
				sum += cart[i].price;
			}
			
			System.out.println("물건:" + item);
			System.out.println("사용한 금액:" + sum);
			System.out.println("남은 금액:" + money);
		} // summary()
		
		
}
		
class Productt {
	int price; // 제품의 가격

	Productt(int price) {
		this.price = price;
	}

}

class Tvv extends Productt {
	Tvv() {
		super(100);
	}

	public String toString() {
		return "Tvv";
	}
}

class Computer extends Productt {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Productt {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}
			
		
		



		
		
		
