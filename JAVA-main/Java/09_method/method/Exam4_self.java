package method;

import java.util.Scanner;

public class Exam4_self {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		//문제 4
		int min = 0;
		int max = 0;
		int a =0;
		
		min = sc.nextInt();
		max = sc.nextInt();
		for(int i =min;i<=max;i++) {
			
			if(i%2 == 0) {
				a += i;	 
			
			}
		}
		System.out.println("작은 수를 입력하세요 (a) : "+min);
		System.out.println("큰 수를 입력하세요 (b) : "+max);
		System.out.println("11부터 999까지 짝수의 총합 :"+a);
		// 스위치 문제는 break 부터 보기
	}
}
