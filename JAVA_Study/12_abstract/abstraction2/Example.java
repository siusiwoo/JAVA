package abstraction2;

public class Example {
	public static void main(String[] args) {
		//parent parent = new Parent();
		//자식만을 위해 존재하는 클래스=> 추상 클래스
		//추상 클래스는 추상메서드가 엄청 필요하진 않지만 추상메서드는 추상클래스가 필요함
		
		Child child = new Child();
		child.show();
		child.call();
		child.print();
	}
}
