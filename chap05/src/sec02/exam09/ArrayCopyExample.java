package sec02.exam09;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 2. System.arraycopy() 메소드 이용
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		// System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		// src: 복사할 원본 배열
		// srcPos: 원본 배열에서 복사할 위치
		// dest: 붙여넣을 대상 배열
		// destPos: 대상 배열에 붙여넣을 위치
		// length: 몇 개를 복사할지
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
		System.out.println();

		// 3. Arrays.copyOf(T[] original, int newLength) 메소드 이용
		// original: 복사할 원본 배열
		// newLength: 복사할 새 배열의 길이(기존보다 작거나 클 수 있음)
		// original 배열의 요소들을 앞에서부터 newLength까지 복사한 새로운 배열을 반환
		// 길이가 늘어난 경우, 나머지 값들은 해당 타입의 기본값으로 채워짐
		String[] newStrArray2 = Arrays.copyOf(oldStrArray, oldStrArray.length + 2);
		
		for (int i = 0; i < newStrArray2.length; i++) {
			System.out.print(newStrArray2[i] + ", ");
		}
	}

}
