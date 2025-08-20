package ex01_list;

import java.util.HashSet;
import java.util.Set;


public class Exam06_memberExample {
	public static void main(String[] args) {
		Member mem1 = new Member("송하영",27);
		Member mem2 = new Member("박지원",26);
		
		System.out.println(mem1);
		System.out.println(mem2);
		
		Set<Member> set = new HashSet<>();
		set.add(mem1);
		set.add(mem2);
		set.add(mem2);// 중복 허용되지 않음
		set.add(new Member("박지원",26));// 주소가 달라서 허용
		
		System.out.println(set.size());
	}
}
