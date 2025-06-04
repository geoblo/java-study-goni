package sec01.exam06.quiz;

public class Information {
	private String phone;
	private int salary;
	
	public Information() {
	}

	public Information(String phone, int salary) {
		this.phone = phone;
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[전화번호=" + phone + ", 월급=" + salary + "]";
	}
}
