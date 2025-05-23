package sec03.exam01;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone(); // 추상 클래스는 new 연산자로 직접 인스턴스화 할 수 없음
		
		SmartPhone smartPhone = new SmartPhone("김재현");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		// 추상 클래스는 객체 생성을 하지 못하는게 아니라 직접(단독) 객체를 생성 못할뿐
		// 상속받은 자식 클래스의 객체 생성 시 부모인 추상 클래스의 객체 역시 생성된다.
	}

}
