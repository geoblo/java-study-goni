package sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// LinkedList는 일부 특별한 경우를 제외하고는 거의 사용되지 않고,
// 대부분의 경우 ArrayList가 기본 선택
public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 0 인덱스에 10000개의 데이터를 삽입하여 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + "ns");
	}

}
