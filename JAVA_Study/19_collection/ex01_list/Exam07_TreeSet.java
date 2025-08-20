package ex01_list;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Exam07_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(80);
		scores.add(70);
		scores.add(100);
		scores.add(85);
		
		System.out.println(scores);
		// 내림차순 정렬
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score : descendingSet) System.out.println(score);
		
		System.out.println("========================");
		//다시 오름차순으로 정령
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for(Integer score : ascendingSet) System.out.println(score);
		
		System.out.println("=============");
		TreeSet<String> names = new TreeSet<>();
		names.add("하하");
		names.add("정형돈");
		names.add("유재석");
		names.add("노홍철");
		
		System.out.println(names);
		// 내림차순 정렬
		NavigableSet<String> descendingNames = names.descendingSet();
		for(String name : descendingNames) System.out.println(name);
				
		System.out.println("========================");
		//다시 오름차순으로 정령
		NavigableSet<String> ascendingNames = descendingNames.descendingSet();
		for(String name : ascendingNames) System.out.println(name);
	}
}
