package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("말해보세요: ");
		String input = scanner.nextLine();
		
		// 삼항(조건) 연산자 이용
//		String output = input.equals("간다") ? "온다" : "간다";
		String output = "간다".equals(input) ? "온다" : "간다";
		
		System.out.println("앵무새: " + output);
	}

}
