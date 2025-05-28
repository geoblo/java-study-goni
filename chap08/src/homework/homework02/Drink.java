package homework.homework02;

public class Drink extends Menu {
	private String recipe;
	
	public Drink() {
	}
	
	public Drink(String name, int price, String recipe) {
		super(name, price);
		this.recipe = recipe;
	}
	
	public String getRecipe() {
		return recipe;
	}
	
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	@Override
	public void cook() {
		System.out.println(super.toString() + " 레시피는 " + recipe + "입니다.");
	}
}
