package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구슬의 개수: ");
		int beads = scanner.nextInt();
		
		String result = (beads % 2 == 0) ? "짝수" : "홀수";
		System.out.println("구슬의 개수는 " + result + "입니다.");
	}

}
