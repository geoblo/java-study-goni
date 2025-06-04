package sec01.exam06;

import java.util.HashMap;
import java.util.Map;

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
		
		
		
		
		
		
		
	}

}
