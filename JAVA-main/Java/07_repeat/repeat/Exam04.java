package repeat;

public class Exam04 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(true) {
			sum += i;
			if(i>=10)break;
			i++;
			System.out.println("sum:"+sum+",i:"+i);
		}
	}
}
