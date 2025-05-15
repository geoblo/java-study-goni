package homework;

import java.util.Scanner;

public class Homework6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요: ");
	    char digitChar = scanner.nextLine().charAt(0);
	    
	    // char 타입의 숫자값을 정수로 변환하여 계산
	    int digit = digitChar - '0';
	    int square = digit * digit;
	    
	    System.out.println("입력한 숫자의 제곱은 " + square + "입니다.");
	}
}
