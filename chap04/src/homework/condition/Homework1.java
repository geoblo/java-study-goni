package homework.condition;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = scanner.nextInt();
		
		int fee;

        if (age < 3) { // 3세 미만
            fee = 0;
        } else if (age <= 12) { // 3세 ~ 12세
            fee = 10000;
        } else if (age <= 18) { // 13세 ~ 18세
            fee = 20000;
        } else if (age <= 64) { // 19세 ~ 64세
            fee = 30000;
        } else { // 65세 이상
            fee = 0;
        }

        System.out.println("요금은 " + fee + "원입니다.");
	}

}
