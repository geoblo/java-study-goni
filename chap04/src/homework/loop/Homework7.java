package homework.loop;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("정수: ");
			int num = sc.nextInt();
			
			if (num <= 0) {
				System.out.println("양수가 아닙니다.");
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.print(i % 2 != 0 ? '박' : '수');
				}
				break;
			}
				
		}
			
	}

}
