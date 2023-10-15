package chapter14;

import java.io.*;
import java.util.stream.Stream;

public class StreamMap {
	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
		 new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
		};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		//map()으로 Stream<File>을 Stream<String>으로 변환
		//Stream<String> filenameStream = fileStream.map(File::getName);
		Stream<String> filenameStream = fileStream.map((s)-> s.getName());
		filenameStream.forEach(System.out::println); //모든 파일의 이름 출력
		
		fileStream = Stream.of(fileArr); //스트림을 다시 생성
		
		fileStream.map(File::getName) //Stream<File> -> Stream<String>
				  .filter(s -> s.indexOf('.')!=-1) //확장자가 없는 것은 제외
				  .peek(s -> System.out.printf("filename = %s%n", s))
				  .map(s -> s.substring(s.indexOf('.')+1)) //확장자만 추출
				  .peek(s -> System.out.printf("extension = %s%n", s))
				  .map(String::toUpperCase) //모두 대문자로 변환
				  .distinct() //중복 제거
				  .forEach(System.out::println); //JAVA BAK TXT
		System.out.println();
	}	
}
