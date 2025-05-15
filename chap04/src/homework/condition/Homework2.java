package homework.condition;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월: ");
        int month = scanner.nextInt();

        System.out.print("기온: ");
        int temperature = scanner.nextInt();

        String season = "";
        
        // Early Return 패턴
        // 에러나 예외 조건을 먼저 검사하고 처리한 다음, 성공 케이스는 마지막에 처리하는 구조
        // 장점: 1) 코드 가독성이 좋아짐 2) 코드의 중첩을 줄일 수 있음
        if (month < 1 || month > 12) {
        	System.out.println("해당하는 계절이 없습니다.");
        	return;
        }
        
        if (month >= 3 && month <= 5) {
        	season = "봄";
        } else if (month >= 6 && month <= 8) {
        	season = "여름";
        	
        	if (temperature >= 35) {
            	season += " 폭염 경보";
            } else if (temperature >= 33) {
            	season += " 폭염 주의보";
            }
        } else if (month >= 9 && month <= 11) {
        	season = "가을";
        } else {
        	season = "겨울";
        	
        	if (temperature <= -15) {
            	season += " 한파 경보";
            } else if (temperature <= -12) {
            	season += " 한파 주의보";
            }
        }
        
        System.out.println(season);
	}

}
