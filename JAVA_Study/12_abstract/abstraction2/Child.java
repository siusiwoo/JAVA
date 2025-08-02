package abstraction2;

public class Child extends parent {

	@Override
	void call() {
		System.out.println("나는 부모 추상 메소드를 오버라이드 한 자식 메소드");
	}
	
	void print() {
		System.out.println("나는 자식 메소드");
	}
}
