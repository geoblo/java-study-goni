package sec01.quiz_string;

import java.util.Scanner;

public class Quiz3 {
	// Quiz
//	원본 문자열과 찾는 문자열을 입력 받아 개수를 출력하는 프로그램을 구현하기 위해 
//	실행 클래스의 count 메서드를 작성하시오.
//	count(원본문자열, 찾는문자열) 메서드는 원본 문자열에서 찾는 문자열의 개수를 리턴하는 메소드입니다.
//	※ 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
	
//	[입력]
//	1) 123AB123 AB
//	2) 123AB123 13
	
//	[출력]
//	1) 1
//	2) 0

//  [힌트]
//	indexOf(String str, int fromIndex)를 이용해 반복해서 찾기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(count(str1, str2));
	}

}
