package sec01.exam03_2;

public class PaymentExample {

	public static void main(String[] args) {
//		CardPayment cardPayment = new CardPayment();
//		cardPayment.pay(50000);
		
		PaymentService payment;
		
		payment = new CardPayment();
		payment.pay(50000); // 카드 결제
		
		payment = new PaypalPayment();
		payment.pay(30000); // Paypal 결제
		
		payment = new BankTransferPayment();
		payment.pay(20000); // 계좌이체 결제
	}
	
	// 중요: 오버라이딩은 다형성을 구현하는 핵심 개념 중 하나
	// 다형성을 활용하면 부모 타입 PaymentService로 참조해도 실제 동작은 자식 클래스에 재정의된 메소드 실행
	// 장점: 새로운 결제 수단이 추가되어도 기존 구조를 수정하지 않고 pay()만 재정의하면 됨
}
