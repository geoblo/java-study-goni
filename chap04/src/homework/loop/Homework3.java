package homework.loop;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (;;) {
			System.out.print("입력: ");
			String input = sc.nextLine();
			
			if ("탈출".equals(input)) {
				break;
			}
			
			System.out.println(input);
		}
		
		System.out.println("프로그램 종료");
	}

}
