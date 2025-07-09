package repeat;

public class Exam05 {
	public static void main(String[] args) {
		//1~10까지 홀수의 총합
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) continue;// 이 조건이 맞으면 그 다음줄은 건너뛰고 앞으로 가서 계속하겠다.
			sum+=i;
			System.out.println("총합 : "+sum+"i의 값:"+i);
		}
		System.out.println("최종 sum의 값 :"+sum);
	}
}
