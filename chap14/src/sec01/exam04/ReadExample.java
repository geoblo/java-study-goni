package sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test1.db 파일로 하는 바이트 기반 파일 입력 스트림을 생성
		InputStream is = new FileInputStream("C:/Temp/test1.db"); // 파일로부터 바이트 데이터를 읽을 수 있는 기능을 가짐
		
		while (true) {
			// 입력 스트림으로부터 1byte씩 읽어오고
			// 읽은 바이트를 리턴함
			int data = is.read();
			if (data == -1) break; // 파일 끝에 도달하여 더 이상 읽어올 바이트가 없을 경우
			System.out.println(data);
		}
		
		is.close();
	}

}
