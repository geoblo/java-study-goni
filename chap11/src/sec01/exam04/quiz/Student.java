package sec01.exam04.quiz;

import java.util.Objects;

public class Student {
	private int studentNo;
	private String name;
	private String major;
	
	public Student(int studentNo, String name, String major) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "[studentNo=" + studentNo + ", name=" + name + ", major=" + major + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true; // 같은 참조이면 true
		if (!(obj instanceof Student)) return false; // Student 타입이 아니면 false
		
		Student other = (Student) obj;
		return this.studentNo == other.studentNo && this.name.equals(other.name);
	}
	
	// 동등 객체를 판단할 때
	// equals()를 재정의하면 hashCode()로 함께 재정의하는 것이 일반적이므로 함께 구현하는 것이 좋음
	
	// Objects.hash(...)
	// 자바에서 여러 필드를 조합하여 간편하게 hashCode()를 만들 수 있도록 제공되는 유틸리티 메소드
	// 가변 인자를 받아서 자동으로 적절한 해시코드를 계산해줌
	@Override
	public int hashCode() {
		return Objects.hash(studentNo, name);
	}
}
