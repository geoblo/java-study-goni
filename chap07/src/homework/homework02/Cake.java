package homework.homework02;

public class Cake {
	private double flour;
	private double cream;
	
	public Cake() {
	}

	public Cake(double flour, double cream) {
		this.flour = flour;
		this.cream = cream;
	}

	public double getFlour() {
		return flour;
	}

	public void setFlour(double flour) {
		this.flour = flour;
	}

	public double getCream() {
		return cream;
	}

	public void setCream(double cream) {
		this.cream = cream;
	}

	@Override
	public String toString() {
		String result = "밀가루 : " + flour + "(g)\n";
		result += "크림 : " + cream + "(g)\n";
		return result;
	}
}
