package homework.loop;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String play = "";
		
		do {
			// 게임 실행 코드
			System.out.println("게임을 실행합니다!");
			
			// 게임 종료 후 다시 플레이할 것인지 묻는 메시지 표시
            System.out.println("게임을 다시 플레이하시겠습니까? (yes/no)");
            play = sc.nextLine();
		} while ("yes".equals(play));
		
		System.out.println("게임을 종료합니다.");
	}

}
