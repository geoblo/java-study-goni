package sec01.exam23;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Wrapper(포장) 객체: 기본 타입의 값을 갖는 객체
		
		// 박싱(Boxing): 기본 타입의 값 -> 포장 객체
		// 1. 생성자 이용
		Integer obj1 = new Integer(100); // 기본 타입 값 100을 포장하는 Interger 객체
		Integer obj2 = new Integer("100"); // 내부적으로 문자열이 int로 변환되어 Integer 객체가 만들어짐
		
		// 2. valueOf() 메소드 이용
		Integer obj3 = Integer.valueOf(300);
		Integer obj4 = Integer.valueOf("400");
		
		// 언박싱(Unboxing): 포장 객체 -> 기본 타입의 값
		int value1 = obj1.intValue(); // obj1 객체 안에 있는 기본 타입의 값을 꺼냄
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		int value4 = obj4.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}

}
