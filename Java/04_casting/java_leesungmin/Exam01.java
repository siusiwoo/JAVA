package java_leesungmin;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l;
		int i2 = 1000;
		l = i2 * i2;
		System.out.println(l);
		
		byte b1, b2;
		int i=100, j=300;
		b1 = (byte)i;
		System.out.println(b1);
		b1 = (byte)j;
		System.out.println(b1); // 128+128+44=300
		
		byte b3=5, b4;
		b4 = (byte)(b3 + 3);
		// 계산식에 리터럴 상수가 포함된 경우, 기본적으로 정수 데이터는 int형으로, 실수 데이터는 double형으로 간주되어 계산한다.
		System.out.println(b4);
		
	}

}
