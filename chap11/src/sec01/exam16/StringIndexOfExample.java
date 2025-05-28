package sec01.exam16;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
//		String subject = "C 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); // 찾는 문자열
		System.out.println(location);
		
		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");			
		}
		
		// 추가 실습: 문자열 포함 여부를 알려주는 메소드
		if (subject.contains("자바")) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");			
		}
	}

}
