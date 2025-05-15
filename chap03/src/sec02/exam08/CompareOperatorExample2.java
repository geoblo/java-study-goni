package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true
		// v2가 double 타입으로 변환, 1.0 == 1.0
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // false
		// v5가 double 타입으로 변환, 두 타입의 정밀도 차이때문에 발생
		System.out.println(v4 + " == " + (double) v5);
		// 실수를 저장하는 부동소수점 방식은 정확하게 0.1을 저장할 수 없음
		// v4도 정확히 0.1은 아님
		
		// 해결책
		// 1. float로 바꿔서 비교
		System.out.println((float) v4 == v5); // true
		System.out.println((float) v4 + " == " + v5);
		
		// 2. 정수로 바꿔서 비교
		System.out.println((int) (v4 * 10)  == (int) (v5 * 10)); // true
		
		// 정리: float 타입과 double 타입을 비교하도록 코드를 작성하지 않는 것이 좋음
		// 실수 타입을 하나로 통일하는 것이 좋음(주로 double 타입 사용)
	}

}
