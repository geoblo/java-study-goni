package sec02.exam02;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {

	public static void main(String[] args) {
//		Calendar now = new Calendar(); // 추상 클래스이기 때문에 new 연산자로 직접 객체 생성 불가
		Calendar now = Calendar.getInstance(); // Calendar의 하위(자식) 객체를 리턴
		
		int year = now.get(Calendar.YEAR); // 연도
		int month = now.get(Calendar.MONTH) + 1; // 월: 0~11
		int day = now.get(Calendar.DAY_OF_MONTH); // 일: 1~31
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일: 1(일)~7(토)
		String strWeek = null;
		
		switch (week) {
			case Calendar.MONDAY:
				strWeek = "월";
				break;
			case Calendar.TUESDAY:
				strWeek = "화";
				break;
			case Calendar.WEDNESDAY:
				strWeek = "수";
				break;
			case Calendar.THURSDAY:
				strWeek = "목";
				break;
			case Calendar.FRIDAY:
				strWeek = "금";
				break;
			case Calendar.SATURDAY:
				strWeek = "토";
				break;
			case Calendar.SUNDAY:
				strWeek = "일";
				break;
		}
		
		System.out.print(strWeek + "요일 ");
		
		int amPm = now.get(Calendar.AM_PM); // 오전: 0, 오후: 1
		String strAmPm = null;
		
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";			
		}
		
		System.out.println(strAmPm + " ");
		
		int hour = now.get(Calendar.HOUR); // 시
		int minute = now.get(Calendar.MINUTE); // 분
		int second = now.get(Calendar.SECOND); // 초
		
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
		
		System.out.println("===============");
		
		// 참고: 자바 8 이후 권장 방식
		// Calendar 대신 java.time API로 대체 가능
		// 현재 날짜/시간 얻기
		LocalDateTime now2 = LocalDateTime.now();
		
		// 날짜 구성 요소 얻기: getYear(), getMonthValue() 등
		int year2 = now2.getYear(); // 연도
		int month2 = now2.getMonthValue(); // 월: 1~12
		int day2 = now2.getDayOfMonth(); // 일: 1~31
		
		System.out.print(year2 + "년 ");
		System.out.print(month2 + "월 ");
		System.out.println(day2 + "일 ");
		
		DayOfWeek dayOfWeek = now2.getDayOfWeek(); // MONDAY~SUNDAY
		String strWeek2 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN); // 월, 화, 수 ...
		System.out.print(strWeek2 + "요일 ");
		
		// 오전/오후 구분
		int hour24 = now2.getHour(); // 24시간제 시각: 0~23
		String strAmPm2 = hour24 < 12 ? "오전" : "오후";
		System.out.println(strAmPm2 + " ");
		
		// 12시간제 시각
		int hour12 = hour24 % 12;
		if (hour12 == 0) hour12 = 12;
		
		int minute2 = now2.getMinute();
		int second2 = now2.getSecond();
		
		System.out.print(hour12 + "시 ");
		System.out.print(minute2 + "분 ");
		System.out.println(second2 + "초 ");
		
		System.out.println("===============");
		
		
		
		
		
		
	}

}
