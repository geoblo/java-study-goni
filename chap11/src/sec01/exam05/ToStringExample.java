package sec01.exam05;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.toString()); // 클래스 이름@16진수 해시코드
		// 객체를 출력하려고 하면 toString()이 호출됨
		System.out.println(obj1); // toString() 생략 가능
		
		Date obj2 = new Date(); // java.util.Date import
		System.out.println(obj2.toString()); // Date 클래스에서 날짜 정보가 나오도록 재정의 한 것
		System.out.println(obj2);
	}

}
