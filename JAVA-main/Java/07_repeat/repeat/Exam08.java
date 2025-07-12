package repeat;

public class Exam08 {
	// n-i만큼 공백을한다
	public static void main(String[] args) { //층수
		for(int i = 1;i<=5;i++){
			for(int j = 1;j <= 5-i;j++){	// 공백의 갯수
				System.out.print(" ");
			}
			
			for(int j =1;j < (2*i);j++){	//별의 갯수
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
