package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민번호 입력(-): ");
        String ssn = scanner.nextLine();
        
        // 인덱스 7번째 문자
        char genderCode = ssn.charAt(7);
        
        String gender = (genderCode == '1' || genderCode == '3') ? "남성" : 
        	 			((genderCode == '2' || genderCode == '4') ? "여성" :	"잘못된 값");
        
        System.out.println("입력하신 주민번호는 " + gender + "입니다.");
	}

}
