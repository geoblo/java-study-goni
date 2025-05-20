package sec04.exam06;

public class Calculator {
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
	// 오버로딩의 조건
	// 1. 메소드명이 같아야 함
	// 2. 매개변수의 타입, 개수, 순서가 달라야 함
	// 3. 매개변수명, 리턴 타입이 다르다고 해서 오버로딩이 아님
	
	// 메소드 오버로딩을 하는 이유?
	// 다양한 형태의 매개값을 주고 처리하기 위함
	// 오버로딩을 안쓰면 같은 기능을 각각 다른 이름의 메소드로 정의해야 함(불편)
}
