package repeat;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = 0;
		char ch = 0;
		boolean run = true;
		while(run){
			System.out.print("몇 단을 출력할지 입력하세요 : ");
			times = sc.nextInt();
			for(int i=1;i < 10;i++) {
				System.out.println(times+"*"+i+"="+(i*times));                                        
			}
			System.out.println("계속할 지 선택하세요 (y:계속): ");
			ch = sc.next().charAt(0);
			if((ch=='y'||ch=='Y')) {
				run = false;
				System.out.println("종료합니다.");
					
			}
			
		}
	}

}
