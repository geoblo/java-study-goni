package sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		// 데이터 출발지를 test7.txt 파일로 하는 문자 기반 파일 입력 스트림을 생성
		Reader reader = new FileReader("C:/Temp/test7.txt"); // 파일로부터 문자 데이터를 읽을 수 있는 기능을 가짐
		
		while (true) {
			// 입력 스트림으로부터 한 문자(2byte)씩 읽어오고
			// int(4byte) 타입으로 리턴
			int data = reader.read();
			System.out.println(data);
			if (data == -1) break;
			
			// read() 메소드가 리턴한 int 값을 char 타입으로 변환하면 읽은 문자를 얻을 수 있음
			System.out.println((char) data);
		}
		
		reader.close();
	}

}
