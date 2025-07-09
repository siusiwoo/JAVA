package conditional;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 자바점수를 정수로 입력하세요.");
		int score =sc.nextInt();
		String result = "";
		
		if(score>=90)result = "A학점"; 
		else if(score>=80)result = "B학점"; 
		else if(score>=70)result = "C학점"; 
		else if(score>=60)result = "D학점"; 
		else result = "F학점";
		
		System.out.println(score+"는"+result+"입니다.");
			
	
	}
}
