package sec02.exam10;

public class ContinueExample {

	public static void main(String[] args) {
		// 짝수만 출력
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) { // 홀수
				continue; // 다음 반복으로 건너뜀
			}
			System.out.println(i);
		}
		
		// Quiz
//		철수는 여자친구 영희에게 생일 축하 메시지를 보내려고 해요. 
//		그런데 철수의 여자친구 영희는 띄어쓰기를 싫어합니다.
//		철수가 어떤 문자열을 입력하든 영희에게 혼나지 않게
//		글자 사이에 있는 띄어쓰기가 없게 출력해주세요.
//		
//		힌트: 
//		- 문자열의 길이를 측정할때는 length()를 사용, 예: str.length()
//		- 반복문을 활용하여 공백을 만날 경우 다음 반복 회차로 넘어가세요.
//		
//		[입력]
//		영희야 생 일 축 하 해 !
//		
//		[출력]
//		영희야생일축하해!
		
//		String str = "가나다";
//		System.out.println(str[1]); // This is JS
//		System.out.println(str.charAt(1)); // This is JAVA
		
		
		
	}

}
