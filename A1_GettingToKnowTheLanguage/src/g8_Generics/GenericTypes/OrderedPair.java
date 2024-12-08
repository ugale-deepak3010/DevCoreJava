package g8_Generics.GenericTypes;

interface Pair<K, V> {

	public K getKey();

	public V getValue();
}

@SuppressWarnings("unused")
public class OrderedPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public static void main(String[] args) {
		OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		OrderedPair<String, String> p2 = new OrderedPair<>("hello", "world");

		//
		OrderedPair<String, GenericBox<Integer>> p = new OrderedPair<>("primes", new GenericBox<Integer>(5));

	}

}
