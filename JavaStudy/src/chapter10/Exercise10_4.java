package chapter10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		DateFormat df2 = new SimpleDateFormat("입력하신 날짜는 E요일 입니다."); //E가 요일
		
//		Date d = new Date(); 객체 안 만들어도 되나?
		Date a = null;
		
		
		while(true) {
			System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요 입력예:2007/05/11");
			System.out.print(">");
			
			try {
				
				
				String answer = scan.next();
				 a = df.parse(answer);
				System.out.println(df2.format(a));
				
				break;
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
		}
		
		
		
		
		
		
	}
}
