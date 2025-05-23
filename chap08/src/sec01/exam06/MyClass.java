package sec01.exam06;

public class MyClass {
	// 필드 
	// 1. 필드의 타입으로 사용
	RemoteControl rc = new Television();
	
	// 생성자
	public MyClass() {
	
	}
	
	// 2. 생성자 매개 변수의 타입으로 사용
	public MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 메소드
	void methodA() {
		// 3. 로컬 변수의 타입으로 사용
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 4. 메소드 매개 변수의 타입으로 사용
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
