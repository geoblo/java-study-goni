package homework;

import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어: ");
		double korean = scanner.nextDouble();
		
		System.out.print("영어: ");
		double english = scanner.nextDouble();

		System.out.print("수학: ");
		double math = scanner.nextDouble();
		
		int total = (int) (korean + english + math);
		int avg = total / 3;

		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
	}
}
