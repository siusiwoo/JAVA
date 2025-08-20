package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//객체 저장과 관련된 컬렉션 프레임워크의 주요 인터페이스로는 List, Set, Map
// List 인터페이스를 구현한 클래스는 ArrayList, Vector, LinkedList가 있다
//☆ List 인터페이스의 특징 
// 1)순서를 유지하고 저장한다.
// 2)중복 저장이 가능하다.
// 3)데이터의 갯수를 유연하게 추가하거나 삭제 가능하다.
public class Exam03_ArrayListReview {
	public static void main(String[] args) {
		List<Integer> listNum = new ArrayList<Integer>();
		// 초기 역량 10개 까지
		listNum.add(10);
		listNum.add(20);
		listNum.add(40);
	
		System.out.println(listNum.toString());// toString을 오버라이딩해서 값을 찾게함
		System.out.println(listNum.size());
		
		// 원하는 위치에 데이터 삽입가능 : add(int index, E g)
		listNum.add(2, 30);
		System.out.println(listNum);
		listNum.add(100);
		System.out.println(listNum);
		
		// 저장된 객체를 개별적으로 확인 : get(int index)
		int n = listNum.get(4); //
		System.out.println(n);
		
		System.out.println("==========================");
		for(int num : listNum) System.out.println(n);
		System.out.println("==========================");
		for(int i=0; i<listNum.size(); i++) System.out.println(listNum.get(i));
		
		// 데이터 수정할 때 set(int index,E g)
		listNum.set(4, 50); // 4번쨰 100 -> 50
		System.out.println(listNum);
		
		//원하는 인덱스의 데이터를 삭제할 떄 remove(int index)
		listNum.remove(0); // 0번째 값 삭제
		System.out.println(listNum);
		//ArrayList는 자주 객체를 추가하거나 삭제한다면 LinkedList에 비해 성능이 떨어지고, 오히려 인덱스 검색하거나 맨 마지막에 객체를 추가하는 경우라면 오히러 ArrayList가 좋은 성능을 발휘한다.
		
		listNum.sort(Comparator.naturalOrder());//오름차순 정렬
		System.out.println(listNum);
		listNum.sort(Comparator.reverseOrder());//오름차순 정렬
		System.out.println(listNum);
		
		//데이터 모두 삭제
		listNum.clear();
		System.out.println(listNum);
		//데이터 한번에 추가
		Integer[] numbers = {50,100,150,200};
		Collections.addAll(listNum,numbers );
		System.out.println(listNum);
		
		// 시우 3
		// 1 -> 2-> 3
		// 중간 삽입이 어려움
		// 링크드리스트 보다 효율성이 떨어짐
	}
}
