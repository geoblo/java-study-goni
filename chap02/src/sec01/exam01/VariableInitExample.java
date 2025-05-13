package sec01.exam01;

public class VariableInitExample {
	public static void main(String[] args) {
//		int value;
//		int result = value + 10; // 컴파일 에러
		// 초기화를 하지 않은 변수는 메모리에 생성되지 않기에 값을 읽을 수 없음
		// 초기화: 변수에 최초로 값을 저장하는 행위
		
		int value = 30;
		int result = value + 10;
		System.out.println(result);
	}
}
