package homework.homework03;

public class Run {

	public static void main(String[] args) {
		// 1. Car 클래스로 2개 객체 인스턴스화
		// 2. 각각의 매개변수 생성자의 매개변수로 GasolineEngine과 ElectricEngine 사용
		Car gasCar = new Car(new GasolineEngine());
		Car electCar = new Car(new ElectricEngine());
		
		// 3. 2개의 Car 객체의 startEngine 메소드 호출
		gasCar.startEngine();
		electCar.startEngine();
	}

}
