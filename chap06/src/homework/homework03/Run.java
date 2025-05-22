package homework.homework03;

public class Run {

	public static void main(String[] args) {
		Library lib = new Library();
		
		String result1 = lib.concatString("안녕", "히계세요.");
		System.out.println(result1);
		
		int result2 = lib.multiple(33, 2);
		System.out.println(result2);
		result2 = lib.multiple(3, 22);
		System.out.println(result2);
		
		boolean result3 = lib.equalString("홍길동", "김철수");
		System.out.println(result3);
		result3 = lib.equalString("홍길동", "홍길동");
		System.out.println(result3);
	}

}
