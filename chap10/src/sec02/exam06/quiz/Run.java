package sec02.exam06.quiz;

public class Run {
		// Quiz
//		은행 계좌를 관리하는 Account 클래스를 만들고, 
//		출금 시 잔액이 부족하면 사용자 정의 예외 InsufficientBalanceException이 발생하도록 하세요.

//		1. 사용자 정의 예외 클래스 InsufficientBalanceException을 정의하세요.
//		일반 예외로 만듭니다.
//		생성자에서 예외 메시지를 전달받아 부모 생성자에 넘깁니다.

//		2. Account 클래스를 정의하세요.
//		1) 필드: 
//			- String user: 예금주
//			- long balance: 잔액
//		2) 생성자:
//			- 기본 생성자
//			- 사용자명과 초기 잔액을 받는 생성자
//		3) Getter
//		4) 메소드:
//			- public void deposit(int amount)
//			입금 금액만큼 잔액에 더하고 출력 예시와 같은 메시지를 출력합니다.
//			- public void withdraw(int amount)
//			출금 금액이 잔액보다 크면 InsufficientBalanceException을 발생시키고 호출한 쪽으로 예외를 떠넘깁니다.
//			출금이 성공하면 잔액에서 차감하고, 출력 예시와 같은 메시지를 출력합니다.

//		3. Run 클래스를 작성하세요.
//		사용자 "김철수"의 계좌를 생성하고 초기 잔액은 10000원을 넣습니다.
//		처음에는 3000원을 출금합니다.
//  	다음으로 5000원을 입금합니다.
//		뒤이어 14000원을 출금 시도합니다.
//		예외 발생 시 "출금 실패: "와 함께 예외 메시지를 같이 출력합니다.
//		마지막으로 남은 잔액을 출력합니다.

//		[출력]
//		3000원이 출금되었습니다. [잔액: 7000원]
//		5000원이 입금되었습니다. [잔액: 12000원]
//		출금 실패: 잔액이 2000원 부족합니다.
//		현재 잔액: 12000원
	
	public static void main(String[] args) {
		// Quiz
		Account account = new Account("김철수", 10000);
		
		try {
			account.withdraw(3000);
			account.deposit(5000);
			account.withdraw(14000);
		} catch (InsufficientBalanceException e) {
			System.out.println("출금 실패: " + e.getMessage());
		}
		
		System.out.println("현재 잔액: " + account.getBalance() + "원");
	}

}
