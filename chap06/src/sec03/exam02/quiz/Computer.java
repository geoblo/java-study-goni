package sec03.exam02.quiz;

public class Computer {
	String model;
	
	// 기본 생성자
	public Computer() {
		System.out.println("객체생성완료(모델: " + model + ")");
	}
	
	// 모델명을 받는 생성자
	public Computer(String model) {
		this.model = model;
		System.out.println("객체생성완료(모델: " + model + ")");
	}
}
