package Exam04;

//인터페이스란 객체의 사용 설명서의 역할을 한
public interface RemoteControl {
	// 상수
	// 인터페이스는 상수만 쓴다 그래서 자동으로 상수로 지정됨
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드 : 인터페이스의 모든 메소드는 기본적으로 public 접근 제한자를 갖는다
	void turnOn();
	void turnOff();
	void setVolume(int Volume);
}
