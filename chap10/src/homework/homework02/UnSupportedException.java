package homework.homework02;

public class UnSupportedException extends RuntimeException {
	public UnSupportedException() {
	}
	
	public UnSupportedException(String message) {
		super(message);
	}
	
	// getMessage() 오버라이딩
	// 고정 메시지 또는 동적 메시지를 제어하고 싶을 때 드물게 사용
	@Override
	public String getMessage() {
		return "원인을 알 수 없는 오류가 발생했습니다.";
	}
}
