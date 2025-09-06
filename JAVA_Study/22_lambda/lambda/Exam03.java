package lambda;

interface Testing{
	boolean testing(int n,int m);
}
public class Exam03 {
	public static void main(String[] args) {
		Testing t1 = (n,d) -> (n%d) == 0;
		
		if(t1.testing(10, 5)) { System.out.println("5는 10의 약수이다.");}
		if(!t1.testing(10, 3)) { System.out.println("3은 10의 약수이다.");}
		
		Testing t2 = (n,m)-> (n<m);
		if(t2.testing(10, 5)) { System.out.println("3는 5의 약수이다.");}
		if(!t2.testing(10, 3)) { System.out.println("5은 3의 약수이다.");}
		
		
	}
}
