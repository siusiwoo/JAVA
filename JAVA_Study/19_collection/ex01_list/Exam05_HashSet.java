package ex01_list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set 인터페이스를 구현한 클래스는 HashSet,LinkedHashSet,TreeSet 등
public class Exam05_HashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("삼푸");
		set.add("컨디셔너");
		set.add("치약");
		set.add("치약");
		set.add("칫솔");
		
		System.out.println(set.size());
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String e = itr.next(); //next 함수는 꺼내기 함수
			System.out.println(e);
		}
		
		// 원하는 객체 데이터 삭제
		set.remove("치약");
		// 다 삭제
		set.clear();
		System.out.println(set);
	}
}
