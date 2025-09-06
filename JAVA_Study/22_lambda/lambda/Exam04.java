package lambda;

@FunctionalInterface
interface Test{
	int getsum(int n);
}

public class Exam04 {
	public static void main(String[] args) {
		Test t = (n) -> {
		int result = 0;
		for(int i=1; i<=n;i++) {
			result += i;
		}
		return result;
		};// 여러줄의 실행코드를 구현하는 경우 반드시 중괄호로 묶고; 을 마지막에 넣어야한다
		System.out.println("1~10의 총합은 "+t.getsum(10));
		System.out.println("1~50의 총합은 "+t.getsum(50));
	}
}
