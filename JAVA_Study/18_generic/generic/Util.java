package generic;

// 제네릭 메소드는 매개타입과 리턴타입으로 타입 파라미터를 갖는 메소드 이다.
//=> public <T> Present <T> presenting(T t){...}
//리턴 타입 앞에 <>기호를 추가후 그 안에 타입 파라미터를 넣고, 리턴 타입과 매개 타입으로도 타입 파라미터를 사용하면 된다.
public class Util {
	public static <T> Present<T> presnting(T t){
		Present<T> present = new Present<T>();
		present.setValue(t);
		return present;
	}
	public static <K,V> boolean compare(Pair<K, V>p1,Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		
		
		return keyCompare && valueCompare;
	}

}
