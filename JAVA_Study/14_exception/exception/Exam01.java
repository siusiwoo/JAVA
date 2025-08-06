package exception;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("내 나이를 계산하려면 태어난 연도를 입력해주세요.");
		
		try {
			int year = sc.nextInt();
			int age = 2025-year;
			System.out.println("내 나이는 "+age+"살입니다.");
		} catch (Exception e) {
			System.out.println("에러발생 : 다시한번 정확하게 숫자만 입력해주세요.");//사용자가 보는 창
			System.out.println("==========================================");
			System.out.println(e.getMessage());// 개발자가 보는 창
			// 예외가 가지고 있는 메세지를 얻기 위해 Exception 클래스가 가지고 있는 getMessage() 사용가능
			e.printStackTrace();
		}  finally { // 무조건 실행
			System.out.println("프로그램이 동작중입니다.");
		}
		//예외에도 두가지 종류가 있다.
		//실행예외 : 개발자의 경험에 의해서 예외처리구문을 삽입
		//일반예외 : 컴파일과정에서 예외처리코드가 없으면 컴파일 오류가 발생하기 때문에 꼭 예외처리코드를 넣어주어야한다.
	}
}
