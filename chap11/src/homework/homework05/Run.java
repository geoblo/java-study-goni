package homework.homework05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();
		
//		char firstChar = name.charAt(0);
		String firstChar = name.substring(0, 1);
        String lastName = name.substring(1);
        String year = birth.substring(2, 4);
        String day = birth.substring(6, 8);
        
        String pwd = firstChar + year + day + lastName;
        System.out.println("암호: " + pwd);
	}

}
