package homework.homework02;

import java.util.Scanner;

public class CakeMenu {
	private Scanner sc = new Scanner(System.in);
	private ChocolateController cc = new ChocolateController();
	private GreenTeaContorller gtc = new GreenTeaContorller();
	
	public void mainMenu() {
		while (true) {
			System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
			System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)");
			System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
			System.out.println("9. 취소");
			System.out.print("메뉴 번호: ");
			
			int menuNo = sc.nextInt();
			
			switch (menuNo) {
				case 1:
					chocolateMenu();
					break;
				case 2:
					greenTeaMenu();
					break;
				case 9:
					System.out.println("종료합니다.");
					return;
				default:
					System.out.println("잘못된 번호입니다.");
					continue;
				}
			}
	}

	public void chocolateMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("체리(개) : ");
		int cherry = sc.nextInt();
		System.out.print("초콜릿 칩(개) : ");
		int chip = sc.nextInt();
		
		// 데이터를 ChocolateController(cc)의 bakeChocolateCake()의 매개변수로 보내 반환 값 출력
		String result = cc.bakeChocolateCake(flour, cream, cherry, chip);
		System.out.println(result);
	}
	
	public void greenTeaMenu() {
		System.out.print("밀가루(g) : ");
		double flour = sc.nextDouble();
		System.out.print("크림(g) : ");
		double cream = sc.nextDouble();
		System.out.print("체리(개) : ");
		double powder = sc.nextDouble();
		System.out.print("초콜릿 칩(개) : ");
		int cheese = sc.nextInt();
		
		// 데이터를 GreenTeaController(gtc)의 bakeGreenTeaCake()의 매개변수로 보내 반환 값 출력
		String result = gtc.bakeGreenTeaCake(flour, cream, powder, cheese);
		System.out.println(result);
	}
}
