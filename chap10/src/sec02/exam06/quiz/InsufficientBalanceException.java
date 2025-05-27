package sec02.exam06.quiz;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
        super(message); // 예외 메시지를 상위 Exception 클래스에 전달
    }
}
