package sec01.quiz_string;

import java.util.Scanner;

public class Quiz1 {
	// Quiz
//	문자열을 입력 받아 입력된 문자열 중 숫자들의 합계를 출력하시오.

//	[입력]
//	1) 1,2,3,4,5
//	2) 1-2-3-4-5
//	3) a1b2c3de45

//	[출력]
//	1) 15
//	2) 15
//	3) 15
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("문자열 입력: ");
        String input = sc.nextLine();
        
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			// 숫자인지 직접 체크: '0'~'9' 사이인지 확인
			// 참고: Character.isDigit(ch)
			if (ch >= '0' && ch <= '9') {
				// 문자를 정수로 변환
				// 참고: Character.getNumericValue(ch), Integer.parseInt(String.valueOf(ch))
				int digit = ch - '0';
				sum += digit;
			}
		}
        
        System.out.println("합계: " + sum);
	}

}
