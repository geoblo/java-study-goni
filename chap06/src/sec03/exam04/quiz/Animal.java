package sec03.exam04.quiz;

// Quiz
// 다른 생성자를 호출하는 this()를 써서 리팩토링 해보세요.

public class Animal {
	// 필드
	String kind;
	int age;
	
	// 종류만 받는 생성자(기본 나이: 1살)
	Animal(String kind) {
		this(kind, 1);
	}
	
	// 나이만 받는 생성자(기본 종류: "사람")
	Animal(int age) {
		this("사람", age);
	}
	
	// 종류와 나이를 모두 받는 생성자(최종 목적지 한 군데에서만 초기화 수행)
	Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}
	
	// 출력 메소드
	void info() {
		System.out.println(kind + ": " + age + "살");
	}
}
