package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("친구 수: ");
	    int friends = scanner.nextInt();

	    System.out.print("사탕의 수: ");
	    int candies = scanner.nextInt();
	    
	    // 친구 한명당 나눠줄 수 있는 사탕의 최대 개수
	    int candiesPerFriend = candies / friends;
	    
	    // 나눠주고 남은 사탕의 수
	    int remainingCandies = candies % friends;
	    
	    // 출력
	    System.out.println("1인당 사탕 개수 : " + candiesPerFriend + "개");
	    System.out.println("남는 사탕 개수 : " + remainingCandies + "개"); 
	}

}
