package scores;

import java.util.Scanner;


public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score score = new ScoreImpl();
		int num = 0;
		while (true) {
			do {
				System.out.println("1.입력");
				System.out.println("2.출력");
				System.out.println("3.학번으로 검색");
				System.out.println("4.이름으로 검색");
				System.out.println("5.총점기준 내림차순 정렬");
				System.out.println("6.학번기준 오름차순 정렬");
				System.out.println("7.파일로저장");
				System.out.println("8.파일읽어오기");
				System.out.println("9.종료");
				System.out.println("----------------");
				System.out.println("해당 번호를 입력하세요");
				num = sc.nextInt();
			} while (num < 1 || num > 8);
			System.out.println();

			switch (num) {
			case 1:
				score.input();
				break;
			case 2:
				score.print();
				break;
			case 3:
				score.searchStuNo();
				break;
			case 4:
				score.searchName();
				break;
			case 5:
				score.descSortTot();
				break;
			case 6:
				score.ascSortStuNo();
				break;
			case 7:
				score.saveFile();
				break;
			case 8:score.readFile(); 
				break;
			case 9:	
				System.out.println("종료합니다.");
				sc.close();
				System.exit(0);
			}
		}
	}
}
