package homework.homework07;

public class Run {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpNo(100);
		e.setEmpName("홍길동");
		e.setDept("영업부");
		e.setJob("과장");
		e.setAge(25);
		e.setGender('남');
		e.setSalary(3000000);
		e.setBonus(0.05);
		e.setPhone("010-123-4567");
		e.setAddress("서울시 강남구");
		
		System.out.println("=== " + e.getEmpName() + "의 정보 ===");
		System.out.println("사번: " + e.getEmpNo());
		System.out.println("부서: " + e.getDept());
		System.out.println("직급: " + e.getJob());
		System.out.println("나이: " + e.getAge());
		System.out.println("성별: " + e.getGender());
		System.out.println("월급: " + e.getSalary());
		System.out.println("보너스: " + e.getBonus());
		System.out.println("전화번호: " + e.getPhone());
		System.out.println("주소: " + e.getAddress());
	}

}
