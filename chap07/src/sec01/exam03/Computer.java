package sec01.exam03;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; // 자바에서 제공하는 정확한 PI값 사용하도록 변경
	}
	
	// 메소드 선언부가 틀렸을 때 예시
//	@Override // 오버라이딩이 제대로 되었는지 컴파일 단계에서 검사
//	private double areaCircl(double r) {
//		System.out.println("Computer 객체의 areaCircle() 실행");
//		return Math.PI * r * r; // 자바에서 제공하는 정확한 PI값 사용하도록 변경
//	}
}
