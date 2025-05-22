package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // Parent 타입으로 자동 타입 변환
		
		parent.method1();
		parent.method2(); // 자식 쪽의 재정의된 메소드가 호출됨
//		parent.method3(); // Parent 타입에 없는 필드나 메소드는 접근 불가능
		
		// 정리: 참조 변수의 타입은 객체를 다룰 수 있는 리모컨이라고 생각
	}
	
}
