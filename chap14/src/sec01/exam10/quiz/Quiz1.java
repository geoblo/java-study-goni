package sec01.exam10.quiz;

import java.io.FileWriter;
import java.io.Writer;

public class Quiz1 {
	// Quiz
//	FileWriter를 사용하여 
//	"C:/Temp/output.txt" 파일을 생성하고
//	output.txt 파일 안에 아래 배열의 요소를 한 줄에 하나씩 추가해주세요.
//	String[] lines = {"첫 번째 줄입니다.", "두 번째 줄입니다.", "세 번째 줄입니다."};

//  힌트: 줄바꿈하는 방법 "\r\n" 또는 "\n"
	
	public static void main(String[] args) {
		String[] lines = {"첫 번째 줄입니다.", "두 번째 줄입니다.", "세 번째 줄입니다."};
		
		try (Writer writer = new FileWriter("C:/Temp/output.txt")) {
			for (String line : lines) {
				writer.write(line + "\n");
			}
			writer.flush();
			System.out.println("파일 저장 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
