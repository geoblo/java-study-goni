package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map 특징
		// 키-값 쌍으로 데이터 저장
		// 키는 중복 불가, 값은 중복 가능
		// 순서 보장 여부는 구현체에 따라 다름
		
		// HashMap
		// 가장 많이 쓰이는 일반적인 Map
		// 키를 기반으로 hashCode()를 계산하여 위치를 정함
		// 순서 보장 안됨
		
		// Map 컬렉션 생성
		// 키의 타입으로는 일반적으로 1. String, 2. Integer/Long 을 많이 씀
		// 이유? 동등 객체로 판단하기 위한 equals()와 hashCode()가 이미 잘 구현되어 있음
//		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map = new HashMap<>(); // 생략하면 왼쪽 Map에 지정된 타입을 따라 감(타입 추론)
		
		// 객체 저장
		// put()은 내부적으로 키가 이미 존재하는지 확인하고,
		// 존재하지 않으면 새로 추가하고 null 반환
		// 존재하면 값을 덮어쓰고, 덮어쓰기 전의 값을 반환
		map.put("김재현", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 키가 같으면 기존의 값은 없어지고 새로운 값으로 덮어씀(기존 Entry에서 값만 대체됨)
		System.out.println("총 Entry 수: " + map.size());
		
		// 객체 찾기
		// Key값(이름)으로 Value(점수)를 검색
		// 요소를 찾지 못하면 null을 반환
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 객체를 하나씩 처리
		// Iterator(반복자): 컬렉션 내부의 요소를 하나씩 순회할 수 있도록 도와줌
		// Iterator를 쓰려면 해당 객체가 Iterable 인터페이스를 구현하고 있어야 함
		// Collection을 구현한 클래스들(예: ArrayList, HashSet 등) Java의 대부분의 컬렉션은 이미 Iterable을 구현하고 있음
		// Map은 Iterable을 구현하지 않음
		// => 해결: Map의 구성 요소를 Set으로 변경해서 Iterator 사용
		
		// 1. keySet() 이용: Key만 Set으로 변환
		// Set<K> 반환
		// Key만 모은 Set이 필요할 때 사용
		Set<String> keySet = map.keySet(); // Key Set 얻기
		
		System.out.println("Iterator 사용");
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// Quiz: 향상된 for 문으로 객체를 하나씩 처리
		// 읽기 전용으로 순회할 때는 대부분 이 방식을 더 선호
		System.out.println("향상된 for 문 사용");
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동"); // 키로 Map.Entry를 제거
		System.out.println("총 Entry 수: " + map.size());
		System.out.println();
		
		// 객체를 하나씩 처리
		// 2. entrySet() 이용: Entry를 Set으로 변환
		// Set<Map.Entry<String, Integer>> 반환
		// 키와 값을 함께 보존한 Set이 필요할 때 사용
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry Set 얻기
		
		System.out.println("Iterator 사용");
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			// 반복해서 Map.Entry를 얻고 키와 값을 얻어냄
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// Quiz: 향상된 for 문으로 객체를 하나씩 처리
		// 읽기 전용으로 순회할 때는 대부분 이 방식을 더 선호
		System.out.println("향상된 for 문 사용");
		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 정리: Iterator가 필요한 상황(for-each보다 유리한 경우)
		// 읽기 전용이면 for-each가 가장 깔끔하고 실용적
		// 수정, 삭제, 조건 제어 등 복잡한 순회가 필요하면 Iterator가 더 유리
		// Iterator는 반복 중 컬렉션의 구조 변경을 감지 가능
		// 예: 순회 중 요소를 안전하게 제거할 때
		// Iterator.remove()는 ConcurrentModificationException 없이 안전하게 삭제 가능
		// 반면 for-each에서 map.remove()를 쓰면 오류 발생 가능
		
		
		
		
		
		
		
		
		
		
		
	}

}
