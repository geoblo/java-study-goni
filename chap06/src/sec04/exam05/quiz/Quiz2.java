package sec04.exam05.quiz;

import java.util.Scanner;

public class Quiz2 {
//	Quiz
//	실행 클래스는 화면에서 직사각형의 가로와 세로를 입력받아 
//	직사각형의 넓이와 둘레를 계산하는 프로그램입니다. 
//	실행 클래스에 맞도록 Rectangle 클래스를 구현하여 결과가 나오도록 프로그램을 구현하시오.
//
//	Rectangle 클래스의 멤버는 다음과 같습니다.
//	[필드]
//	가로(width): 정수, 세로(height): 정수
//	
//	[메소드]
//	area(): 직사각형의 넓이를 출력
//	length(): 직사각형의 둘레를 출력
//
//	[입력]
//	10 5
//
//	[출력]
//	면적: 50
//	둘레: 30
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
		rect.width = sc.nextInt();
		rect.height = sc.nextInt();
		
		rect.area();
		rect.length();
	}

}
