package homework.loop;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수(1~50) : ");
			int num = sc.nextInt();
			
			if (num < 1 || num > 50) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
			} else {
				int sum = 0;
				for (int i = 2; i <= num; i+=2) {
//				for (int i = 1; i <= num; i++) {
//					if (i % 2 == 0) {
						sum += i;
//					}
				}
				System.out.println("합계: " + sum);
				break;
			}
		}
	}

}
