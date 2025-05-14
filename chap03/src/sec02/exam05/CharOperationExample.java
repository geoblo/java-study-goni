package sec02.exam05;

public class CharOperationExample {
	public static void main(String[] args) {
		// 참고만 할 것!
		char c1 = 'A' + 1; // 65 + 1 => 리터럴을 더해서 char에 넣는 것은 가능(자바 컴파일러에서 연산)
		char c2 = 'A';
//		char c3 = c2 + 1; // c2 변수가 int로 형변환 됨(JVM에서 연산)
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
//		System.out.println("c3: " + c3);
	}
}
