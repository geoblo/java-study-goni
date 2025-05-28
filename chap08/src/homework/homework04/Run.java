package homework.homework04;

public class Run {

	public static void main(String[] args) {
		// 1. GalaxyS24와 Iphone15를 동시에 참조하기 위한 SmartPhone 타입의 배열 생성(크기 2로 지정)
		SmartPhone[] smartPhones = new SmartPhone[2];
		
		// 2. 각각의 인덱스에 GalaxyS24, Iphone15 객체 생성
		smartPhones[0] = new GalaxyS24();
		smartPhones[1] = new Iphone15();
		
		// 3. for문을 이용하여 SmartPhone 객체 배열에 있는 GalaxyS24와 Iphon15에 접근
		// 4. 오버라이딩한 모든 메소드 호출
		for (SmartPhone smartPhone : smartPhones) {
			smartPhone.printMaker();
			smartPhone.makeCall();
			smartPhone.takeCall();
			smartPhone.touch();
			smartPhone.charge();
			smartPhone.picture();
			System.out.println();
		} 
	}

}
