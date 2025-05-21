package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		// 반지름이 10cm인 원의 넓이 구하기
		
		// 잘못된 접근 방식(굳이 메모리를 낭비하는 방식)
//		Calculator calc = new Calculator();
//		double result1 = 10 * 10 * calc.pi;
		
		// static 접근 방식
		double result1 = 10 * 10 * Calculator.pi;
		System.out.println("result1: " + result1);
		
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}

}
