package sec01.exam01;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student(); // Student 객체를 하나 만들고, 생성 번지를 s1에 저장
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		System.out.println(s1); // 객체를 문자열로 변환하여 출력
		System.out.println(s1.hashCode()); // 주소값을 십진수 int 타입으로 반환
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		if (s1 == s2) {
			System.out.println("같은 객체를 참조");
		} else {
			System.out.println("다른 객체를 참조");			
		}
	}

}
