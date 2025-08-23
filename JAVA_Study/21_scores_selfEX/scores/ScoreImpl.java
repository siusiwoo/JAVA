package scores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {
	Scanner sc = new Scanner(System.in);
	List<ScoreVO> list = new ArrayList<>();

	@Override
	public void input() {
		ScoreVO vo = new ScoreVO();

		System.out.println("학번 : ");
		vo.setStudNo(sc.next());
		System.out.println("이름 : ");
		vo.setName(sc.next());
		System.out.println("국어점수 : ");
		vo.setKor(sc.nextInt());
		System.out.println("영어점수 : ");
		vo.setEng(sc.nextInt());
		System.out.println("수학점수 : ");
		vo.setMat(sc.nextInt());

		// 총점 저장
		int tot = vo.getKor() + vo.getEng() + vo.getMat();
		vo.setTot(tot);
		// 평균저장
		vo.setAvg(tot / 3.0);

		// 리스트에 저장
		list.add(vo);
	}

	@Override
	public void print() {
		printTitle();
		for (int i = 0; i < list.size(); i++) {
			ScoreVO vo = list.get(i);
			System.out.println(vo.toString());
		}

	}

	@Override
	public void printTitle() {
		String str = String.format("%5s %5s %5s %5s %5s %5s %5s", "학번", "이름", "국어점수", "영어점수", "수학점수", "총점", "평균");
		System.out.println(str);
	}

	// 학번 검색
	@Override
	public void searchStuNo() {
		System.out.println("학번 입력 :");
		String studNo = sc.next();

		for (int i = 0; i < list.size(); i++) {
			ScoreVO vo = list.get(i);
			if (studNo.equals(vo.getStudNo())) {
				printTitle();
				System.out.println(vo);
			}
		}
	}

	@Override
	public void searchName() {
		System.out.println("이름 입력 :");
		String name = sc.next();

		for (int i = 0; i < list.size(); i++) {
			ScoreVO vo = list.get(i);
			if (name.equals(vo.getName())) {
				printTitle();
				System.out.println(vo);
			}
		}
	}

	//총점기준 내림차순 정렬
	@Override
	public void descSortTot() {
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {//익명객체 생성

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				// o1의 가격이 o2가격보다 작으면 양수, 같으면 0, 크면 음수 리턴
				// 오름차순으로 만들고 싶으면 -1:1 내림차순 1 : -1
				return o1.getTot() < o2.getTot() ? 1 : -1;
			}
		};
		Collections.sort(list,comp);
	}
	// 학번기준 오름차순 정렬
	@Override
	public void ascSortStuNo() {
		Comparator<ScoreVO> comp = new Comparator<>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return o1.getStudNo().compareTo(o2.getStudNo());
			}

			
		};
		Collections.sort(list, comp);
		print();
	}

	@Override
	public void saveFile() {
		

	}

	@Override
	public void readFile() {
		
	}

}
