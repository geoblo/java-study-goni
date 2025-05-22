package homework.homework01;

public class Run {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.name = "김철수";
		e1.team = "교육운영팀";
		
		e2.name = "이영희";
		e2.team = "경영지원팀";
		
		System.out.println("이름: " + e1.name);
		System.out.println("팀: " + e1.team);
		
		System.out.println("이름: " + e2.name);
		System.out.println("팀: " + e2.team);
	}

}
