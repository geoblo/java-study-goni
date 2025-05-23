package sec03.exam03.quiz;

public class Run {
	// Quiz
//	다음 설명에 따라 Employee, FormalEmployee, InformalEmployee 클래스를 상속 관계로 구현하시오.
//
//	회사가 고용하는 여러 유형의 직원들이 있습니다.
//	직원은 정규직원과 비정규직원으로 구분됩니다.
//
//	모든 직원은 직원 구분(type), 이름(name), 소속 부서(dept) 정보를 가지고.
//	모든 직원은 급여를 받아야 하므로 getPay() 메소드를 가지고 있습니다. 
//	하지만 정규직, 비정규직에 맞도록 급여가 책정되므로 getPay() 메소드는 추상 메소드로 구현합니다.
//	
//  직원의 정보를 출력하는 getInfo() 메소드도 정규직, 비정규직에 따라 다른 정보를 출력하므로 추상 메소드로 구현합니다.
//	정규직은 직원 구분(type), 이름(name), 소속 부서(dept), 직원번호(empNo), 연봉(salary)을 출력하고
//	비정규직은 직원 구분(type), 이름(name), 소속 부서(dept), 기본임금(primaryPay)을 출력하도록 작성합니다.
//
//	정규직원의 필드는 직원번호(empNo), 연봉(salary) 입니다.
//	비정규직원의 필드는 기본임금(primaryPay)을 입니다.
//
//	정규직원과 비정규직원은 모두 getPay() 메소드 오버라이딩 해야 합니다.
//	정규직원은 연봉/12만큼 급여를 받고,
//	비정규직원은 기본임금을 그대로 급여로 받습니다.
//
//	정규직원과 비정규직원의 부모 클래스인 직원 클래스(Employee)와
//	정규직원 클래스(FormalEmployee), 비정규직원 클래스(InformalEmployee)를 구현하십시오.
//	실행 클래스를 실행한 결과는 다음과 같다.
//
//  모든 필드는 private 접근 제한으로 구현 할 것(protected 접근 제한 사용 X)
//
//	[출력]
//	정규직, 홍길동, 총무부, 1, 5000
//	홍길동의 급여: 416
//	비정규직, 이비정, 영업부, 250
//	이비정의 급여: 250
	
	public static void main(String[] args) {
		FormalEmployee fe = new FormalEmployee("홍길동", "총무부", 1, 5000);
	    System.out.println(fe.getInfo());
	    System.out.println(fe.getName() + "의 급여: " + fe.getPay());
	    
	    InformalEmployee ie = new InformalEmployee("이비정", "영업부", 250);
	    System.out.println(ie.getInfo());
	    System.out.println(ie.getName() + "의 급여: " + ie.getPay());
	}
	
}
