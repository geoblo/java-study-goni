package sec06.exam06;

public class Car {
	// 필드
	// 특별한 이유가 없다면 모든 필드는 기본적으로 private으로 선언
	private int speed;
	private boolean stop;
	
	// 메소드
	public int getSpeed() { // 만약 getter만 존재하면 읽기 전용 필드
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return; // 리턴을 빼던가
		} else { // else를 빼던가
			this.speed = speed;
		}
	}
	
	// Quiz: Getter/Setter 만들기
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop) {
			speed = 0;
		}
	}
	
	// 정리:
	// 캡슐화는 필드를 숨기고(private)
	// 접근자 메소드(get/set)를 제공하여
    // 객체 내부 데이터의 무분별한 접근을 막는 방식
	
	// 객체지향 4대 특징(캡슐화, 상속, 다형성 + 추상화)
	// 캡슐화는 약(캡슐)처럼 속은 보이지 않고, 껍데기만 보이게 만드는 것
	// 약(객체) 속에는 여러 성분(데이터와 로직)이 있지만, 우리는 그냥 캡슐을 먹기만 함
	// 자바에서도 객체 속 내용(필드)을 직접 건드리지 않고, 정해진 방법(제공된 메소드)으로만 사용
}
