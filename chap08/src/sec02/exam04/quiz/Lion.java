package sec02.exam04.quiz;

public class Lion extends Animal {
	public Lion() {
		super("사자", 4);
	}

	@Override
	public void eat() {
		System.out.println("초식 동물을 잡아 먹는다.");
	}

	@Override
	public void sound() {
		System.out.println("어흥거린다.");
	}
}
