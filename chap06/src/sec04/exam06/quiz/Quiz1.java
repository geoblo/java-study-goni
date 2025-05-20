package sec04.exam06.quiz;

import java.util.Scanner;

public class Quiz1 {
//	Quiz
//	실행 클래스에서 정수값 2개, 실수값 2개를 입력받아 
//	두수의 합을 출력할 수 있도록 Adder 클래스에 add() 메소드를 추가하시오.
//
//	[입력]
//	10 20 10.5 30.5
//
//	[출력]
//	30
//	41.0

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		
		Adder adder = new Adder();
		adder.add(n1,n2);
		adder.add(n3,n4);
	}
	
}
