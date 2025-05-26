package homework.homework01;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {

	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
//		super(name, age, height, weight); // 일반적으로 name 포함해서 상위 생성자에서 처리하는 것이 좋은 방식
		super(age, height, weight);
		super.name = name; // 1번 (권장: 의도 명확)
//		this.name = name; // 2번 (Student 클래스에 name 필드가 있다면 그 필드에 값을 넣게 됨)
		this.salary = salary;
		this.dept = dept;
	}

	public String toString() {
		String result = super.toString();
		result += "급여: " + salary + "\n";
		result += "부서: " + dept + "\n";
		return result;
	}
}
