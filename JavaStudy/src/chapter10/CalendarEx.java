package chapter10;

import java.util.*;

public class CalendarEx {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		date.set(2019, 8, 31);
		System.out.println(toString(date));
	
	}

	private static String toString(Calendar date) {
		
		return date.get(Calendar.YEAR) + "년" + date.get((Calendar.MONTH)) + "월" + date.get(Calendar.DATE);
	}
}
