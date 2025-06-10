package homework.homework02;

public class Run {
	
	public static void main(String[] args) {
		Practice practice = new Practice();
		
		System.out.println("method1 소요시간: " + practice.method1("C:/test/sub/나비야1.dat"));
		System.out.println("method2 소요시간: " + practice.method2("C:/test/sub/나비야2.dat"));
	}
	
}
