package sec03.exam04;

public class UUIDExample {

	public static void main(String[] args) {
		// UUID
		// Universally Unique Identifier의 약자로,
		// 전 세계에서 유일하게 식별될 수 있는 값을 만들기 위한 표준 규칙
		// 충돌 걱정 없이 고유한 식별자를 생성하는 표준 128비트 문자열

		// 형식: 32개의 16진수 + 하이픈 4개 → 총 36자
		// xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
		
		// 중복 가능성: 사실상 없음(거의 불가능)
		// 주요 용도: 식별자(ID), 파일 이름, DB PK 등 고유해야 되는 값들에 적용
		
		// Java의 randomUUID()는 
		// UUID의 4가지 주요 버전 중에 v4(랜덤 기반 무작위 값)에 해당 - 가장 널리 사용됨
		// v1~v5까지 존재
	}

}
