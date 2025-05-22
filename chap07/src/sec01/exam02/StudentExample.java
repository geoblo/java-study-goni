package sec01.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("김재현", "123456-1234567", 1);
		// 생성자 호출 순서: Student() -> People() -> Student()
		// 즉, 부모 객체가 먼저 생성되고 자식 객체가 생성됨
		
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		System.out.println("studentNo: " + student.studentNo);
	}

	// 상속의 이점?
	// 1. 부모 클래스 재사용을 통해 빠른 개발 가능
	// 2. 중복되는 코드를 줄임
	// 3. 부모만 수정하면 자식들까지 수정되는 효과가 있어 유지 보수 편리
	
}
