package sec03.exam01;

// 추상 클래스
// 미완성 설계도(미완성 메소드를 갖고 있는 클래스)
// 공통 설계도(공통 특성을 모아놓은 클래스)
// 공통 기능을 일부 구현해놓고, 하위 클래스가 나머지를 구현하도록 할 때
// 장점: 코드 중복 줄이고, 공통 처리 로직을 강제할 수 있음

// 이 예제에서는 공통 기능만 제공
// 공통 기능만 제공하는데 굳이 abstract를 붙여야 할까?
// 인스턴스화 목적이 아니라는 의도가 명확
// 실수로 불필요한 인스턴스화를 방지하고 상속을 통해서만 쓰겠다는 의미
public abstract class Phone {
	// 폰의 공통된 특성을 작성
	// 필드
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
