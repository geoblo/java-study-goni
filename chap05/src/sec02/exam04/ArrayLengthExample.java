package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		int sum = 0;
		
//		for (int i = 0; i < 3; i++) { // 여기서 3은 배열 요소의 개수이므로 length 속성을 활용하면 좋음
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
//		double avg = sum / 3.0;
		double avg = sum / (double) scores.length;
		System.out.println("평균: " + avg);
		
		// Quiz
//		총 10명의 학생들의 출석 여부를 표현한 배열 attendance가 있습니다. 
//		학생이 출석한 경우 1, 결석한 경우 0으로 표시되어 있습니다. 
//		출석한 학생의 수를 계산하여 출력해주세요.
		
		int[] attendance = {1, 1, 1, 1, 1, 0, 1, 0, 0, 1};
		
		int count = 0;
		
		for (int i = 0; i < attendance.length; i++) {
			if (attendance[i] == 1) count++;
		}
		System.out.println("출석한 학생 수: " + count);
		
	}

}
