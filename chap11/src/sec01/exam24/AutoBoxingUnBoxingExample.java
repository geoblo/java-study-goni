package sec01.exam24;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// 자동 박싱
		Integer obj = 100; // Wrapper 객체가 생성되고 생성된 객체의 번지가 대입
		System.out.println("value: " + obj.intValue());
		
		// 대입 시 자동 언박싱
		int value = obj; // Wrapper 객체 안에 있는 기본 타입 값을 꺼내 대입
		System.out.println("value: " + value);
		
		// 연산 시 자동 언박싱
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}
