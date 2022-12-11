package chapter10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Exercise10_3 {

	public static void main(String[] args) {
		
		String a = "123,456,789.5";
		
		DecimalFormat df = new DecimalFormat("#,###.##"); //형식지정
		DecimalFormat df2 = new DecimalFormat("#,####");
		
		try {
			Number num = df.parse(a); //특정 형식의 문자열을 숫자로 변환
			
			double num2 = num.doubleValue(); //number를 double로 변환
		
		
		System.out.println("data:" + a);
		System.out.println("반올림:" + Math.round(num2)); //double에서 반올림
		System.out.println("만단위:" + df2.format(num2)); //format사용
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
}
