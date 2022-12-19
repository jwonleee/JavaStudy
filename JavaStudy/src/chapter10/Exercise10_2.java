package chapter10;

import java.util.*; 
import java.text.*;

public class Exercise10_2 {

	static int paycheckCount(Calendar from, Calendar to) {
		/*
		 * (1) 아래의 로직에 맞게 코드를 작성하시오.
		 * 1. from 또는 to가 null이면 0을 반환한다.
		 * 2. from 와 to 가 같고 날짜가 21일이면 1을 반환한다.
		 * 3. to와 from이 몇 개월 차이인지 계산해서 변수 monDiff에 담는다.
		 * 4. monDiff가 음수이면 0을 반환한다.
		 * 5. 만일 from의 일(DAY_OF_MONTH)이 21일이거나 이전이고 to의 일(DAY_OF_MONTH) 21이 일이거나 이후이면 monDiff의 값을 1 증가시킨다.
		 * 6. 만일 from의 일(DAY_OF_MONTH)이 21일 이후고 to의 일(DAY_OF_MONTH)이 21일 이전이면 monDiff의 값을 1 감소시킨다.
		 */
		
		if(from == null+
				
				
				
				|| to == null) {
			return 0;
		}
		
		if(from.equals(to) && from.get(Calendar.DATE) == 21) {
			return 1;
		}
		
		// 해당년도에 12를 곱해서 총 개월수를 구하고 해당 월을 더함
		int monDiff = (to.get(Calendar.YEAR)*12 + to.get(Calendar.MONTH)) - (from.get(Calendar.YEAR)*12 + from.get(Calendar.MONTH));
		
		if(monDiff < 0) {
			return 0;
		}
		
		if(from.get(Calendar.DATE) <= 21 && to.get(Calendar.DATE) >= 21) {
			monDiff++;
		}
		
		if(from.get(Calendar.DATE) > 21 && to.get(Calendar.DATE) < 21) {
			monDiff--;
		}
		
		return monDiff;
	}

	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		System.out.print(sdf.format(fromDate) + "   ~   " + sdf.format(toDate) + ":");
		System.out.println(paycheckCount(from, to));
	}

	public static void main(String[] args) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();
		fromCal.set(2010, 0, 1);
		toCal.set(2010, 0, 1);
		printResult(fromCal, toCal);
		fromCal.set(2010, 0, 21);
		toCal.set(2010, 0, 21);
		printResult(fromCal, toCal);
		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 1);
		printResult(fromCal, toCal);
		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 23);
		printResult(fromCal, toCal);
		fromCal.set(2010, 0, 23);
		toCal.set(2010, 2, 21);
		printResult(fromCal, toCal);
		fromCal.set(2011, 0, 22);
		toCal.set(2010, 2, 21);
		printResult(fromCal, toCal);
	}

}
