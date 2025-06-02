package sec01.exam05;

import java.util.Objects;

public class Member implements Comparable<Member> {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Member)) return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Member other) {
		return age - other.age;
	}
}
