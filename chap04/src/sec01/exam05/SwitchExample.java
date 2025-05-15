package sec01.exam05;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 1;
		
		switch (num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default: // 옵셔널
				System.out.println("6번이 나왔습니다.");
//				break; // 생략 가능
		}
		
		// if문: 조건식의 결과가 true/false 냐에 따라 실행
		// switch문: 변수의 값에 따라 실행문을 선택해서 실행
		// 명확하게 값의 case가 나뉘는 경우 사용하면 코드가 간결해짐(가독성)
		
		// Quiz
//		철수는 스위치로 조명을 조절하는 스마트 조명을 설치했어요. 
//		조명의 밝기는 사용자가 입력한 값에 따라서 조절돼요. 
//		아래와 같은 기준을 따른다고 했을 때, 
//		사용자가 입력한 값에 따라서 밝기를 출력하는 프로그램을 작성해주세요.
//
//		- 0 : 조명을 끕니다.
//		- 1 : 어두운 조명입니다.
//		- 2 : 밝은 조명입니다.
//		- 3 : 매우 밝은 조명입니다.
//
//		입력 값이 위의 기준에 해당하지 않으면 "올바른 입력이 아닙니다."라고 출력하세요.
//		
//		[출력]
//		조명의 밝기를 입력하세요 (0~3): 3
//		현재 조명의 밝기: 매우 밝은 조명입니다.
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("조명의 밝기를 입력하세요 (0~3): ");
        int brightness = scanner.nextInt();

        System.out.print("현재 조명의 밝기: ");
        switch (brightness) {
            case 0:
                System.out.println("조명을 끕니다.");
                break;
            case 1:
                System.out.println("어두운 조명입니다.");
                break;
            case 2:
                System.out.println("밝은 조명입니다.");
                break;
            case 3:
                System.out.println("매우 밝은 조명입니다.");
                break;
            default:
                System.out.println("올바른 입력이 아닙니다.");
                break;
        }
		
	}

}
