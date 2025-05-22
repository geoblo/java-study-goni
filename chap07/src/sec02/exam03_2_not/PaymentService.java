package sec02.exam03_2_not;

// 다형성 없이 if-else if 문으로 구현
public class PaymentService {
	public void pay(String type, int amount) {
		if ("card".equals(type)) {
			System.out.println("카드 결제 선택됨");
			System.out.println("카드사 승인 요청 중...");
			System.out.println("카드로 " + amount + "원 결제 완료");
		} else if ("paypal".equals(type)) {
			System.out.println("Paypal 결제 선택됨");
			System.out.println("Paypal 서버와 연결 중...");
			System.out.println("Paypal로 " + amount + "원 결제 완료");
		} else if ("bank".equals(type)) {
			System.out.println("계좌이체 결제 선택됨");
			System.out.println("가상 계좌로 입금 확인 중...");
			System.out.println("계좌이체로 " + amount + "원 결제 완료");
		} else {
			System.out.println("지원하지 않는 결제 수단입니다.");
		}
	}
	
	// 단점
	// 새로운 결제 방식이 추가되면 if-else 또는 switch에 조건을 계속 추가해야 함
	// 확장할 때마다 기존 코드 수정 필요
	// 객체지향적이지 않음, 테스트와 유지보수가 어렵고 유연하지 않음
	
	// 다형성을 활용하면
	// 유지보수: 새로운 결제 수단 추가 시 기존 코드 수정 없이 자식클래스만 추가
	// 확장성: 객체 교체만으로 기능 변경 가능
	// 가독성: if-else가 없어 깔끔하고 명확
}
