package conditional;

import java.io.InputStream;
import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	  	int Korean = 0;
	  	int English = 0;
	  	int Mathematics = 0;
		
		
	  	
	  	System.out.println("국어 점수 입력");
	  	Korean = sc.nextInt();
		
		System.out.println("영어 점수 입력");
		English = sc.nextInt();
		
		System.out.println("수학 점수 입력");
		Mathematics = sc.nextInt();
		
		char grade = 0;
		String result = "";
		int avg = (Korean + English + Mathematics)/3;
		
		if(Korean < 40 ||English < 40 ||Mathematics < 40) {
			System.out.println("탈락");
		}	else {
			System.out.println("합격");

		}		
	}
}