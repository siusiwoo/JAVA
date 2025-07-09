package array;

public class Exam03 {
	public static void main(String[] args) {
	//2차원 배열(학생 3명의 국영)
	int[][] scores =new int [3][2];
	String[] names = {"홍길동","김지민","이종수"};
	
	scores[0][0] = 100;	
	scores[0][1] = 90;	
	scores[1][0] = 90;	
	scores[1][1] = 90;	
	scores[2][0] = 90;	
	scores[2][1] = 90;
	
	System.out.println("홍길동 시험본 과목: "+scores[0].length); //[0]의 열의 개수
	System.out.println("scores.length :"+scores.length); //행의 개수
	//2차원 배열의 총점과 평균점수 구하기
	for(int i=0;i<scores.length;i++) {
		int sum = 0;
		int avg = 0;
		
		//학생 1명의 총점과 평균 구하기
		for(int j=0; j<scores[i].length;j++) {
			sum += scores[i][j];
		}
		avg = sum/scores[i].length; 
				
		System.out.printf("%s: 총점=%d, 평균=%d\n",names[i],sum,avg);
	}
	
		
	
	
	}
}
