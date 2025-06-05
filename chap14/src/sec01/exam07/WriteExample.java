package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test7.txt 파일로 하는 문자 기반 파일 출력 스트림을 생성
		Writer writer = new FileWriter("C:/Temp/test7.txt"); // 파일에 문자를 저장하는 기능을 가짐
		
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
		// 3바이트로 저장됨
		
		char a = '가';
		char b = '나';
		char c = '다';
		// 9바이트로 저장됨
		
		// 한 문자(2byte)씩 세 번 출력
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
	}

}
