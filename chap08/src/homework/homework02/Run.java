package homework.homework02;

public class Run {

	public static void main(String[] args) {
		// Menu 타입의 객체 배열 크기 5로 생성
		Menu[] menus = new Menu[5];
		// 각 인덱스에 무작위로 Dish 또는 Drink 객체 생성
		// 이때, 매개변수 생성자를 이용하여 생성
		for (int i = 0; i < menus.length; i++) {
			int num = (int) (Math.random() * 2);
			
			if (num == 0) {
				menus[i] = new Dish("스테이크", 30000, "소고기, 소금, 후추");
			} else {
				menus[i] = new Drink("아메리카노", 5000, "에스프레소 1샷, 물");
			}
		}
		
		// 반복문을 통해서 해당 배열의 0번 인덱스부터
		// 마지막 인덱스까지 객체의 cook() 메소드 호출
		for (Menu menu : menus) {
			menu.cook();
		}
	}
	
}
