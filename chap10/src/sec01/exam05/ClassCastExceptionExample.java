package sec01.exam05;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
//		Animal animal = new Dog();
//		Dog dog = (Dog) animal;
//		Cat cat = (Cat) animal; // 예외 발생
		
		changeDog(new Dog());
		changeDog(new Cat());
	}
	
	public static void changeDog(Animal animal) {
		// 이러한 예외를 막으려면 안전하게 타입 검사 후 강제 타입 변환 진행
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}
}

// 클래스 여러 개 선언 가능(단, public class는 한 개만 가능)
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}