package customer;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Custom custom = new CustomImpl();
		int num = 0;
		while(true) {
		do {
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.고객 번호로 검색");
			System.out.println("4.고객 이름으로 검색");
			System.out.println("5.고객 연락처로 검색");
			System.out.println("6.고객 이름순 내림차순 정렬");
			System.out.println("7.고객 번호순 오름차순 정렬");
			System.out.println("8.종료");
			System.out.println("------------------");
			System.out.println("해당 번호를 입력하세요");
			num = sc.nextInt();
		} while (num < 1 || num > 8);
		switch (num) {
		case 1:
			custom.input();
			break;
		case 2:
			custom.print();
			break;
		case 3:
			custom.searchNumber();
			break;
		case 4:
			custom.searchName();
			break;
		case 5:
			custom.searchCall();
			break;
		case 6:
			custom.descSortName();
			break;
		case 7:
			custom.ascSortCall();
			break;
		case 8:
			System.out.println("종료합니다.");
			sc.close();
			System.exit(0);
		}

	}
	}
}