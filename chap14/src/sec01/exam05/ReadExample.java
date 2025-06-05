package sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test2.db");
	
		// 길이가 100인 byte 타입의 빈 배열 생성
		byte[] buffer = new byte[100];
		
		while (true) {
			// 입력 스트림으로부터 배열의 길이만큼 읽어옴
			int readByteNum = is.read(buffer); // 읽어올 데이터가 배열의 길이보다 적을 경우 읽을 수 있는 만큼만 읽음
			if (readByteNum == -1) break;
			
			// 읽은 바이트 수만큼 반복하면서 배열에 저장된 바이트를 출력
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);				
			}
		}
		
		is.close();
		
		// 많은 양의 바이트를 읽을 때는 read(byte[] b) 메소드를 사용하는 것이 좋다.
		// 입력 스트림으로부터 100개의 바이트가 들어온다면
		// read()는 100번을 반복해서 읽어야 하지만
		// read(byte[] b)는 한 번 읽을 때 배열 길이만큼 읽기 때문에 읽는 횟수가 줄어듦
	}

}
