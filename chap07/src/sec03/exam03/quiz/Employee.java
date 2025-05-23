package sec03.exam03.quiz;

public abstract class Employee {
	private String type;
	private String name;
	private String dept;
	
	public Employee(String type, String name, String dept) {
		this.type = type;
		this.name = name;
		this.dept = dept;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}
	
	public abstract int getPay();
	public abstract String getInfo();
}
