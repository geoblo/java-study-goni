package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

// 입출력 스트림이란?
// Stream(스트림): 개울(시내), 흐르다 = 마치 물과 같이 데이터가 흘러서 지나감
// 데이터를 연속된 흐름으로 읽고/쓰는 것
// Java에서는 스트림을 통해 파일, 네트워크, 키보드, 메모리 등에서 데이터를 주고받을 수 있음
// 입력 스트림: 외부 -> 프로그램으로 데이터 읽기
// 출력 스트림: 프로그램 -> 외부로 데이터 쓰기

// 스트림의 종류
// 구분  바이트 기반(1byte)  문자 기반(2byte = char)
// 입력  InputStream       Reader
// 출력  OutputStream      Writer

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test1.db 파일로 하는 바이트 기반 파일 출력 스트림을 생성
		OutputStream os = new FileOutputStream("C:/Temp/test1.db"); // 바이트를 파일에 출력해서 저장하는 기능을 가짐
		
		// 출력할 바이트(0~255까지)
		// 값의 범위를 넘어가면 오버플로우, 언더플로우 발생!
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 출력 스트림을 이용해 출력하는 메소드
		// 1byte씩 세 번 출력
		os.write(a);
		os.write(b);
		os.write(c);
		// write()를 한다고 해서 바로 출력 스트림을 통해서 데이터가 흘러가는 것이 아님
		// 버퍼(임시 저장 공간)에 쌓임
		// 버퍼: 물건을 잠시 담아두는 창고
		// 출력 스트림: 물건을 외부로 보내는 트럭
		
		// 반드시 write() 후에 flush() 수행
		os.flush(); // 버퍼를 비움(버퍼에 쌓여있는 데이터를 한꺼번에 출력)
		
		// 참고: 모든 출력 스트림이 다 버퍼를 갖고 있진 않다.
		// FileOutputStream에는 내부 버퍼가 존재하지 않음
		// 즉, write() 시 곧바로 OS에 전달되어 출력
		// flush()가 필수가 아니지만, 그래도 명시적으로 호출하는 것이 안전
		// 내부적으로 버퍼를 사용하는 클래스들은 flush()가 필수
		
		// 더 이상 쓰지 않을 때는 출력 스트림 닫기
		os.close(); // 출력 스트림이 사용했던 자원들(메모리)을 풀어주기 위해
		// close() 안에서도 스트림을 닫기 전에 flush() 기능을 수행함
		
		// 참고: try-with-resources
		// 리소스를 자동으로 닫아주는 try 문법
		// close()를 명시적으로 호출하지 않아도, try 블록이 끝나거나 예외가 발생되는 즉시 자동으로 자원 정리
		// AutoCloseable을 구현한 클래스는 try-with-resources로 자동 종료 가능
//		try (OutputStream os2 = new FileOutputStream("C:/Temp/test1.db")) {
//			os2.write(a);
//			os2.write(b);
//			os2.write(c);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// 참고: 바이너리 파일, 바이너리 데이터란?
		// 말 그대로 0과 1로 이루어진 이진 데이터
		// 물론 컴퓨터 내부에서 모든 데이터는 0과 1로 처리되지만,
		// 우리가 다루는 데이터는 크게 두 종류로 나눌 수 있음
		// 1. 텍스트 데이터: 사람이 읽을 수 있는 문자 중심의 데이터(예: "hello", "123", "이것은 텍스트")
		// 2. 바이너리 데이터: 사람이 읽을 수 없는 0과 1의 이진 형식으로 저장된 데이터
		// (예: 이미지, 동영상, 음악, pdf, 실행파일 등 텍스트 아닌 모든 데이터)
	}

}
