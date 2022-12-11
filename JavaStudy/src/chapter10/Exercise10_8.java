package chapter10;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class Exercise10_8 {

	public static void main(String[] args) {
		
		
//		ZonedDateTime gregorianCZonedDateTime = new GregorianCalendar().toZonedDateTime();
//		
//		System.out.println(gregorianCZonedDateTime);
		
		//ZonedDateTime은 타임존, 시차 필요시 사용
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		
		ZonedDateTime nowNew = ZonedDateTime.now(ZoneId.of("America/New_York")); //ZoneId.of() 타임존 정보 넘겨서 확인
		System.out.println(nowNew);
		
		
		
	}
}
