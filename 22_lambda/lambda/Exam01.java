package lambda;

interface MyValue{
	int getValue();
}

public class Exam01 {
	/* 함수적 인터페이스 : 하나의 추상 메소드가 선언된 인터페이스만이 타겟 타입이 될 수 있다.
	Runnable runnable = new Runnable() {
	public void run(){....}
	}=> 이코드를 람다식으로 표현하면
	Runnable runnable = () -> {...}
	람다 표현식 사용순서
	1) 인터페이스 만들기
	2) 인터페이스 참조 변수 만들기
	3)인터페이스 참조 변수에 람다 표현식 할당하기
	4)람다 표현식 수행시키기
	*/
	public static void main(String[] args) {
		//MyValue my = () -> 100;
		MyValue mv;
		mv = () -> 100;
		System.out.println(mv.getValue());
	}
}
