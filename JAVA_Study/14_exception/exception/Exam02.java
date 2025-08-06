package exception;

public class Exam02 {
	//일반예외
	public static void main(String[] args) throws ClassNotFoundException{ //1
		try { //두가지 방법 2
			Class.forName("java.lang.String"); // 그 클래스가 없을수도 있으니까 무조건 예외처리해야됨
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
