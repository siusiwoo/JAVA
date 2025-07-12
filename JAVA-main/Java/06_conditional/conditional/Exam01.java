package conditional;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 코딩점수를 입력하세요.");
		int score =sc.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("A등급입니다.");
		}
		else if(score >= 80 && score < 90) {
			System.out.println("B등급입니다.");
		}
		else if(score >= 70 && score < 80) {
			System.out.println("C등급입니다.");
		}
		else if(score >= 60 && score < 70) {
			System.out.println("D등급입니다.");
		}
		else if(score >= 0 && score < 60) {
			System.out.println("F등급입니다.");
		}
	}
	
}
