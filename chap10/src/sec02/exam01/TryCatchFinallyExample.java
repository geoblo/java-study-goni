package sec02.exam01;

// 일반 예외 처리
public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// 예외 처리: 예외는 발생했지만 프로그램이 갑자기 종료되는 것을 막고 정상 실행 흐름(상태)를 유지하도록 함
		try {
			// 일반 예외: 컴파일러가 체크하여 예외 처리 넣으라고 컴파일 에러 발생
//			Class clazz = Class.forName("java.lang.String"); // 주어진 이름으로 클래스를 찾아서 Class 객체로 반환
			
			// 클래스를 못 찾았을 때
			Class clazz = Class.forName("java.lang.String2"); // 일반 예외 발생
			
			System.out.println("클래스를 찾았습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally { // (Optional) 필요에 따라 작성해도 되고 안해도 됨
			// 예외 발생 유무와 상관없이 무조건 실행
			System.out.println("프로그램을 안전하게 종료합니다.");
		}
	}

}
