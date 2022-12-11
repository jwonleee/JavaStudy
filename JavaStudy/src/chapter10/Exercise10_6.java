package chapter10;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercise10_6 {

	public static void main(String[] args) {
		
		Calendar birth = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		birth.set(1995, 0, 1); //월은 1빼야 함
		
//		System.out.println(today);
		long result = (today.getTimeInMillis() - birth.getTimeInMillis()) / (24*60*60*1000);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd"); //replace() 메서드를 사용하여 날짜, 시간을 문자열로 변환
		
		String banswer = sdf.format(birth.getTime()); //Date 객체의 getTime()은 1970년 1월 1일 00시 00분 00초 UTC를 기준으로 경과 한 밀리초를 반환
		String tanswer = sdf.format(today.getTime()); //현재시간을 숫자로 나열함, 나열된 시간은 millisecond 즉 1/1000초를 나타냄
		
		
		System.out.println("birth day=" + banswer);
		System.out.println("today    =" + tanswer);
		System.out.println(result + " days");
		
		
		
		
	}
	
	
}
