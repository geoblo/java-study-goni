package sec01.exam12;

import java.io.IOException;
import java.util.Scanner;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		// bytes 배열에 키보드로부터 읽은 키코드를 저장
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		// 입력 스트림에서 바이트들을 여러 개 읽어 배열에 저장하고 읽은 바이트 수를 반환
		
		System.out.println(readByteNo);
		// 참고
		// 예: Hello 엔터를 치면 바이트 배열에 저장하고 7을 리턴함
		// 5가 아닌 7인 이유? 엔터의 키코드인 \r \n 을 포함
		
		String str = new String(bytes, 0, readByteNo - 2);
		System.out.println(str);
		
		// 추가 실습
		// Scanner 객체 사용
		// System.in.read()의 단점은 키코드를 하나씩 읽음
		// 이러한 단점을 보완하기 위해 자바는 Scanner 클래스를 제공
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력2: ");
//		String str2 = sc.nextLine(); // 입력된 문자열을 통으로 읽고 엔터키 이전까지 반환
//		System.out.println(str2);
//		sc.close();
		
		// 참고: try-with-resources
		// 리소스를 자동으로 닫아주는 try 문법
		// close()를 명시적으로 호출하지 않아도, try 블록이 끝나거나 예외가 발생하는 즉시 자동으로 자원 정리
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("입력2: ");
			String str2 = sc.nextLine();
			System.out.println(str2);			
		}
	}

}
