package classes;

class Book{
	String title;
	static String author;
	int ISBN;
	
	public Book() {
		System.out.println("매개변수 없는 생성자 호출");
	}
	public Book(String title, int iSBN) {
		System.out.println("매개변수 두개짜리  생성자 호출");
		this.title = title;
		ISBN = iSBN;
		
	}
	
	public Book(String title) {
		System.out.println("매개변수 한개짜리 생성자 호출");
		this.title = title;
	}
	
}

public class Exam04 {
	Book javaBook = new Book("자바북",3333);
	Book theBible = new Book("성격책");
	Book emptyBook = new Book();

	
}
