package sec02.exam07;

public class WhileSum1To100Example {

	public static void main(String[] args) {
		// 1부터 100까지 합
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i - 1) + " 합: " + sum);
		
		// (참고) 무한 루프
		while (true) {
			System.out.println("무한 반복");
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (true) {
				break;
			}
		}
		
		boolean flag = true;
		while (flag) {
			System.out.println("무한 반복");
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (true) {
				flag = false;
			}
		}
		
		// 1부터 100까지 합
		// do-while문으로 작성
		sum = 0;
		i = 1;
		
		do { // 처음 한번은 무조건 실행
			sum += i;
			i++;
		} while (i <= 100); // 세미콜론 필수!
		
		System.out.println("1~" + (i - 1) + " 합: " + sum);
		
		// Quiz: 1부터 100까지 홀수의 합
		
		
		// Quiz2
//		화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
//
//		[입력]    [출력]
//		 123   =>  6
//		 12345 =>  15
		
		
		
		
		
		
		
		
		
		
	}

}
