package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); // 컴파일 에러
//		Singleton obj2 = new Singleton(); // 컴파일 에러
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");			
		}
		
		// 싱글톤을 사용하는 이유?
		// 1. 인스턴스의 일관성 유지: 애플리케이션 전체에서 하나의 인스턴스를 공유하면 항상 동일한 상태를 유지할 수 있음
		// (예: 설정값, 공통 캐시)
		// 2. 메모리 절약:	불필요한 객체 생성을 방지하므로 리소스를 아낄 수 있음
		// 3. 공유 자원 관리: 파일, 네트워크 소켓, DB 연결 풀 등 자원은 하나만 존재하는 것이 안전할 때
		
		// 정리: 싱글톤은 하나의 인스턴스로 애플리케이션 전체에서 공유해야 할 때 사용하며, 
		// 자원 절약과 일관성 유지가 주요 목적
		// 근데 일반적으로는 Spring 등 프레임워크가 싱글톤의 역할(관리)을 대신해 주기 때문에
		// 프레임워크를 사용하는 환경에서는 직접 싱글톤을 구현할 일이 거의 없고, 
		// 그렇지 않은 환경에서는 간단한 유틸이나 공통 객체에서 유용하게 사용할 수 있음
	}

}
