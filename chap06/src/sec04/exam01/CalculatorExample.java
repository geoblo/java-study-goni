package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator(); // 기본 생성자 호출
		myCalc.powerOn();
		
//		myCalc.plus(5, 6); // 문제 없음(리턴값이 있는데 필요없으면 받지 않아도 됨)
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); // byte -> int 타입으로 자동 타입 변환
		System.out.println("result2: " + result2);
		
//		double result = myCalc.divide(10.5, 20.0); // 잘못된 매개값 사용
		
		myCalc.powerOff();
	}

}
