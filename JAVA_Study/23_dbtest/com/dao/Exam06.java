package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dto.DbtestDTO;

public class Exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DbtestDAO dao = new DbtestDAO(); 
		
		
		//insert
		DbtestDTO dto = new DbtestDTO();
		System.out.println("이름 입력 :");
		dto.setName(sc.next()); 
		System.out.println("나이 입력 :");
		dto.setAge(sc.nextInt());
		System.out.println("키 입력 :");
		dto.setHeight(sc.nextDouble());
		
		int su = dao.insertArticle(dto);
		if (su > 0) {
			System.out.println("저장성공");
		}else {
			System.out.println("저장실패");
			System.out.println("==============");
		}
		//select
		List<DbtestDTO> list = dao.selectArticle();
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			System.out.println("==============");
		}
		//update
		 System.out.println("수정할 이름 입력 : ");
	        String name = sc.next();
	        su = dao.updateArticle(name);
	        if (su > 0) {
				System.out.println("수정성공");
			}else {
				System.out.println("수정실패");
				System.out.println("==============");
			}
	        
	        //delete
	        System.out.print("삭제할 이름 입력 : ");
			 name = sc.next();
			  su = dao.deleteArticle(name);
			  if (su > 0) {
					System.out.println("삭제성공");
				}else {
					System.out.println("삭제실패");
					System.out.println("==============");
				}
			 
			//select
			  list = dao.selectArticle();
			  for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i));
					System.out.println("==============");
				}
	}
}
