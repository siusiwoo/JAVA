package conditional;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int midExam = 0; // 중간고사 20%
		int finalExam = 0;// 기말고사 20%
		int report = 0; // 논술 20%
		int present = 0; // 출석 20%
		int activity = 0;// 활동 20%
		char grade = 0;
		String result = "";
		
		// 사용자 입력
		System.out.println("중간고사 점수 입력");
		midExam = sc.nextInt();
		
		System.out.println("기말고사 점수 입력");
		finalExam = sc.nextInt();
		
		System.out.println("논술 점수 입력");
		report = sc.nextInt();
		
		System.out.println("출석 점수 점수 입력");
		present = sc.nextInt();
		
		System.out.println("활동 점수 입력");
		activity = sc.nextInt();
		
		
		
		
		// 평균 연산 
		double avg = 0;
		avg = ((midExam + finalExam)/2*0.4)+((report + present +activity)/3*0.6);
		
		// 하나의 과목이라도 40점 미만이 잇으면 과락으로 처리
		if(midExam < 40 ||finalExam < 40 ||report < 40 ||present < 40 ||activity < 40) {
			grade = 'F';
			result = "과락";
		}	else {
			//학점 연산
			switch ((int)avg/10) {
			
			case 10: grade='A'; break;
			case 9: grade='A'; break;
			case 8: grade='B'; break;
			case 7: grade='C'; break;
			case 6: grade='D'; break;
			default:grade = 'F'; break;
				
			}	 
			// 최종 평가 연산
			switch(grade) {
			case 'A' :
			case 'B' : result = "exallent";break;
			case 'D' :
			case 'C' : result ="good"; break;
			default : result = "탈락";
				
			}
			
		  }
		//출력
		System.out.println("평균성적 :"+avg);
		System.out.println("학적 :"+grade);
		System.out.println("최종평가 :"+result);
		}
	}


