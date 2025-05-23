package sec03.exam03;

// 부모 클래스: 공통 결제 서비스 -> (추상화) -> 추상 클래스: 결제 서비스의 공통 설계도
public abstract class PaymentService {
//	public void pay(int amount) { // <-- 실제로는 실행 안됨
//		System.out.println("결제 금액: " + amount + "원");
//		System.out.println("결제를 처리합니다.");
//	}
	
	// 결제 메소드: 서브 클래스에서 반드시 구현해야 함
	public abstract void pay(int amount);
}
