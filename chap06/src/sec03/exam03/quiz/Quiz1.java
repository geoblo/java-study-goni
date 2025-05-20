package sec03.exam03.quiz;

public class Quiz1 {
//	Quiz
//	실행 클래스를 실행 한 경우 오류가 발생하지 않고, 
//	출력 결과가 나오도록 Animal 클래스를 구현하시오.
//	(단, 필드에 초기값을 넣지 말고 생성자에서만 초기화 할 것!)
//	
//  [필드]
//	kind: 문자열
//	age: 정수
//	
//	[출력]
//	원숭이: 26살
//	사자: 1살
//	사람: 100살

	public static void main(String[] args) {
		Animal a1 = new Animal("원숭이", 26);
		Animal a2 = new Animal("사자");
		Animal a3 = new Animal(100);
		
		a1.info();
		a2.info();
		a3.info();
	}

}
