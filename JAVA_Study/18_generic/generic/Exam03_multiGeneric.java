package generic;

//제네릭 타입은 두 개 이상의 멀티 타입 파라미터를 사용할 수 있다.
class Product<T,M>{
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

	
}
class Tv{
	
}
class Car{
	
}
public class Exam03_multiGeneric {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();// 원래 써야하지만 <Tv, String> 이미 있기떄문에 스킵
		product1.setKind(new Tv());
		product1.setModel("스마트 티비");
		String tvModel = product1.getModel();
		Tv tv = product1.getKind();
		System.out.println(tv+":"+tvModel);
		
		Product<Car, String> product2 = new Product<>();// 원래 써야하지만 <Tv, String> 이미 있기떄문에 스킵
		product2.setKind(new Car());
		product2.setModel("디젤");
		String carModel = product2.getModel();
		Car car = product2.getKind();
		System.out.println(car+":"+carModel);
	}
}
