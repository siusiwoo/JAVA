package Exam04;

public class Example {
	public static void main(String[] args) {
		MyClass mc = new MyClass(new Audio ());//new 키워드를 썼을때 사용 되는 생성자
		System.out.println("===================");
		mc.methodA();
		System.out.println("===================");
		mc.methodB(new Audio());
	}
}
