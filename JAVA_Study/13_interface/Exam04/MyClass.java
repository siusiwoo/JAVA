package Exam04;

public class MyClass {
	// 인터페이스로 구현 객체 사용하는 방법 4가지
	
	// 1)인터페이스가 필드 타입으로 사용될경우 필드의 구현객체를 대입할수있다.
	RemoteControl rc = new Television();// 구현 객체/인터페이스를 부모 타입으로 사용해서 다형성을 구현
	
	
	// 2)인터페이스가 생성자의 매개변수 타입으로 사용될경우
	MyClass(){}
	MyClass(RemoteControl rc){ // 얘는 생성자 매개변수가 적히면 실행
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(20);
		
	}
	// 3)인터페이스가 로컬변수 타입으로 사용될경우 변수 구현 객체 대입
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(-20);
	}
	// 4)인터페이스가 매개 변수 타입으로 사용될경우
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);	
	}
}
