package sec02.exam04;

public class CharExample {

	public static void main(String[] args) {
		// char(2byte)
		// 하나의 문자를 유니코드로 저장
		// 유니코드: 세계 각국의 문자들을 2byte(0~65535) 범위에 맵핑한 국제 표준 규약
		
		char c1 = 'A'; // 실제로는 유니코드 값인 65가 메모리에 저장됨
		char c2 = 65; // 정수 타입이라 정수값도 저장 가능
//		char c = -65; // 음수값 저장 안됨, 유니코드는 0부터 시작
		char c3 = '\u0041'; // 유니코드를 의미 + 16진수(잘 안씀)
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uAC00';
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		// (참고) 유니코드 값 알아내기
		char var = '각';
		int unicode = var;
		System.out.println(unicode);
		System.out.println((int) var); // 강제 타입 변환
		
		// (참고) char 타입의 산술 연산
		char var1 = 'A' + 1;
		System.out.println(var1);
		char var2 = 'A';
//		char var3 = var2 + 1; // char변수 var2가 산술 연산에 쓰이면 int로 먼저 변환됨
		
		// 문자 '0' -> 유니코드 48
		System.out.println('1' - 0); // 49 - 0
		System.out.println('1' - '0'); // 49 - 48
		
		// 이런 방식은 문자를 숫자로 변환할 때 쓰일 수 있음
		char digit = '8';
		int numericValue = digit - '0';
		System.out.println(numericValue);
		
		/*
		 * 중요
		 * 1) 문자와 문자열은 다르다.
		 * 2) 빈(empty) 문자 처리에 대해
		 * */
//		char c = ''; // 컴파일 에러
		char c = ' '; // 공백 문자(유니코드: 32) 존재하므로 가능
		String str = ""; // 빈 문자열(empty string) 가능
	}

}
