package chapter9;

class Exercise9_3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */
		
		int a = fullPath.indexOf("work", 0);
		path = fullPath.substring(0, 14);
		fileName = fullPath.substring(a+5);
		
		
		System.out.println(a);
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}