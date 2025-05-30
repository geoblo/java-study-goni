package homework.homework01;

public class Run {

	public static void main(String[] args) {
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] personArr = str.split("\n");
		
		for (String person : personArr) {
			String[] data = person.split(",");
			
			String name = data[0];
			int age = Integer.parseInt(data[1]);
			String address = data[2];
			char gender = data[3].charAt(0);
			
			Person p = new Person(name, age, address, gender);
			System.out.println(p.toString());
		}
		
	}

}
