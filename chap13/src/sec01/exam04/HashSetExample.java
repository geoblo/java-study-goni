package sec01.exam04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// HashSet은 특정 상황에서만 사용되며, List 계열보다는 사용 빈도가 낮은 편
// 중복된 데이터 제거가 필요할 때 유용(예: ArrayList의 요소에서 중복을 제거할 때)
public class HashSetExample {

	public static void main(String[] args) {
		// Set 특징
		// 수학의 집합에 비유
		// 순서 없이 데이터 저장(저장된 요소들을 순서대로 꺼낼 수 없음)
		// 만약 저장한 순서대로 꺼내왔다면 우연히 해시 충돌이 없었거나,
		// JVM 내부 해시 구현에 의해 우연히 정렬된 것처럼 출력된 것일 뿐 순서를 보장하지 않음
		// 동일한 요소를 중복해서 저장할 수 없음
		// 하나의 null만 저장 가능
		// 중복 판단 기준: hashCode()로 위치 찾고, equals()로 동등성 확인
		
//		Set<String> set = new HashSet<String>();
		Set<String> set = new HashSet<>(); // 생략하면 왼쪽 Set에 지정된 타입을 따라 감(타입 추론)
		
		// 객체 추가
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복 저장 안됨
		set.add("iBATIS");
		
		// Set 출력하기
		System.out.println(set);
		
		// 저장된 총 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		// Iterator(반복자)로 모든 객체를 하나씩 가져오기
		// 컬렉션의 요소를 순회할 수 있도록 도와주는 인터페이스
		// HashSet처럼 순서가 없는 컬렉션 내부의 요소를 순차적으로 접근할 수 있도록 도와줌
		// 타입 파라미터는 저장된 객체와 동일하게 작성
		Iterator<String> iterator = set.iterator(); // 반복자 얻기(Iterator 구현 객체)
		while (iterator.hasNext()) { // 가져올 객체가 있으면 true, 없으면 false
			String element = iterator.next(); // 컬렉션에서 1개의 객체를 가져옴
			// 커서는 첫 요소 이전 위치에 있음, next() 호출하면 커서가 다음 위치로 이동하면서 그 요소를 반환함
			System.out.println("\t" + element);
			
			// remove(): next()로 반환한 요소를 제거
//			iterator.remove();
			// 참고: remove()는 next() 호출 이후에만 호출 가능하며, 한 번만 가능
		}
		
		// 객체 삭제
		// index를 가지고 있는 List와 다르게 index가 없음
		// 객체의 hashCode()와 equals()를 기준으로 판단
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		// 향상된 for 문으로 모든 객체를 하나씩 가져오기
		// 순서 즉, 인덱스가 없으므로 일반 for문 사용 불가
		// 당연히 get()과 같은 메소드도 사용 불가
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		// 모든 객체를 제거하고 비움
		set.clear();
		if (set.isEmpty()) { // 컬렉션이 비어 있는지 조사
			System.out.println("비어 있음");
		}
		
		
		// HashSet과 집합
		// 수학의 집합을 효율적으로 처리하기에 적합한 구조
		// 두 집합의 합집합, 교집합, 차집합 연산 가능
		Set<Integer> class1 = new HashSet<Integer>();
		class1.add(1);
		class1.add(2);
		class1.add(3);
		Set<Integer> class2 = new HashSet<Integer>();
		class2.add(2);
		class2.add(3);
		class2.add(4);
		
		// 합집합
		// 두 개의 HashSet을 하나로 합쳐줌
		// 이때 2개의 HashSet에 공통적으로 포함된 데이터는 제거
//		class1.addAll(class2);
//		System.out.println("합집합: " + class1);
		
		// 교집합
		// 2개의 HashSet에서 공통된 요소만 추려줌
//		class1.retainAll(class2);
//		System.out.println("교집합: " + class1);
		
		// 차집합
		// 기준 HashSet에서 대상 HashSet과의 교집합 제외
		class1.removeAll(class2);
		System.out.println("차집합: " + class1);
		
		// 주의: 3개의 메소드 모두 사용하면 기준이 되는 HashSet의 데이터 자체를 바꿔버림
		// 새로운 HashSet을 반환하는 것이 아님!!
		
		
		// 요소 정렬
		// HashSet 자체는 정렬 기능이 없는 컬렉션이기 때문에
		// 정렬을 하려면 다른 컬렉션으로 변환한 뒤에 정렬
		// List로 변환 후 Collections.sort() 사용
		Set<String> fruits = new HashSet<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println(fruits);
		
		// Set -> List로 변환
		List<String> fruitsList = new ArrayList<String>(fruits);
		
		// 정렬
		Collections.sort(fruitsList); // 오름차순 정렬
		System.out.println(fruitsList);
		
		// 필요하면 정렬된 순서를 유지하는 Set으로 다시 만들기
		Set<String> sortedSet = new LinkedHashSet<String>(fruitsList);
		System.out.println(sortedSet);
		
		
		// ArrayList의 요소에서 중복을 제거
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Spring");
		list.add("Java"); // 중복
		list.add("JDBC");
		System.out.println(list);
		
		// HashSet을 이용해 중복 제거
		Set<String> javaClass = new HashSet<String>(list); // 중복 제거 완료
		System.out.println(javaClass);
		
		// 필요 시 다시 List로 변환
		List<String> deduplicatedList = new ArrayList<String>(javaClass);
		System.out.println(deduplicatedList);
	}

}
