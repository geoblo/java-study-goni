package sec02.exam06;

// 사용자 정의 예외 클래스 만들기
// 자바에서 제공하는 표준 예외 클래스 외에, 특정 상황에 맞는 예외를 만들어야 할 때 사용
// 사용자 정의 예외는 Exception 또는 RuntimeException을 상속해서 만든다.
// Exception을 상속하면 일반 예외(체크 예외)
// RuntimeException을 상속하면 실행 예외(언체크 예외)가 됨
public class InvalidAgeException extends RuntimeException {
	public InvalidAgeException(String message) {
		super(message); // 부모 생성자에 예외 메시지 전달
	}
}
