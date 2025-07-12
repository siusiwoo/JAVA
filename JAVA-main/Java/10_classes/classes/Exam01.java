package classes;


	class Car{ // 디폴트랑프라이빗 만 가능
	String kind; // 차종
	String color; // 색상
	int year; // 연식
	
	void run() {
		System.out.println( kind+"자동차가 질주한다.");
	}
	void speedUp() {
		System.out.println(color+"색의"+year+"연식의 "+kind+"자동차가 스피드를 올리고있다.");
	}
}
	//클래스 설계도
	//객체는 각각의 데이터를 가져와 사용하는것
	// System은 클래스명
	// static은 선언 없이 바로 사용 가능
	
public class Exam01 {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println(myCar);// 객체가 있는 주소값을 저장
		System.out.println(myCar.kind);// 매개변수 선언	
		System.out.println(myCar.color);// 매개변수 선언	
		System.out.println(myCar.year);// 매개변수 선언
		System.out.println("==========");
		
		myCar.run();
		myCar.speedUp();
		System.out.println("==========");
		
		myCar.kind = "람보르기니";
		myCar.color = "빨간";
		myCar.year = 2035;
		
		myCar.run(); // 람보르기니 들어감
		myCar.speedUp(); // 빨간과 2035가 들어간 값
		System.out.println("==========");
		
		Car yourCar = new Car(); // 클래스는 틀 건축  설계도 클래스 같아도 다른걸 만들수있음
		myCar.run();// 초기값 null
		myCar.speedUp(); // 초기값 null
		System.out.println("==========");
		yourCar  = myCar; // 같은 곳을 가리킴 같은 인스턴스를 공유 한다
		myCar.run();// myCar 값을 가르켜 람보르기니가 들어감
		myCar.speedUp(); // mycar 값을 가르켜 빨간과 2035가 들어간 값
		System.out.println("==========");
		
	}
}
