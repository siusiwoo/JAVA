package java_leesungmin;

public class Exam03 {

	public static void main(String[] args) {
		// 강제 형변환
		double d = 123456789012345L;
		float f = (float) d;
		short s = 100;
		int i = s;
		long l = i;
		System.out.println("d="+d);
		System.out.println("f="+f);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
	}

}
