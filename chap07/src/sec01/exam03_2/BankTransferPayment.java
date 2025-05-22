package sec01.exam03_2;

// 자식 클래스: 계좌이체 결제
public class BankTransferPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("계좌이체 결제 선택됨");
		System.out.println("가상 계좌로 입금 확인 중...");
		System.out.println("계좌이체로 " + amount + "원 결제 완료");
	}
}
