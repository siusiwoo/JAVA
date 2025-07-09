package array;

public class Exam01 {
	public static void main(String[] args) {
			int[] hong = {90,80,90,70};
			int[] kim = new int [] {100,90,95,70};
			int[] lee = new int [4];
			int[] park;
			
			System.out.println(hong[0]); // 90
			System.out.println(kim[0]); // 100
			System.out.println(lee[0]); // 0
			
			//System.out.println(park[0]); 에러 널
			
			// 보통 이걸 많이씀 
			lee[0] = 100;
			lee[1] = 90;
			lee[2] = 70;
			lee[3] = 80;
			//선언만 해놨을때 new int [] 없으면 바로 {}
			park = new int[] {90,80,90,70};
			System.out.println(lee[0]);
			System.out.println(park[0]);
			
			//개인별 총점 구하기
			int sum1=0, sum2=0, sum3=0, sum4=0;
			for(int i=0; i< hong.length; i++) {//홍이 가지고있는 개수는 5니까 가지고있는 개수 만큼 함
				sum1 += hong[i];
			}
			System.out.println(sum1);
			System.out.println("홍길동의 평균 : "+sum1/hong.length);// 홍이 가지고있는 개수를 나눠서 평균을 구함
	}

}
