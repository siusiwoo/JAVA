package method;

public class Exam02 {
	//정사각형 넓이를 구하는 메소드
	double areaRectangle(double width) {
		return width*width;
	}
	//직사각형 넓이를 구하는 메소드 => 메소드의 오버로딩:매개변수의 갯수나 타입이 다르면 같은 이름의 메소드를 여러개 생성 가능하다!!
	//메소드 이름을 똑같이해도 됨 매개변수가 다르면 쓸수있음 1 또는 ~개 이 갯수가 다르면 가능함
		double areaRectangle(double width,double hight) {
			return width*hight;
		}
}
