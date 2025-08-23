package ex01_list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam09_SelfEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();

		map.put("spring", "1111");
		map.put("summer", "2222");
		map.put("automn", "3333");
		map.put("winter", "4444");
		
		while(true){
			System.out.println("아이디와 비번을 입력하세요");
			System.out.println("아이디:");
			String id = sc.next();
			System.out.println("비밀번호:");
			String pw = sc.next();
			
			if(pw.equals(map.get(id))) { // map.get(아이디를 쓰면 뒤에있는 밸류가 나온다)
				System.out.println("로그인 되었습니다.");
				break;
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
				
			}
		}
	}
}
