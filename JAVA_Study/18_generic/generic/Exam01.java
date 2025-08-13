package generic;

class Box{ // 비제네릭 클래스
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

class Apple{
	
}

public class Exam01 {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("김희선");//String => Object 자동 형변환
		String name = (String) box.getObject(); //box.getObject()큰거를 작은거에 담을라해서 빨간색이 나옴 그래서 강제 형변환 해줘야함 Object => String 타입으로 강제 형변환
		System.out.println("이 상자는"+name+"의 것이다.");
		
		box.setObject(new Apple());
		Apple apple = (Apple) box.getObject(); // 자동으로 옵젝을 상속받음 근데 작은통에 큰거 넣을라면 크기에 맞게 해야되니까 형변환 시킴
		
		
		
	}
}
//Object 타입을 사용하면 모든 종류의 자바 객체를 저장할 수 있다는 장점은 있지만, 
//전체 프로그램 성능에는 좋지 않은 결과를 가져오므로 제네릭이라는 해결책을 생각하게 되었다.
