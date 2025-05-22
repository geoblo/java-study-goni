package sec02.exam02;

// Quiz: Parent를 상속 받아 Child 클래스 만들기
// method2() - 재정의, method3()
public class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}
}
