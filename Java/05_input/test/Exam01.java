package test;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 변수 선언: 데이터를 저장할 수 있는 변수 
		double a, b, c;
		
		// 2. 사용자에게 데이터를 입력받아 변수에 데이터 저장
		System.out.println("밑변의 길이를 실수(cm)로 입력하세요.");
		a = sc.nextDouble();
		System.out.println("높이를 실수(cm)로 입력하세요.");
		b = sc.nextDouble();
		
		// 3.연산: 저장된 데이터를 연산해서 삼각형의 넓이를 구하세요
		c = a * b / 2f;
		
		// 4. 입력한 데이터를 가지고 생성한 삼각형의 넓이는 실수타입으로는 xx입니다. 정수타입으로는 xx입니다.
		System.out.println("입력한 데이터를 가지고 생성한 삼각형의 넓이는 실수타입으로는 " +c + "입니다.");
		System.out.println("입력한 데이터를 가지고 생성한 삼각형의 넓이는 정수타입으로는 " + (int)c + "입니다.");
		sc.close();
	}
}
