package chapter10;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercise10_1 {

	public static void main(String[] args) {
		
	Calendar cal = Calendar.getInstance(); //getInstance메서드는 Calendar클래스는 구현한 클래스의 인스턴스 반환, 추상클래스는 인스턴스 생성x
	cal.set(2010, 0, 1+2); //2010년 1월 3일이 첫번째 일요일
	
	cal.get(Calendar.DAY_OF_WEEK); //요일 확인
	System.out.println(cal.get(Calendar.DAY_OF_WEEK+2)); //6반환 - 금이니까 +2, +2
	
	cal.set(2010, 0, 10); //두번째 일요일
	for(int i = 0; i < 12; i++) {
		
		
	}
	
	
	
	
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd은 번째 요일입니다.").format(null);
	
	
	}
	
}