package array;

import java.util.Arrays;

public class Exam02 {
	public static void main(String[] args) {
	int[] coding_score = {100,90,80,70,50};
	
	//coding_score 배열변수의 데이터를 차례대로 통째로 출력
	//1)for문
	for(int i=0; i<coding_score.length;i++) {// coding_score의 개수만큼 돌아라
		System.out.println(coding_score[i]);
	}
	
	//2)Arrays.toString(배열의 변수명)=>배열을 통째로 출력 import 로 불러와야함
	System.out.println(Arrays.toString(coding_score));
	
	int[] eng_score = new int [3];
		System.out.println(Arrays.toString(eng_score));
	
	double[] math_score = new double[3];
		System.out.println(Arrays.toString(math_score));
		
	
	}
}
