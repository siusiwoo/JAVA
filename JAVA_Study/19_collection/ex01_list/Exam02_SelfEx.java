package ex01_list;

import java.util.ArrayList;
import java.util.List;

public class Exam02_SelfEx {
	
	// 리스트에 데이터를 저장할 때 People 자바빈즈 클래스를 만들고
	// ("홍길동","010-1234-5678")
	// ("홍길동","010-1124-7428")
	// ("홍길동","010-5644-5678")
	// ("홍길동","010-1221-5378")
	public static void main(String[] args) {
		List<String> listNum = new ArrayList<String>();
		listNum.add("홍길동,010-1234-5678]\n");
		listNum.add("[뇽뇽이,010-1124-7428]\n");
		listNum.add("[낭낭이,010-5644-5678]\n");
		listNum.add("[땅따이,010-1221-5378");
		System.out.println(listNum.toString());
	}
}
