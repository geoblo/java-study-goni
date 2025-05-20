package sec04.exam05;

public class CarExample {

	public static void main(String[] args) {
		// 외부에서 호출 시 객체를 만들고 참조 변수를 통해 접근해서 호출
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}

}
