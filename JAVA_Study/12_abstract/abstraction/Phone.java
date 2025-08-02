package abstraction;

//추상 클래스 : 추상 클래스 그 자체로는 객체생성이 불가
public class Phone {
	public String owner;

 

// 추상클래스 도 생성자함수가 있어야 한다. 자식 클래스로 인스턴스를 만들 떄 super()호출해서 부모의 생성자함수를 호출하기위해 필요하다 
// 매개변수가 있는 생성자함수를 만들면 매개변수가 없는 생성자 함수가 자동으로 만들어 지지 않으므로 만들지 않으면 실행이 되지않는다 왜냐면 매개변수 없는 생성자를 상속 받기떄문
	
	public Phone() {
		System.out.println("매개변수 없는 생성자 함수 호출");
		
	}
	
	public  Phone(String owner) {
		System.out.println("매개변수 있는 생성자 함수 호출");
		this.owner = owner;
	}
	
	public void turnOn(String owner) {
		System.out.println(owner+"가 폰 전원을 켭니다");
	}
	public void turnOff(String owner) {
		System.out.println(owner+"가 폰 전원을 끕니다");
	}
	
}
