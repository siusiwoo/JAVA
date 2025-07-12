package classes;
// 생성자 함수보다 먼저 실행되는거
class Block{
		Block(){
			System.out.println("생성자 호출");
		}
		//NAN STATIC 블럭
		{
			System.out.println("nan-static 블럭");
		}
}
public class Exam06 {
	public static void main(String[] args) {
		Block block = new Block();
		Block block2 = new Block();
	}
}
