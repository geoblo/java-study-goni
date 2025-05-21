package homework;

import java.util.Arrays;

public class Homework4 {

	public static void main(String[] args) {
		// 공식화: (int) (Math.random() * (최대값 - 최소값 + 1)) + 최소값;
		 
		int[] lottoArr = new int[6];
		int count = 0;
		
		while (count < 6) {
			int num = (int) (Math.random() * 45) + 1;
			
			// 중복 체크
			boolean duplicate = false;
			for (int i = 0; i < count; i++) { // 실제 로또 번호가 들어간 count까지만 체크
				if (lottoArr[i] == num) {
					duplicate = true;
					break; // 중복되는 값을 찾은 즉시 빠져나감
				}
			}
			
			// 중복이 아니면 배열에 저장
			if (!duplicate) {
				lottoArr[count] = num;
				count++;
			}
		}
		
		// 오름차순 정렬
		Arrays.sort(lottoArr);
		
		for (int num : lottoArr) {
			System.out.print(num + " ");
		}
	}

}
