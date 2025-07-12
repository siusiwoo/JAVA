package method;

public class Exam3_self {
	
	public static void main(String[] args) {
		// 문제3
				int[] scores = {58, 76, 90, 45, 67};
				
				int sum = 0;
				int min = scores[0];
				int max = scores[0];
				
				for(int score : scores) {
					 sum += score;
					if(score < min) min = score;
					if(score < max) min = score;
				}
				
				double avg = sum / (double)scores.length;
				
				System.out.println("총점 : "+sum);
				System.out.println("평균 : "+avg);
				System.out.println("최고점 : "+max);
				System.out.println("최저점 : "+min);
				
				if(avg >= 70 && min >= 50) {
					System.out.println("결과 : 합격");
				}else {
					System.out.println("결과 : 불합격");
				}
	}
}
