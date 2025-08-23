package ex01_list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Map 인터페이스의 특징은 키와 값으로 구성된 객체 
 * map 을 구현하는 클래스 HashMap, TreeMap, HashTable, LinkedHashMap, Properties 등이 있다
 * Map<키 타입, 값 타입> map = new HashMap<키 타입, 값 타입>(); */
public class Exam08_Map {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(50, "엄마가방");
		map.put(50, "엄마옷");
		map.put(100, "아빠옷");
		map.put(100, null);
		map.put(100, "아빠옷");
		map.put(101, "아빠옷");
		
		System.out.println("==데이터 확인==");
		System.out.println(map);
		System.out.println(map.get(50));
		System.out.println(map.toString());
		Set<Integer> set = map.keySet();
		System.out.println(set);
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			System.out.println(key+"+"+map.get(key));
		}
		System.out.println(map.size());
		map.remove(101);
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}

	

}
