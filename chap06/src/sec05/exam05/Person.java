package sec05.exam05;

public class Person {
	final String nation = "Korea"; // 선언 시 초기화
	final String ssn; // 생성자에서 초기화
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
//		this.nation = "America"; // 선언과 동시에 초기화 시킨건 생성자에서도 변경 불가
	}
}
