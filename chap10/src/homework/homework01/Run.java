package homework.homework01;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randNum = (int) (Math.random() * 50) + 1;
		int inputNum;
		int count = 0;

		while (true) {
			System.out.print("1~50 사이의 숫자: ");
			
			try {
				inputNum = sc.nextInt(); // InputMismatchException 발생
			} catch (Exception e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				
				// 예외 발생 시 문자 입력값 자체는 여전히 Scanner의 입력 버퍼에 남아 있음
				// 다음 반복에서 sc.nextInt()는 여전히 입력 버퍼에 남아 있는 잘못된 문자를 읽으려 하면서 또 예외 발생
				sc.nextLine();
				continue;
			}
			
			count++;
			
			if (randNum > inputNum) {
				System.out.println("Up!");
			} else if (randNum < inputNum) {
				System.out.println("Down!");
			} else {
				System.out.println("축하합니다~ 정답이에요." + count + "번 만에 맞췄습니다.");
				break;
			}
		}
	}
	
}
