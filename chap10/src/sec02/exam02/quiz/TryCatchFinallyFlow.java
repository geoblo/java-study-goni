package sec02.exam02.quiz;

public class TryCatchFinallyFlow {

	public static void main(String[] args) {
		// Quiz: 실행 흐름 예측해보기
		
		// 1. 예외가 발생하지 않은 경우
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		
		// 정답: 
		
		// 2. 예외가 발생한 경우
		System.out.println(1);
		try {
			System.out.println(2);
			
			System.out.println(0/0);
			
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		
		// 정답: 
		
		// 3. 예외가 발생한 경우
		System.out.println(1);
		try {
			System.out.println(2);
			
			System.out.println(args[0]);
			
			System.out.println(3);
		} catch (ArithmeticException e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		
		// 정답: 
	}

}
