package homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length;
		
		// 유효한 값을 입력 받을 때까지 반복
		while (true) {
			System.out.print("3이상의 홀수를 입력하세요: ");
			length = sc.nextInt();
			
			if (length >= 3 && length % 2 == 1) {
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		
		int[] arr = new int[length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i <= length / 2) ? i + 1 : length - i;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) System.out.print(", ");
			System.out.print(arr[i]);
		}
	}
}
