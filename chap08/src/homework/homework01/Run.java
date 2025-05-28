package homework.homework01;

public class Run {

	public static void main(String[] args) {
		// 1. Produt 타입의 참조변수를 2개 생성합니다.
		// 2. Food와 Book의 매개변수가 있는 생성자로 참조변수에 할당합니다.
		Product p1 = new Food("치킨", 20000, 3);
		Product p2 = new Book("자바의 정석", 15000);
		
		// 3. 2개의 할인된 금액을 계산합니다.
		// 4. 상품의 최종가격을 출력합니다.
		System.out.println(p1.getName() + "의 최종 가격: " + p1.calculatePrice());
		System.out.println(p2.getName() + "의 최종 가격: " + p2.calculatePrice());
	}

}
