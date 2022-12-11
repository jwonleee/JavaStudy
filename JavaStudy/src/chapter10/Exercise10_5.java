import java.util.*;

class Exercise10_5 {
	/*
	 * (1) getDayDiff메서드를 작성하시오.
	 */
	public static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		
		int result = 0;
		
		try {
			
			int ayear = Integer.parseInt(yyyymmdd1.substring(0,4)); //첫번째 매개변수 숫자로
			int amonth = Integer.parseInt(yyyymmdd1.substring(4,6)) - 1; //첫번째 매개변수 숫자로, month는 0부터 시작
			int aday = Integer.parseInt(yyyymmdd1.substring(6,8)); //첫번째 매개변수 숫자로
			
			int byear = Integer.parseInt(yyyymmdd2.substring(0,4));
			int bmonth = Integer.parseInt(yyyymmdd2.substring(4,6)) - 1;
			int bday = Integer.parseInt(yyyymmdd2.substring(6,8));
			
			Calendar date1 = Calendar.getInstance(); //캘린더 객체 생성
			Calendar date2 = Calendar.getInstance();
			
			date1.set(ayear, amonth, aday); //설정
			date2.set(byear, bmonth, bday);
			
			result = (int) ( (date1.getTimeInMillis() - date2.getTimeInMillis() ) / (24*60*60*1000));
			// 1000분의 1초 -> 일단위로 바꾸기 24*60*60*1000로 나누기
		
			return result;
			
		} catch (Exception e) {
			return 0;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println(getDayDiff("20010103", "20010101"));
		System.out.println(getDayDiff("20010103", "20010103"));
		System.out.println(getDayDiff("20010103", "200103"));
	}
}