package sec01.exam01;

// 자식 클래스: 일반적인 특성은 물려받고 추가로 자식만이 갖고 있는 멤버(필드, 메소드) 작성
// 여기서는 CellPhone을 확장하여 DMB 기능만 추가된 클래스
public class DmbCellPhone extends CellPhone {
	// 필드
	int channel;
	
	// 생성자
	public DmbCellPhone(String model, String color, int channel) {
//		super(); // 부모 생성자 호출(자동으로 추가됨)
		this.model = model; // 부모(CellPhone)로부터 상속받음
		this.color = color; // 부모(CellPhone)로부터 상속받음
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
}
