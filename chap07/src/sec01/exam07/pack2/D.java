package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A {
	// protected 접근 제한은 상속을 통해서만 사용 가능
	// 직접 객체 생성해서 사용하는 것은 안됨
//	public void method() {
//		A a = new A();
//		a.field = "value";
//		a.method();
//	}
	
	public D() {
		super(); // 부모 생성자 호출
		field = "value";
		method();
	}
	
	public void method() {
		field = "value";
		method();
	}
}
