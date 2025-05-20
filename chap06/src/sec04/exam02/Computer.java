package sec04.exam02;

public class Computer {
	// 매개값의 수와 상관없이 매개값을 다 더해서 리턴하는 메소드
	
	// 1. 매개 변수를 배열 타입으로 선언
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	// 2. 가변인자 ...
	// 자바는 values를 배열 타입으로 간주하고 내부적으로는 배열처럼 사용
	int sum2(int ... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
}
