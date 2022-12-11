package chapter10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Exercise10_7 {

	public static void main(String[] args) {
		
		//LocalDate 날짜 나타내는 클래스.of(년, 월, 일)
		LocalDate date = LocalDate.of(2016, 12, 1);
		
		//dayOfWeekInMonth 해당 월의 n번째요일에 해당하는 날짜 리턴
		//2011-12-01 (첫번째 목요일)
		//date.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.THURSDAY));
		
		//TemporalAdjusters 이게 무엇인가..
		System.out.println(date.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY)));
		
		
		
	}
}
