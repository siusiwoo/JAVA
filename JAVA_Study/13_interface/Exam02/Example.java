package Exam02;


interface Things {
	void printInfo();//public abstract 키워드가 컴파일 과정에서 자동으로 붙는다
}
// 1) 인터페이스를 상속받는 클래스
class ChildrenBook implements Things{
	private String tilte;
	private String author;
	
	
	public ChildrenBook() {
		super();
		
	}

	public ChildrenBook(String tilte, String author) {
		super();
		this.tilte = tilte;
		this.author = author;
	}
	@Override
	public void printInfo() {
		System.out.println("==어린이책 정보==");
	}
}
//2)인터페이스를 상속받는 인터페이스            인터페이스는 추상메서드를 받는다
interface Book extends Things{
	void showTitle();
}

class Books implements Book{

	@Override
	public void printInfo() {
		System.out.println("==책 정보==");
		
	}

	@Override
	public void showTitle() {
		System.out.println("==책 제목==");
		
	}
	
}

public class Example {
	public static void main(String[] args) {
		ChildrenBook childrenBook = new ChildrenBook("자바책","감자바");
		childrenBook.printInfo();
		
		Books books = new Books();
		books.printInfo();
		books.showTitle();
	}
}
