package generic;

public class Pair<K,V> {
	private K key;
	private V Value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return Value;
	}
	public void setValue(V value) {
		Value = value;
	}

}
