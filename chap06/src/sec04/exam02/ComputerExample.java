package sec04.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		// 1. 매개값으로 배열을 넘김
		int[] values = {1, 2, 3};
		int result1 = myCom.sum1(values);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2: " + result2);
		
		// 2. 매개값으로 값의 목록과 배열 둘 다 허용
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + result3);

		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
		
		// 배열을 넣어도 정상 동작함
		int result5 = myCom.sum2(values);
		System.out.println("result5: " + result5);
		
		int result6 = myCom.sum2(new int[] {1, 2, 3, 4, 5});
		System.out.println("result6: " + result6);
	}

}
