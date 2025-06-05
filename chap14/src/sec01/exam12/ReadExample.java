package sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test8.txt");
		
		// 길이가 100인 char 타입의 빈 배열 생성
		char[] buffer = new char[100];
		
		while (true) {
			// 입력 스트림으로부터 배열의 길이만큼 읽어옴
			int readCharNum = reader.read(buffer);
			if (readCharNum == -1) break;
			
			// 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
			for (int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		reader.close();
		
		// 많은 양의 문자를 읽을 때는 read(char[] cbuf) 메소드를 사용하는 것이 좋다.
		// 입력 스트림으로부터 100개의 문자가 들어온다면
		// read()는 100번을 반복해서 읽어야 하지만
		// read(char[] cbuf)는 한 번 읽을 때 배열 길이만큼 읽기 때문에 읽는 횟수가 줄어듦
	}

}
