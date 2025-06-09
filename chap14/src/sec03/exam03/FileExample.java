package sec03.exam03;

import java.io.File;
import java.io.IOException;

// File 클래스
// 파일 및 폴더 생성과 삭제
// 파일 및 폴더의 정보(이름, 경로, 크기, 최종 수정일 등) 제공
public class FileExample {

	public static void main(String[] args) {
		// 경로 구분자
		// Windows: \(역슬래시) + 호환성과 편의성을 위해 /도 자동으로 \로 변환하여 처리
		// UNIX/Linux/macOS: /(슬래시)
		
		// 자바는 별개로 File, Path 등 경로 관련 클래스 내부적으로 플랫폼별 경로 구분자 처리를 자동으로 해줌
		
		// 파일 객체 생성
		// 생성자에 상대 경로(프로젝트 루트 기준) 또는 절대 경로 작성
		// 파일 객체를 생성했다고 해서 파일이나 폴더가 생성되는 것은 아님
		// 문자열 경로에 실제 파일이나 폴더가 없더라도 예외가 발생하지 않음
		File dir = new File("C:/Temp/images");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		File file3 = new File("C:\\Temp\\file3.txt"); // 문자열에서는 \\로 이스케이프 필요
		
		// 해당 경로에 실제 파일이나 폴더가 있는지 검사
		// 존재하지 않으면 생성
		// 폴더 생성
		if (!dir.exists()) dir.mkdirs(); 
		
		// 파일 생성
		try {
			if (!file1.exists()) file1.createNewFile();
			if (!file2.exists()) file2.createNewFile();
			if (!file3.exists()) file3.createNewFile();
		} catch (IOException e) {
			System.out.println("파일 생성 중 오류 발생");
		}
		
		// 폴더 생성 2가지 방법 차이점
		// mkdir() vs mkdirs() - 주로 사용
		File dirTest = new File("C:/Temp/test/videos");
//		if (!dirTest.exists()) dirTest.mkdir(); // 경로상 맨뒤 폴더만 생성(앞에 상위 폴더가 있어야 함)
		if (!dirTest.exists()) dirTest.mkdirs(); // 경로상에 없는 모든 폴더를 생성
		
		// 폴더 삭제
		// 폴더가 비어있어야만 삭제가 가능
		// 폴더 안에 파일이나 하위 폴더가 있다면 먼저 삭제해야 함
		
		
		dirTest = new File("C:/Temp/test");
		if (dirTest.delete()) {
			System.out.println("test 폴더 삭제 완료");
		}
		
		
		
		
	}

}
