package lambda;

@FunctionalInterface // 람다식 타입이라고 알려주는거
interface MyValue2{
	double getValue(int n);
	//int get;
}

public class Exam02 {
	public static void main(String[] args) {
		
		MyValue2 mv2;
		mv2 = n -> 1.0/n;
		System.out.println(mv2.getValue(5));
		System.out.println(mv2.getValue(10));
		System.out.println(mv2.getValue(100));
		System.out.println(mv2.getValue(200));
		
	}
}
