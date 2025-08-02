package abstraction2;

public abstract class parent {
	void show() {
		System.out.println("나는 부모인 추상 클래스");
	}
	// 추상 메소드를 만드는 클래스는 꼭 추상 클래스여야 한다!!
	abstract void call();
}
