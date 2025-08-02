package abstraction;

public class Exmaple {
	public static void main(String[] args) {
		//Phone phone = new Phone();
		//추상 클래스는 new 생성자로 인스턴스를 만들 수 없다
		Smartphone smartphone = new Smartphone();
		smartphone.turnOn("유재석");
		smartphone.internetSearch();
		smartphone.turnOff("유재석");
		
		
		DMBPhone dmbPhone = new DMBPhone();
		dmbPhone.turnOn("유재석");
		dmbPhone.watchMedia();
		dmbPhone.turnOff("유재석");
		
	}
}
