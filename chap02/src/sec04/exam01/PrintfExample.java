package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);
		System.out.printf("상품의 가격: %-6d원\n", value);
		System.out.printf("상품의 가격: %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이: %2$10.2f\n", 10, area);
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area); // 순번을 생략하면 차례대로 대입됨
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s", 1, name, job);
	}

}
