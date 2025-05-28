package sec01.exam09;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		// Class 객체
		// 자바에서 해당 클래스의 메타데이터를 표현하는 객체
		// JVM 내에서 한 클래스당 하나의 Class 객체만 존재
		
		// Car 클래스의 Class 객체 얻기
		// 방법1
		Class clazz = Car.class;
		
		// 방법2
		Class clazz2 = Class.forName("sec01.exam09.Car");
		
		// 방법3
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		// 참고: 방법1, 2, 3 모두 같은 Class 객체를 참조
		
		System.out.println(clazz.getName()); // 클래스의 전체 이름
		System.out.println(clazz.getSimpleName()); // 패키지 이름을 제외한 순수 클래스 이름
		System.out.println(clazz.getPackage().getName()); // 패키지 이름
		System.out.println(clazz.getPackageName()); // 위와 동일(자바9 부터 추가)
		
		// 이 외에도 필드/생성자/메소드 정보도 얻을 수 있는데
		// 이 정보를 얻어 활용하는 것을 자바에서는 "리플렉션"이라고 부름
	}

}
