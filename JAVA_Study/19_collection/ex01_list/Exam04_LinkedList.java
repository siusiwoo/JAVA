package ex01_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// LinkedList의 내부 구조는 인접 참조를 링크해서 체인처럼 관리, 특정 인덱스 개체를 제거하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않기 때문에 자주 객체 삽입, 삭제한다면 LinkedList가 더 좋은 성능을 발휘 한다.
public class Exam04_LinkedList {
	public static void main(String[] args) {
		List<String> alist = new ArrayList<String>();
		List<String> llist = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		System.out.println(startTime);
		
		for(int i=0; i<10000; i++) {
			alist.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : "+(endTime - startTime)+"ns");
		
		System.out.println("===================");
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			llist.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : "+(endTime - startTime)+"ns");
		
		// 3 시우 이게 링크드 리스트 
		//   1 
		// 2   3 
		// 찾아가기가 어려움
		
	}
}
