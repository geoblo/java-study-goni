package homework.condition;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수: ");
        int num2 = scanner.nextInt();

        System.out.print("세 번째 정수: ");
        int num3 = scanner.nextInt();
        
        int min = (num1 < num2) ? 
        		  ((num1 < num3) ? num1 : num3) : 
        		  ((num2 < num3) ? num2 : num3);
        
        System.out.println("가장 작은 수: " + min);
	}

}
