package generic;

//제네릭을 사용하는 가장 큰 장점 중의 하나는 타입변환(casting)을 하지 않아도 되는 장점.
public class Present<T> { // T 타입 파라미터로, 실제 사용할 떄 구체적인 타입(String, Integer ,Boolean,Byte,Character,Short,Long,Float,Double:래퍼 클래스)으로 대체된다. 
	//String, Integer 참조 타입이면서 레퍼런스 타입 기본형을 객체로 감싼 클래스
	
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
