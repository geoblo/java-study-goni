package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 과목별 점수 입력 받기
	    System.out.print("국어: ");
	    int korean = scanner.nextInt();
	    
	    System.out.print("수학: ");
	    int math = scanner.nextInt();
	    
	    System.out.print("영어: ");
	    int english = scanner.nextInt();
	    
	    // 합계
	    int total = korean + math + english;
	    
	    // 평균
	    double avg = total / 3.0;
	    
	    // 휴대폰을 바꿀 수 있는지 여부
	    boolean canChangePhone = (korean >= 60 && math >= 60 && english >= 60 && avg > 90) ?
	    		true : false;
	    
	    System.out.println("합계: " + total + "점");
	    System.out.println("평균: " + avg + "점");
	    System.out.println(canChangePhone ? "휴대폰을 바꿀 수 있습니다." : "휴대폰을 바꿀 수 없습니다.");
	}

}
