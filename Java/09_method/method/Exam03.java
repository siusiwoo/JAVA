package method;

public class Exam03 {
	public static void main(String[] args) {
	Exam02 exam02 = new Exam02();// 생성자 함수 scanner랑 비슷한개념
	double result = exam02.areaRectangle(5);
	System.out.println("정사각형의 넓이:"+result);
	double result2 = exam02.areaRectangle(5,10);
	System.out.println("정사각형의 넓이:"+result2);
		
	}
}
