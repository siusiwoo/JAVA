package string;

public class Exam01 {
	public static void main(String[] args) {
		String str1 = "전도연";
		String str2 = new String("전도연");
		String str3 = new String("전도연");
		
		System.out.println(str1);
		System.out.println(str2);
		// 값 타입 struct  참조 타입 class 어디에있냐 하니까 다름 뉴라 새로운 유니버스에 있음
		if(str3.equals(str2)) System.out.println("같은 문자열 객체를 참조함");
		else System.out.println("다른 문자열 객체를 참조함");
			
		// 원래 equals() 메소드는 오브젝트 클래스의 번지수를 비교하는 메소드이지만, String 클래스는 equals() 오버라이딩해서 
		//사용하여 문자열을 비교하도록 변경했기 때문에 문자열 데이터가 같은지 비교할 때 사용한다.
		
		
		
	}
}
