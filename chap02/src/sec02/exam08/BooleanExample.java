package sec02.exam08;

public class BooleanExample {

	public static void main(String[] args) {
		// boolean(1byte)
		// true, false 2가지 상태값을 저장
		// 제어문(조건문, 반복문)에서 실행 흐름을 변경할 때 주로 사용
		
//		boolean stop = true;
		boolean stop = false;
		
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}

}
