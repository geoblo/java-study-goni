package homework;

import java.util.Arrays;

public class Homework8 {

	public static void main(String[] args) {
		String[] menu = {"Burger", "Pizza", "Pasta"};
        String[] add = {"Salad", "Soup"};

        // menu 배열을 기반으로 길이를 늘려 새로운 배열 생성
        String[] todayMenu = Arrays.copyOf(menu, menu.length + add.length);

        // 추가 메뉴를 복사해서 붙이기
        for (int i = 0; i < add.length; i++) {
            todayMenu[menu.length + i] = add[i];
        }

        // 출력
        System.out.print("어제 메뉴판: ");
        for (int i = 0; i < menu.length; i++) {
        	if (i > 0) System.out.print(", ");
            System.out.print(menu[i]);
        }

        System.out.println();

        System.out.print("오늘 메뉴판: ");
        for (int i = 0; i < todayMenu.length; i++) {
        	if (i > 0) System.out.print(", ");
            System.out.print(todayMenu[i]);
        }
	}

}
