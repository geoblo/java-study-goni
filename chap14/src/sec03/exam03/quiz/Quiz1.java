package sec03.exam03.quiz;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Quiz1 {
	// Quiz
//	C 드라이브 아래에 test\sub 폴더를 생성하세요.
//	그리고 아래와 같이 test\sub 경로에 오늘 날짜 이름의 폴더를 생성하세요.
//	오늘 날짜 정보는 LocalDate를 통해서 가져옵니다.

//	C:\test\sub\2025\06\06

//	해당 폴더가 없을 때만 생성될 수 있도록 조건문을 반드시 추가하세요.

//	상황에 맞게 아래의 문장을 출력하세요.

//	[출력]
//	폴더 생성 성공
//	폴더 생성 실패
//	이미 존재하는 폴더
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		String basePath = "C:/test/sub/";
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		File dir = new File(basePath + today.format(formatter));
		
		// 또 다른 방법
		String subPath = String.format("%d/%02d/%02d", 
										today.getYear(), 
										today.getMonthValue(), 
										today.getDayOfMonth());
		System.out.println(subPath);
		File dir = new File(basePath + subPath);
		
		if (!dir.exists()) {
			if (dir.mkdirs()) {
				System.out.println("폴더 생성 성공");
			} else {
				System.out.println("폴더 생성 실패");				
			}
		} else {
			System.out.println("이미 존재하는 폴더");
		}
	}

}
