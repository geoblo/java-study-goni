package homework.homework10;

public class Account {
	private String accountNumber; // 계좌번호
	private int balance; // 잔액
	
	public Account() {}

	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
        System.out.println(amount + "원을 입금했습니다. 현재 잔액: " + balance + "원");
	}
	
	public void withdraw(int amount) {
		if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
	}
}
