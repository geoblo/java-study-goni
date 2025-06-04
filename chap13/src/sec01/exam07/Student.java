package sec01.exam07;

import java.util.Objects;

// 키로 사용할 객체 생성을 위한 클래스
public class Student {
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Student)) return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && sno == other.sno;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
}
