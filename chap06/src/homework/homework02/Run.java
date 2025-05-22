package homework.homework02;

public class Run {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.phone = "01012345678";
		p1.height = 190.5;
		p1.weight = 100.2;
		
		System.out.println("전화번호: " + p1.phone);
		System.out.println("키: " + p1.height);
		System.out.println("몸무게: " + p1.weight);
		
		Person p2 = new Person();
		p2.phone = "01056434563";
		p2.height = 175.4;
		p2.weight = 65.6;
		
		System.out.println("전화번호: " + p2.phone);
		System.out.println("키: " + p2.height);
		System.out.println("몸무게: " + p2.weight);
	}

}
