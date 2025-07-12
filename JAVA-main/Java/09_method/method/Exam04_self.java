package method;

import java.util.Scanner;

public class Exam04_self {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 선언
	boolean[] car = new boolean[5];
	int select = 0; // 선택한 메뉴 저장 변수
	int position = 0;
	
	//주차 관리 프로그램 출력
	while(true) {
		System.out.println("주차 관리 프로그램");
		System.out.println("**************");
		System.out.println("1.입차");
		System.out.println("2.출차");
		System.out.println("3.리스트");
		System.out.println("4.종료");
		System.out.println("**************");
		System.out.println("메뉴 : ");
		
		select = sc.nextInt();
		
		if(select==4) { // 할당 할떈 ==으로 확인하기
			System.out.print("프로그램을 종료합니다.");
			break;
		}
		
		switch(select) {
		case 1:
			System.out.print("위치 입력[1~5]");
			position = sc.nextInt();
			if(car[position-1]) { //true: 주자된 차가 존재 배열이라-1
				System.out.println(position+"위치에 이미 주차되어있습니다.");
			}else {
				car[position-1] = true;
				System.out.println(position+"위치에 주차하였습니다.");
			}
			break;
		case 2:
			System.out.println("위치 입력[1~5]");
			position = sc.nextInt();
			if(car[position-1]) { // true: 주차된 차가 존재
				car[position-1] = false;
				System.out.println(position+"위치의 차를 출차하였습니다.");
			}else { //false: 주차된 차가 존재하지 않음
				System.out.println(position+"위치의 자차가 주차되어있지 않습니다..");
			}
			break;
		case 3:
			System.out.println();
			System.out.println("---리스트---");
			int n = 1;
 			for(boolean present : car) { // 향상된 포문안에서:이거쓰면 = 배열에서 하나씩 꺼내와서 쓰는 향상된 포문 
				System.out.println(n+"위치 :"+present);
				n++;
			}
			break;
			
		}
		
	}
	
	
	}
}
