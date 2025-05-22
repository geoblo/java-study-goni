package homework.homework03;

public class Library {
	// 메소드(1)
	public String concatString(String str1, String str2) {
		return str1 + str2;
	}
	
	// 메소드(2)
	public int multiple(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}
		
		return num1 * num2;
	}
	
	// 메소드(3)
	public boolean equalString(String str1, String str2) {
		return str1.equals(str2);
	}
}
