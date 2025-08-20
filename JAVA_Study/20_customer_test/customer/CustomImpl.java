package customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomImpl implements Custom {
	Scanner sc = new Scanner(System.in);
	List<CustomVO> List = new ArrayList<CustomVO>();

	//입력
	@Override
	public void input() {
		CustomVO vo = new CustomVO();
		System.out.println("고객번호 : ");
		vo.setNumber(sc.next());
		System.out.println("고객이름 : ");
		vo.setName(sc.next());
		System.out.println("고객 전화번호 : ");
		vo.setCall(sc.next());
		List.add(vo);
	}
	
	//출력
	@Override
	public void print() {
			printTitle();
			for(int i = 0; i < List.size(); i++) {
				CustomVO vo = List.get(i);
				System.out.println(vo.toString());
			}
		
	}

	@Override
	public void printTitle() {
		String str = String.format("%10s %10s %10s", "고객번호","고객이름","고객 전화번호");
		System.out.println(str);
	}

	@Override
	public void searchNumber() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchCall() {
		// TODO Auto-generated method stub

	}

	@Override
	public void descSortName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ascSortCall() {
		// TODO Auto-generated method stub

	}

}
