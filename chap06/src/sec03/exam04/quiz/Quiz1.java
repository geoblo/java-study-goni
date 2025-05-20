package sec03.exam04.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		Animal a1 = new Animal("원숭이", 26);
		Animal a2 = new Animal("사자");
		Animal a3 = new Animal(100);
		
		a1.info();
		a2.info();
		a3.info();
	}

}
