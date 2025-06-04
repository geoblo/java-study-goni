package sec01.exam06.quiz;

public class Planet {
	private String name;	// 이름
	private int diameter;	// 지름(km)
	private double period;	// 공전주기(년)
	
	public Planet() {
	}

	public Planet(String name, int diameter, double period) {
		this.name = name;
		this.diameter = diameter;
		this.period = period;
	}

	public String getName() {
		return name;
	}

	public int getDiameter() {
		return diameter;
	}

	public double getPeriod() {
		return period;
	}
	
	@Override
	public String toString() {
		return name + "(지름: " + diameter + "km, 공전주기: " + period + "년)";
	}
}
