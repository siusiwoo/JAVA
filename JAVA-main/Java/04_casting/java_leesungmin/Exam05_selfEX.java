package java_leesungmin;

public class Exam05_selfEX {
	public static void main(String[] args) {
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int) (Double.parseDouble(var4)+var1+var2)+(int)var3;
		System.out.println(result);
	}
}
