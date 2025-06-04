package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// new 연산자로 생성했기 때문에 서로 다른 객체
		// 내부 데이터가 같으므로 동등 키로 판단
		// 객체의 hashCode()와 equals()를 기준으로 판단
		map.put(new Student(1, "김재현"), 95);
		map.put(new Student(1, "김재현"), 100); // 키가 동등 객체이면 중복 저장 안됨
		// 기존 Entry에서 값만 대체됨
		
		System.out.println("총 Entry 수: " + map.size());
		
		// 재정의 하지 않으면 검색도 안됨
		System.out.println(map.get(new Student(1, "김재현")));
	}

}
