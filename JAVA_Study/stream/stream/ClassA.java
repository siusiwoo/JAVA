package stream;

import java.io.Serializable;

//직열화 Serializable 인터페이스를 구현한 클래스만 직렬화 할 수 있도록 제한하고 있다.
//객체를 직열화일 때 모든 필드를 바이트로 변환해도 좋다는 표시 역할 
public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3; // 직렬화가 불가능한 필드
	transient int field4; //

}
