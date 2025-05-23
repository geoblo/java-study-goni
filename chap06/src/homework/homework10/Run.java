package homework.homework10;

public class Run {

	public static void main(String[] args) {
		// 계좌번호가 "123-456-789"이고, 잔액이 100000원인 계좌 생성
		Account account1 = new Account("123-456-789", 100000);
		
		// 계좌번호가 "987-654-321"이고, 잔액이 50000원인 계좌 생성
		Account account2 = new Account("987-654-321", 50000);
				
		// 123-456-789 계좌에서 30000원 출금
		account1.withdraw(30000);
		
		// 987-654-321 계좌에 100000원 입금
		account2.deposit(100000);
		
		// 은행 객체 생성
		// "123-456-789"에서 "987-654-321"으로 50000원 송금
		Bank bank = new Bank();
		bank.transfer(account1, account2, 50000);
		        
	    // 각 계좌의 계좌번호와 잔액 출력
        System.out.println("계좌번호: " + account1.getAccountNumber());
        System.out.println("현재 잔액: " + account1.getBalance());
        System.out.println("계좌번호: " + account2.getAccountNumber());
        System.out.println("현재 잔액: " + account2.getBalance());
	}

}
