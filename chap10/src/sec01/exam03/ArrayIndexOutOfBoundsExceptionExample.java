package sec01.exam03;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// 사용자의 잘못된 사용까지도 고려하는 좋은 프로그래밍
		if (args.length == 2) {
			String data1 = args[0]; // 예외 발생
			String data2 = args[1];
			
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		} else {
			System.out.println("두 개의 실행 매개값이 필요합니다.");
		}
		// 위 코드는 예외 처리 코드는 아님
		// 예외 처리는 예외가 발생하고 나서 실행되는 코드로 예외 발생 시 어떻게 처리할지를 작성
	}

}
