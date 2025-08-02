package Exam01;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0에서 100 범위 안의 정수를 입력하ㅔ요");
		int num = sc.nextInt();
		
		if(num < Limit.MIN || num > Limit.MAX) {
			System.out.println("범위를 벗어납니다.");
		}
		else if(num >= Limit.MIN && num <= Limit.MAX) {
			System.out.println("유효한 숫자입니다.");
		}
		sc.close();
	}
}
