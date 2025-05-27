package sec02.exam05;

public class ThrowsExample {
	// main을 호출하는 JVM 쪽으로 예외를 떠넘기기
	// => 콘솔에 예외 내용을 출력하고 프로그램 종료
//	public static void main(String[] args) throws ClassNotFoundException {
	public static void main(String[] args) {
		try {
			findClass(); // 여기서 컴파일 에러 발생: Unhandled exception
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace(); // 현재 발생된 예외의 내용을 추적해서 프린트, 개발 시에만 디버깅 용도로 사용
			System.out.println(e.getMessage()); // 예외 메시지 출력, 예외를 발생시킬 때 생성자 매개값으로 사용한 메시지 리턴
			System.out.println(e.toString()); // 예외 클래스 이름과 메시지를 함께 출력
		}
	}
	
	// 직접 처리하지 않고 호출한 쪽에서 다양한 방식으로 처리할 수 있도록 예외 떠넘기기
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
