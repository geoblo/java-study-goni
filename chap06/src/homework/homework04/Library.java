package homework.homework04;

public class Library {
	// 전달된 메시지 출력
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	// 1~100 까지의 합 반환
	public int sum1To100() {
		int sum = 0; 
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	// 전달된 정수가 홀수인지 짝수인지 반환
	public String checkEvenOdd(int number) {
		String result = "홀수";
		if (number % 2 == 0) {
			result = "짝수";
		}
		return result;
	}
	
	// 영문자 여부 확인후 결과 반환
	public boolean hasEnglishChar(String text) {
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				return true;
			}
		}
		
		return false;
	}
	
	// 문자열, 문자 전달받아 문자열에 해당 문자 몇 개 있는지 출력
	public void checkCharCount(String text, char check) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == check) {
				count++;
			}
		}
		System.out.println(count + "개");
	}
	
	// 전달된 정수의 구구단 출력
	public void printGoogoodan(int num) {
		System.out.println("=== " + num + "단 ===");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
