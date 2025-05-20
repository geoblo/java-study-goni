package sec04.exam05.quiz;

import java.util.Scanner;

public class Quiz1 {
//  Quiz
//	클래스 Calculator에 전달된 begin부터 end까지 정수 중 
//	짝수의 합을 반환하는 getEvenTotal() 메소드를 구현하시오.
//
//	[입력]
//	1 100
//
//	[출력]
//	2550

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int begin = sc.nextInt();
		int end = sc.nextInt();
		
		Calculator calc = new Calculator();
		System.out.println(calc.getEvenTotal(begin, end));
	}

}
