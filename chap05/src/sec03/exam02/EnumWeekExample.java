package sec03.exam02;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null; // 열거 타입 변수 선언(참조 타입이라 null로 초기화 가능)
		
		Calendar cal = Calendar.getInstance(); // Calendar 객체 얻기
		int week = cal.get(Calendar.DAY_OF_WEEK); // 오늘의 요일 얻기(일요일: 1 ~ 토요일: 7)
		
		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch (week) {
			case 1:
				today = Week.SUNDAY; // 열거 타입 변수에는 정의된 열거 상수 값만 저장 가능
				break;
			case 2:
				today = Week.MONDAY; // 열거 타입 변수에는 정의된 열거 상수 값만 저장 가능
				break;
			case 3:
				today = Week.TUESDAY; // 열거 타입 변수에는 정의된 열거 상수 값만 저장 가능
				break;
			case 4:
				today = Week.WEDNESDAY; // 열거 타입 변수에는 정의된 열거 상수 값만 저장 가능
				break;
			case 5:
				today = Week.THURSDAY; // 열거 타입 변수에는 정의된 열거 상수 값만 저장 가능
				break;
			case 6:
				today = Week.FRIDAY; // 열거 타입 변수에는 정의된 열거 상수 값만 저장 가능
				break;
			case 7:
				today = Week.SATURDAY; // 열거 타입 변수에는 정의된 열거 상수 값만 저장 가능
				break;
		}
		
		System.out.println("오늘 요일: " + today); // 열거 객체의 문자열이 출력(열거 상수의 이름과 똑같은 문자열을 갖는다.)
	
		// 열거값 비교
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 배드민턴을 칩니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
		// 숫자 1, 2, 3, ... 쓰는 것보다 훨씬 가독성이 좋음
		
		// 열거 타입의 이점?
		// 1. 특정 범위의 값만 사용 가능하므로 타입 안정성 보장(잘못된 값이 들어가면 바로 컴파일 에러 발생)
		// today = Week.THURSDAY;
		// today = "목요일";
		// 2. 값들이 명시적으로 정의되어 있어 가독성이 올라감(코드를 읽을 때 쉽게 이해 가능)
		// Week.SUNDAY 대신에 1을 사용하면 가독성 떨어짐
		// 3. 값이 추가되거나 변경되는 경우 한 곳에서만 변경하면 되기 때문에 유지 보수(관리)가 용이
		// 4. 자동 완성 지원
		// 근데 꼭 열거 타입 사용이 필수는 아님
	}

}
