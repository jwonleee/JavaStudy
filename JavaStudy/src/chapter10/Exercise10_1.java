package chapter10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {

	public static void main(String[] args) {
		
	Calendar cal = Calendar.getInstance(); //getInstance메서드는 Calendar클래스는 구현한 클래스의 인스턴스 반환, 추상클래스는 인스턴스 생성x
	cal.set(2010, 0, 1); //2010년 1월 1일
	System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //금요일
	
	for(int i = 0; i < 12; i++) {
		
//		if(cal.get(Calendar.DAY_OF_WEEK) == 1) {
//			
//		}
		
		int answer = cal.get(Calendar.DAY_OF_WEEK) == 1 ? 8 : 14-cal.get(Calendar.DAY_OF_WEEK);
			
		Date d = cal.getTime();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 2번째 E요일입니다.").format(d);
	}
	
	
	
	
	
	
	}

//	private static DateFormat SimpleDateFormat(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
}