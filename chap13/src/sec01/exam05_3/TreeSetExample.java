package sec01.exam05_3;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TreeSet
		// 데이터를 오름차순으로 자동 정렬
		// 저장한 순서 그대로는 보장하지 않음
		// "정렬된 순서"를 보장
//		Set<String> set = new HashSet<String>();
//		Set<String> set = new LinkedHashSet<String>();
//		Set<String> set = new TreeSet<String>(); // 오름차순
		Set<String> set = new TreeSet<String>(Collections.reverseOrder()); // 내림차순
		
		set.add("동");
		set.add("서");
		set.add("남");
		set.add("북");
		System.out.println(set);
	}

}
