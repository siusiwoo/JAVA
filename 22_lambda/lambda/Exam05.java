package lambda;

@FunctionalInterface
interface Test2<T>{//제네릭 함수형 인터페이스
	boolean test2(T n , T m);
	
}

public class Exam05 {
	public static void main(String[] args) {
		Test2<Integer> x = (n,m) -> n<m;
		
		if(x.test2(3, 5)) System.out.println("3이 5보다 작다");
		
		Test2<String> z = (n,m) -> n.equals(m);
		String str = "java";
		if(z.test2("javar", "javar"))System.out.println("두개 문자열이 같다.");
		else System.out.println("두개의 문자열이 다르다");
		
		}
}
