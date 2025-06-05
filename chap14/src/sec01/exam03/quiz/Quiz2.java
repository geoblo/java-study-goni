package sec01.exam03.quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Quiz2 {
	// Quiz
//	FileOutputStream을 사용하여 
//	"C:/Temp" 폴더에 생성된 애국가1.dat 파일에 아래와 같은 문장을 추가하세요.
//	실행을 할 때마다 한 번씩 추가돼야 합니다.
		
//	String str = "\n남산위에 저 소나무 철갑을 두른듯"
//			+ "\n바람서리 불변함은 우리기상 일세"
//			+ "\n무궁화 삼천리 화려강산 "
//			+ "\n대한사람 대한으로 길이보전하세";
		
//  힌트: FileOutputStream 생성자의 두 번째 매개변수(append: 덧붙이다)를 설정
	
	public static void main(String[] args) {
		String str = "\n남산위에 저 소나무 철갑을 두른듯"
				+ "\n바람서리 불변함은 우리기상 일세"
				+ "\n무궁화 삼천리 화려강산 "
				+ "\n대한사람 대한으로 길이보전하세";
		
		try (OutputStream os = new FileOutputStream("C:/Temp/애국가1.dat", true)) {
			byte[] bytes = str.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("파일 저장 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
