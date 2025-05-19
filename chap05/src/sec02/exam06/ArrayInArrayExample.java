package sec02.exam06;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		// 2행 3열 2차원 배열
		int[][] mathScores = new int[2][3];
		
		// 2차원 배열의 모든 요소에 접근하려면 중첩 for문이 필요
		// 바깥 for문 => 행을 반복
		for (int i = 0; i < mathScores.length; i++) { // mathScores.length => 2
			// 안쪽 for문 => 열을 반복
			for (int j = 0; j < mathScores[i].length; j++) { 
				// mathScores[i].length => 3 (해당 행에서 참조하는 배열의 길이)
				System.out.println("mathScores[" + i + "][" + j + "]=" + mathScores[i][j]);
			}
		}
		
		System.out.println();
		
		// 2행의 2차원 배열
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) { 
				System.out.println("englishScores[" + i + "][" + j + "]=" + englishScores[i][j]);
			}
		}
		
		System.out.println();
		
		// 값 목록으로 2차원 배열 만들기
//		int[][] javaScores = {{95, 80}, {92, 96, 80}};
		// 가독성을 위해 줄바꿈
		int[][] javaScores = {
			{95, 80}, 
			{92, 96, 80}
		};
		
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) { 
				System.out.println("javaScores[" + i + "][" + j + "]=" + javaScores[i][j]);
			}
		}
	}

}
