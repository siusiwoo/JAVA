package repeat;

public class Exam02 {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		//1~10까지의 총합
		System.out.println("====계산시작====");
		for(i = 0; i <= 10; i++) {
			sum += i;
			System.out.println("sum : "+sum+", i:"+i);
		}
		System.out.println("====계산끝====");
		System.out.println("1~10까지의 총합은"+sum+"이고 i가 가지고 있는 값은 "+ i +"입니다.");
	}
}
