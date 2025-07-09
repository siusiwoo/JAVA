package method;

public class Exam01 {
	//1)매개변수와 반환값이 모두 없는 메소드
	public static void show() {
		System.out.println("나는 show() 메소드이다.");
	}
	//2)매개변수는 있고 반환값은 없는 메소드
	public static void findpower(int x,int y) { // y 만큼 반복
		int result = 1;
		for(int a=1; a<=y; a++) {
			result *= x; // result * x를 y만큼
		}
		System.out.println(x+"의 "+y+"제곱은 "+result);
	}
	//3)매개변수는 없고 반환값은 있는 메소드
	public static int doSomething() {
		int result;
		result = 10 * 10;
		//double num = 3.14; 에러 뜸 자료형이 맞지 않기떄문에
		return result;
	}
	//4) 매개변수와 반환값이 모두 있는 메소드
	public static double add(int x,int y) {
		int result = x+y;
		return result;
	}
	//5)매개변수의 개수를 알 수 없는 경우->매개변수를 배열 타입으로 선언
	public static int sum1(int[] values) {
		int sum = 0;
		for(int i =0; i<values.length;i++) {
			sum = sum + values[i];
		}
		return sum;
	}
	//6) 매개변수를 ...을 이용해서 값의 목록을 넘겨주는 방법
	public static int sum2(int...values) {
		int sum = 0;
		for(int i =0; i<values.length;i++) {
			sum = sum + values[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		//메소드의 시그니처 : (접근제어자) (static의 유무) 리턴타입 메소드 이름(){
		//실행할 구문
		//}
		//=>static을 사용하면 클래스의 객체를 생성하지 않고도 다른 클래스 에서 해당 클래스의 메소드를 사용할수 있다!
		show(); 
		findpower(2,3);
		findpower(3,4);//1
		doSomething();//2
		int num = doSomething();
		System.out.println(num);
		System.out.println(doSomething());//3
		System.out.println(add(3,10));//4
		int[] values1 = {1,2,3,4}; // 배열에 넣고 5
		System.out.println(sum1(values1)); // 선언으로 출력
		System.out.println(sum2(5,10,15,30));//위에걸 거치지 않고 바로 사용할때
		
	}
}
