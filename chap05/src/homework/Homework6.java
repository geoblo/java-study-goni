package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요: ");
        int size = sc.nextInt();
        // nextInt()나 next()는 입력 후 개행 문자(\n)를 버퍼(임시 저장 공간)에 남김
        // 따라서 그 다음에 nextLine()을 쓰면 개행을 읽어버려서 빈 문자열("")이 들어감
        // 해결법: 중간에 nextLine()을 한 번 호출해 버퍼 정리
        sc.nextLine(); // 개행 문자 제거
        
        String[] arr = new String[size];
        
        for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열: ");
			arr[i] = sc.nextLine();
		}
        
        while (true) {
			System.out.println("더 값을 입력하시겠습니까?(Y/N): ");
			String answer = sc.nextLine();
			
			if ("N".equalsIgnoreCase(answer)) {
				break;
			} else if ("Y".equalsIgnoreCase(answer)) {
				System.out.println("더 입력하고 싶은 개수: ");
				int addCount = sc.nextInt();
				sc.nextLine(); // 개행 문자 제거
				
				// Arrays.copyOf를 이용해 크기 확장
				arr = Arrays.copyOf(arr, arr.length + addCount);
				
				// 추가된 부분에 새 문자열 입력
				for (int i = arr.length - addCount; i < arr.length; i++) {
					System.out.print((i + 1) + "번째 문자열: ");
					arr[i] = sc.nextLine();
				}
			} else {
				System.out.println("입력할 수 없는 값입니다.");
			}
		}
        
        // 전체 출력
        for (String str : arr) {
			System.out.println(str);
		}
	}

}
