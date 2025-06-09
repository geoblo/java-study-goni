package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
	// 파일로 문자를 저장하고, 저장된 문자를 다시 읽는 예제
	// 사용하는 소스 스트림(기본 스트림)은 바이트 기반 입출력 스트림이지만,
	// 이들 스트림을 직접 사용하지 않고 각각 Writer와 Reader로 변환해서 사용

	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt"); // 바이트 기반 파일 출력 스트림
		// 문자열을 바이트 배열로 만든 다음에 출력해도 되지만
		// 여기서는 편의를 위해 보조 스트림을 연결해서 문자 -> 바이트로 자동 변환
		Writer writer = new OutputStreamWriter(fos); // 문자 기반 출력 보조 스트림을 연결
		// 문자 출력 스트림인 Writer로 변환
		
		writer.write(str); // 문자열을 바로 쓸 수 있음
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt"); // 바이트 기반 파일 입력 스트림
		// 바이트를 읽어서 문자열로 변환한 다음 사용해도 되지만
		// 여기서는 보조 스트림을 연결해서 바이트 -> 문자로 자동 변환
		Reader reader = new InputStreamReader(fis); // 문자 기반 입력 보조 스트림을 연결
		// 문자 입력 스트림인 Reader로 변환
		
		char[] buffer = new char[100]; // 보조 스트림 연결로 char[] 이용 가능!
		int readCharNum = reader.read(buffer); // 최대 100자를 읽고 배열에 저장
		reader.close();
		
		// 디코딩이 되어 문자로 바로 읽을 수 있음!
		for (int i = 0; i < readCharNum; i++) {
			System.out.print(buffer[i]);
		}
		System.out.println();
		
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
}
