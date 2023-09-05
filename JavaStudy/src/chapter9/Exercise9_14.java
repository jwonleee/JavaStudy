package chapter9;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Exercise9_14 {
	public   static   void   main(String[]   args)   { 
		String[] phoneNumArr = {
				"012-3456-7890", 
				"099-2456-7980", 
				"088-2346-9870", 
				"013-3456-7890"
		};

		ArrayList<String> list = new ArrayList<>(); 
		try (Scanner s = new Scanner(System.in)) {
			while(true)   {
				System.out.print(">>");
				String input = s.nextLine().trim(); 

				if(input.equals(""))   {
					continue;
				} else if(input.equalsIgnoreCase("Q")) { //종료
					System.exit(0);
				}

				/*
					Pattern, Matcher 클래스 사용
				 */
				
				Pattern p = Pattern.compile("^[0-9]*$"); //숫자만
				Matcher m = p.matcher(input);
				
				//유효성 검사
				boolean b = m.matches();
				//boolean telCheck = Pattern.matches("^[0-9]*$", input);
			

				if(list.size()>0)   {
					System.out.println(list); 
					list.clear();
				}   else   {
					System.out.println("일치하는 번호가 없습니다.");
				}
			} // main
		}
	}
}