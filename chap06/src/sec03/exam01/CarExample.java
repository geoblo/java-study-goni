package sec03.exam01;

public class CarExample {

	public static void main(String[] args) {
//		Car myCar = new Car(); // 컴파일 에러, 기본 생성자가 선언되지 않음
		
		// 우리가 선언한 생성자에 맞게끔 매개값 제공
		Car myCar = new Car("검정", 3000);
	}

}
