package sec01.exam02;

public class Student extends People {
	public int studentNo;
	
	// 생성자 미작성 시 컴파일러가 자동 추가
//	public Student() {
//		super();
//	}
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 생성자에게 맡기는 게 원칙적이고 안전한 방법임
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}
}
