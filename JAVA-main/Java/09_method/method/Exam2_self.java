package method;

import java.util.Scanner;

public class Exam2_self {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 문제2	
			byte a = 0;
			short b = 0;
		 	char c = '0';
			
			a = sc.nextByte();
			b = sc.nextByte();
			c = (char)(a*b);
			System.out.println(c);
	}

}
