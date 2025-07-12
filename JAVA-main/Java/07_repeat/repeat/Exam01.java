package repeat;

public class Exam01 {
	public static void main(String[] args) {
		int i =1;
		int sum = 0;
		
		while(i <= 10) {
			// sum = sum + i;
			sum += i;
			System.out.println("sum : "+sum);
			i++;
			System.out.println("i : "+ i);
		}      
		System.out.println("1~10까지의 총합은 "+sum+"입니다.");
		
		
		
		
		
	}
}
