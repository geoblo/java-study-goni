package homework;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요: ");
		char inputChar = scanner.nextLine().charAt(0);
		
		int unicode = inputChar;
		System.out.println(inputChar + "의 유니코드: " + unicode);
	}
}
