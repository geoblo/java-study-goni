package sec03.exam01;

// 실체 클래스
public class SmartPhone extends Phone {
	// 생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
