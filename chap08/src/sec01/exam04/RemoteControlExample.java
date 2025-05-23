package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
//		rc = new RemoteControl(); // 인터페이스는 객체의 사용 방법을 기술한 타입 => 객체 생성 불가
		
		// 대신에 인터페이스 타입에 구현 객체들을 담을 수 있다.
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
		// 메소드 호출 코드는 똑같은데 어떤 구현 객체가 대입되었냐에 따라 실행 결과는 달라짐 => 다형성
	}

}
