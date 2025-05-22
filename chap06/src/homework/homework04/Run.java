package homework.homework04;

public class Run {

	public static void main(String[] args) {
		Library lib = new Library();
		
		lib.printMessage("Hello world!");
		
		System.out.println(lib.sum1To100());
		
		System.out.println(lib.checkEvenOdd(357));
		
		System.out.println(lib.hasEnglishChar("나a비"));
		
		lib.checkCharCount("간장공장공장장공고고공", '공');
		
		lib.printGoogoodan(3);
	}

}
