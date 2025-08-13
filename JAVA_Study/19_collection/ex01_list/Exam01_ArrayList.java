package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//객체 저장
public class Exam01_ArrayList {
	// List 리스트 인터페이스의 특징 
	//1)순서를 유지하고 저장한다.
	//2)중복 저장 가능하다.
	//2)데이터의 갯수를 추가하거나 삭제 가능하다.
	public static void main(String[] args) {
	List<Integer> listNum = new ArrayList<Integer>();
	listNum.add(10);
	listNum.add(20);
	listNum.add(null);
	listNum.add(100);
	System.out.println(listNum.toString());//자동으로 용량이 증가
	
	List<String> travelList = new ArrayList<>(15);
	travelList.add("미국");
	travelList.add("프랑스");
	travelList.add("영국");
	travelList.add("스위서");
	travelList.add("한국");
	System.out.println(travelList.toString());
	
	System.out.println("==1)데이터 개수 확인==");
	System.out.println(listNum.size());
	System.out.println(travelList.size());
	
	listNum.add(2,50);
	System.out.println(listNum.toString());
	
	int n = listNum.get(2);
	System.out.println(n);
	
	listNum.set(3, 70);
	for(Integer num : listNum) {
		System.out.println(num+",");
	}
	System.out.println();
	listNum.remove(1);
	System.out.println(listNum.toString());
	
	listNum.sort(Comparator.reverseOrder());
	System.out.println(listNum.toString());
	listNum.sort(Comparator.naturalOrder());
	System.out.println(listNum.toString());
	
	listNum.sort(Comparator.reverseOrder());
	System.out.println(travelList.toString());
	listNum.sort(Comparator.naturalOrder());
	System.out.println(travelList.toString());
	
	listNum.clear();
	System.out.println(listNum.toString());
	
	String[] nations = {"방콕","이탈리아"};
	Collections.addAll(travelList, nations);
	System.out.println(travelList.toString());
	}
}
