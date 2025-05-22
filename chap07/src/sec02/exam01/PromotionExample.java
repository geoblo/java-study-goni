package sec02.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 상위 타입 참조 변수에 하위 객체 대입 가능
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 상속 관계가 아님
//		B b2 = e;
//		C c2 = d;
	}

}
