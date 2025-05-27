package sec01.exam06;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		// toString() 재정의 전, 후 결과 비교
		System.out.println(myPhone.toString());
	}

}
