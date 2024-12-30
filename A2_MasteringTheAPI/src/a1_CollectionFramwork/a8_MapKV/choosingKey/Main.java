package a1_CollectionFramwork.a8_MapKV.choosingKey;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//
//!!!!! This an example of an antipattern !!!!!!
//!!! do not do this in your production code !!!
//
class Key {
	private String key;

	public Key(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return key;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Key key = (Key) o;
		return Objects.equals(this.key, key.key);
	}

	@Override
	public int hashCode() {
		return key.hashCode();
	}
}

public class Main {

	public static void main(String[] args) {

		Key one = new Key("1");
		Key two = new Key("2");

		Map<Key, String> map = new HashMap<>();
		map.put(one, "one");
		map.put(two, "two");

		System.out.println("map.get(one) = " + map.get(one));
		System.out.println("map.get(two) = " + map.get(two));

		// all good upto this case.

		one.setKey("5");

		System.err.println("map.get(one) = " + map.get(one));
		System.err.println("map.get(new Key(1)) = " + map.get(new Key("1")));

		System.err.println("map.get(two) = " + map.get(two));
		System.err.println("map.get(new Key(2)) = " + map.get(new Key("2")));
		System.err.println("map.get(new Key(5)) = " + map.get(new Key("5")));
		
		//----------------------------------------------------------------------------
		
	
		

	}
}
