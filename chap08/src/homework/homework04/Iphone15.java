package homework.homework04;

public class Iphone15 extends SmartPhone {
	public Iphone15() {
	}
	
	@Override
	public void makeCall() {
		System.out.println("번호를 누르고 통화버튼을 누름");
	}
	
	@Override
	public void takeCall() {
		System.out.println("수신 버튼을 누름");
	}
	
	@Override
	public void touch() {
		System.out.println("정전식");
	}
	
	@Override
	public void charge() {
		System.out.println("고속충전");
	}

	@Override
	public void picture() {
		System.out.println("1200, 1600만 화소 트리플 카메라");
	}

	@Override
	public void printMaker() {
		System.out.println("아이폰15는 애플에서 만들어졌다.");
	}	
}
