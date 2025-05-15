package sec01.exam07;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		// char 타입 변수도 올 수 있다. (대소문자 구분함)
		// 여러 케이스를 묶을 수 있다.
		switch (grade) {
			case 'A':
			case 'a':
				// 'A', 'a' 둘 중에 하나이면 실행
				System.out.println("우수 회원입니다.");
				break;
			case 'B': 
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
				break;
		}
	}

}
