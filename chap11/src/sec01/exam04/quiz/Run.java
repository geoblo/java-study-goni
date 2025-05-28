package sec01.exam04.quiz;

public class Run {
	// Quiz
//	학생클래스의 객체 중 학번과 이름이 같다면 같은 학생이 되도록 Student 클래스를 수정하시오.

//	[출력]
//	[학번=100, 이름=홍길동, 전공=경영]과 [학번=100, 이름=홍길동, 전공=컴공]학생은 같은 학생입니다.
	
	public static void main(String[] args) {
		Student s1 = new Student(100, "홍길동", "경영");
		Student s2 = new Student(100, "홍길동", "컴공");
		
		if (s1.equals(s2)) {
			System.out.println(s1 + "과 " + s2 + "은(는) 같은 학생입니다.");
		} else {
			System.out.println(s1 + "과 " + s2 + "은(는) 다른 학생입니다.");
		}
	}

}
