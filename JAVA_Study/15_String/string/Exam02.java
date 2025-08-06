package string;

public class Exam02 {
	public static void main(String[] args) {
		//String 클래스의 자주 사용하는 메소드들
		String str1 = "자바 Programming test";
		String str2 = new String("Java ");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("==============");
		System.out.println("1)문자열의 길이 확인");
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println("==============");
		System.out.println("2)특정 문자열이 처음으로 나타나는 위치 조회");
		System.out.println(str1.indexOf(" "));
		System.out.println(str1.lastIndexOf(" "));
		System.out.println(str2.indexOf("a"));
		System.out.println(str2.lastIndexOf("a"));
		System.out.println(str2.indexOf("x"));
		
		System.out.println("====================");
		System.out.println("3)문자열을 변경");
		String new_str1 = str1.replace(" ","_");
		System.out.println(new_str1);
		String new_str2 = str2.replace("a","A");
		System.out.println(new_str2);
		
		System.out.println("======================");
		System.out.println("4)대소문자 변경");
		String upper = new_str2.toUpperCase();
		String lower = new_str2.toLowerCase();
		System.out.println(upper);
		System.out.println(lower);
		
		System.out.println("============");
		System.out.println("5)문자열 앞뒤 공백 제거");
		String str3 = "                       enjot java coding         ";
		String s3 = str3.trim();
		String r3 = str3.replace(" ","");
		System.out.println("1111"+s3+"1111");
		System.out.println("1111"+r3+"1111");
		
		System.out.println("====================");
		System.out.println("6)문자열 가르기");
		String sub = str1.substring(0,4);
		System.out.println(sub);
		
	}
}
