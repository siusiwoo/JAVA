package test;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ctrl + shift + O 를 클릭하여 클래스를 한꺼번에 임포트
		
		String name = "", realGender = "";
		int age = 0;
		char gender;
		double height = 0;
		
		
		System.out.print("이름:");
		name = scanner.nextLine();
		System.out.print("나이:");
		age = scanner.nextInt();
		System.out.print("성별을 한글자로 입력해 주세요(M/F):");
		gender = scanner.next().charAt(0);
		System.out.print("신장:");
		height = scanner.nextDouble();
		
//		if (gender == 'M' || gender == 'm') {
//			realGender = "남자";
//			System.out.println(name);
//			System.out.print("만나이:" + (age - 1));
//			System.out.println("성별:" + realGender);
//			System.out.println("키:" + height);
//		} else if(gender == 'F' || gender == 'f'){
//			realGender = "여자";
//			System.out.println(name);
//			System.out.print("만나이:" + (age - 1));
//			System.out.println("성별:" + realGender);
//			System.out.println("키:" + height);
//		} else {
//			System.out.println("M/F중 다시 입력해 주세요.");
//			
//		}
		
		realGender = (gender == 'M' || gender == 'm') ? "남자" : "여자";
		System.out.println(name);
		System.out.print("만나이:" + (age - 1));
		System.out.println("성별:" + realGender);
		System.out.println("키:" + height);
	}
}
