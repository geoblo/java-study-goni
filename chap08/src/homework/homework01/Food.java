package homework.homework01;

public class Food extends Product {
	private int expirationDays;
	
	public Food() {
	}
	
	public Food(String name, int price, int expirationDays) {
		super(name, price);
		this.expirationDays = expirationDays;
	}
	
	public int getExpirationDays() {
		return expirationDays;
	}
	
	public int calculateDiscountRate() {
		int discountRate = 0;
		if (expirationDays <= 1) {
			discountRate = 80;
		} else if (expirationDays <= 5) {
			discountRate = 50;
		} else if (expirationDays <= 10) {
			discountRate = 20;
		}
		return discountRate;
	}
	
	@Override
	public int calculatePrice() {
		int price = super.getPrice(); // super 생략 가능
		int discountRate = calculateDiscountRate();
		return price - (price * discountRate / 100);
	}
}
