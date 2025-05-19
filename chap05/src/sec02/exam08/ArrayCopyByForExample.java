package sec02.exam08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// 배열은 한 번 생성되면 크기를 변경할 수 없기 때문에
		// 추가 입력이 있을 때마다 새로운 배열을 만들고 기존 데이터를 복사하는 방식으로 처리
		// 실무에서는 잘 사용하지 않고, ArrayList처럼 크기 조절이 자유로운 컬렉션을 보통 사용
		
		// 1. for문 이용
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}

}
