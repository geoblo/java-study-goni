package homework.homework06;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = "the quick brown fox jumps over the lazy dog";
		
		String[] words = sentence.split(" ");
		
		System.out.print("단어를 입력하세요: ");
		String input = sc.nextLine();
		
		String result = "";
		boolean found = false;
		
		// 입력한 단어가 마지막 단어인지 체크
        if (words[words.length - 1].equals(input)) {
            System.out.println("마지막 단어입니다.");
            return;
        }
		
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(input)) {
				result += words[i + 1] + " ";
				found = true;
			}
		}
		
		if (found) {
			System.out.println(input + " 다음 단어: " + result);			
		} else {
			System.out.println("존재하지 않는 단어입니다.");
		}
	}

}
