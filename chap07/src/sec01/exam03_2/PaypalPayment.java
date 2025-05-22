package sec01.exam03_2;

// 자식 클래스: 페이팔 결제
public class PaypalPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("Paypal 결제 선택됨");
		System.out.println("Paypal 서버와 연결 중...");
		System.out.println("Paypal로 " + amount + "원 결제 완료");
	}
}
