package homework.homework03;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String email = sc.nextLine().trim(); // 공백 제거
		
		// 1. 유효한 도메인인지 먼저 확인
        if (!email.endsWith("@goodee.co.kr")) {
            System.out.println("유효하지 않은 이메일입니다.");
            return;
        }
        
        // 2. @의 위치 확인
        int atIndex = email.indexOf('@');
        if (atIndex <= 0) { // atIndex가 0이면 아이디가 없다는 의미이므로
            System.out.println("유효하지 않은 이메일입니다.");
            return;
        }
        
        // 3. 아이디 추출 및 출력
        String id = email.substring(0, atIndex).toUpperCase();
        System.out.println("아이디: " + id);
	}

}
