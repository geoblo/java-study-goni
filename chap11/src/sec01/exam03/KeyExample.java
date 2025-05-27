package sec01.exam03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Map: key/value 쌍으로 저장하는 컬렉션
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별키 "new Key(1)"로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		// 식별키 "new Key(1)"로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value); // why null?
		// equals() 메소드를 재정의 했음에도 동등 객체로 판단하지 않는다.
		// get()을 할 때, hashCode()를 먼저 비교하고 그 다음 equals()로 비교하기 때문
		// hashCode()도 재정의 필요
		// => 그래서 HashMap의 키로는 String이 가장 많이 사용됨(String은 이미 hashCode()와 equals()가 재정의 되어있음)
		// 만약 사용자 정의 객체를 키로 쓸 때는 hashCode()와 equals()를 반드시 오버라이드해야 버그 없이 작동
		
		// 참고
		// hashCode()가 재정의 된 대표적인 예
		String str1 = "김";
		String str2 = "김";
		String str3 = new String("김");
		String str4 = new String("김");
		
		// 다른 객체여도 같은 해시코드를 가짐
		// => String 클래스에 재정의 된 hashCode() 호출
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		// 시스템이 구성한 값 그대로 출력
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
	}

}
