package sec01.exam13.quiz;

import java.io.FileReader;
import java.io.Reader;

public class Quiz1 {
	// Quiz
//	FileReader를 사용하여 
//	"C:/Temp/output.txt" 파일을 읽어와서 콘솔에 표준 출력하세요.
		
//  힌트: 읽은 char 배열을 문자열로 변환 후 출력 
//	     또는 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 하나씩 출력
	public static void main(String[] args) {
		char[] buffer = new char[100];
		
		try (Reader reader = new FileReader("C:/Temp/output.txt")) {
			int readCharNum;
			while ((readCharNum = reader.read(buffer)) != -1) {
				// 읽은 char 배열을 문자열로 변환 후 출력 
//				String data = new String(buffer, 0, readCharNum);
//				System.out.println(data);
				
				// 또는 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 하나씩 출력
				// 문자 하나씩 직접 처리해야 하는 경우
				for (int i = 0; i < readCharNum; i++) {
					System.out.print(buffer[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
