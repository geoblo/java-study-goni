package homework.homework01;

public class Person {
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
	
	}

	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		String result = "=== " + name + " ===\n";
		result += "나이: " + age + "\n";
		result += "키: " + height + "\n";
		result += "몸무게: " + weight + "\n";
		return result;
	}
}
