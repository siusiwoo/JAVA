package array;

import java.util.Scanner;

public class Exam04_self {
	public static void main(String[] args) {
		
		int sum =0;
		double avg =0;
		//정수 배열을 선언하고 5개의 배열
		Scanner sc = new Scanner(System.in); // scanner 선언
		int[] coding_score = new int [5];// 배열 지정
		// for(String name : names)System.out.println(name); 
		
		for(int i = 0;i<coding_score.length;i++) {// 포문 코딩스코어에 배열만큼실행
			System.out.printf("%d번 학생의 점수를 입력 : ",i+1);// 0 부터 시작이니까 i+1해줌
			coding_score[i] = sc.nextInt();//코딩 배열에 i번째 i는 0부터 시작 를 입력 받겠다
			sum += coding_score[i]; // 코딩배열에 i번째를 썸에 다 더해서 총점을 받음
		}
		avg = sum/coding_score.length;// 평균 구함
		System.out.printf("총점=%d, 평균=%.2f\n",sum,avg);// 총점&평균
		
	// 향상된 for문
	//	for(int score : students) { 있는 개수 만큼 알아서 씀
	//		sum += score;
	//	}
	}
	
}
