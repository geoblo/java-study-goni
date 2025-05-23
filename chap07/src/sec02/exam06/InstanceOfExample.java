package sec02.exam06;

public class InstanceOfExample {

	public static void main(String[] args) {
		// 테스트 먼저
		Parent parent = new Parent();
//		Child child = (Child) parent; // ClassCastException 예외 발생
		// 강제 타입 변환을 하기 전에 검사(안전한 코딩)
		// 검사할 객체(좌측) instanceOf 클래스 타입(우측)
		if (parent instanceof Child) { // parent 변수가 참조하는 객체가 Child 타입인지 검사
			Child child = (Child) parent; // 강제 타입 변환
			System.out.println("강제 타입 변환 성공");
		}
		
		// 자바 12부터 추가된 문법
		// instanceOf의 결과가 true일 경우 자동 타입 변환되어 변수에 대입
		if (parent instanceof Child child) {
			System.out.println("강제 타입 변환 성공");
		}
		
		
	}

}
