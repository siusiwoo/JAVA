package string;

public class SelfEx01 {
public static void main(String[] args) {

	String str1 = "D:/photo/2021/travel/food.jpg";
	
	String sub = str1.substring(21,25);
	String sub2 = str1.substring(26,29);
	String sub3 = str1.substring(0,19);
	System.out.println("파일이름:"+sub);
	System.out.println("확장자:"+sub2);
	System.out.println("폴더이름:"+sub3);
}
}
