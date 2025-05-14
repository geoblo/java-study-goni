package sec04.exam03;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while (true) { // 무한 반복
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
	}

}
