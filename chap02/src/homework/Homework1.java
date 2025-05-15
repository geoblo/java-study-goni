package homework;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몸무게(kg): ");
		double weight = scanner.nextDouble();
		
		System.out.print("키(m): ");
		double height = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수: " + bmi);
	}
}
