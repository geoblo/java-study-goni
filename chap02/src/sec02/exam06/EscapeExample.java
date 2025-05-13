package sec02.exam06;

public class EscapeExample {

	public static void main(String[] args) {
		// 이스케이프(escape) 문자: 역슬래쉬가 붙은 문자로 특수한 용도로 사용된다.
		// 보통 문자열 작성할 때 이용
		
		System.out.println("번호\t이름\t직업");
		System.out.println("번호\n이름\n직업"); // ln은 개행을 뜻함
//		System.out.print("행 단위 출력");
//		System.out.print("행 단위 출력");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 개발자 입니다.");
		System.out.println("봄여름가을겨울");
		
	}

}
