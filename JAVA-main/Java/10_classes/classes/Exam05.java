package classes;

class Person{
	static int count = 10;
	//static 변수는 메모리의 heap영역에 저장되어 언제든지 바로 접근가능
	 Person(){
		 System.out.println("=====");
		System.out.println(count);
		count++;//클래스 변수
		System.out.println(count);
		System.out.println("=====");
	}
	 static void printCount() { //static 메소드
		  System.out.println("count : "+count);
	 }
}

public class Exam05 {
	public static void main(String[] args) {
		System.out.println(Person.count);
		Person.printCount();
		
		Person p1 = new Person();
		p1.printCount();
		
		Person p2 = new Person();
		p1.printCount();
		
	}
}
