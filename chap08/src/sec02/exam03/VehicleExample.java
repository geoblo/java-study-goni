package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); // Vehicle 인터페이스 타입에 없는 멤버는 사용 불가
		
		Bus bus = (Bus) vehicle; // 강제 타입 변환
		
		bus.run();
		bus.checkFare();
	}

}
