package chapter6;

public class Exercise6_22 {
	public static boolean isNumber(String str) {
		
		return false;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "숫자입니까?" + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "숫자입니까?" + isNumber(str));
		
	}
}
