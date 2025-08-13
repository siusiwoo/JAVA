package generic;

public class Exam04_UtilExample {
	public static void main(String[] args) {
		Present<Integer>  present1 = Util.<Integer>presnting(100);// 나 정수 쓸거야 100 생략도 가능함
		//Util.presnting(100);
		int intvalue = present1.getValue();
		System.out.println(intvalue);
		
		Present<String>  present2 = Util.presnting("전지현");// 나 정수 쓸거야 100 생략도 가능함
		//Util.presnting(100);
		String strvalue = present2.getValue();
		System.out.println(strvalue);
	}
}
