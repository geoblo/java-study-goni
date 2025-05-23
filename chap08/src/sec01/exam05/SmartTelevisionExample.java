package sec01.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		// 하나의 객체를 가지고 두 인터페이스로 사용하는 예제
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		// RemoteControl에 정의된 것만 호출 가능
		
		Searchable searchable = tv;
		searchable.search("https://www.google.com");
		
		// 객체를 어떤 인터페이스 타입에 저장할지 결정하는 기준은 "어떤 기능만 사용할 것인가"
		// 사용하고자 하는 기능(메소드)의 범위에 따라 선택하면 됨
	}

}
