package a1_CollectionFramwork.a8_MapKV;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>(); // MUTABLE
		map.put("MH", "Mumbai");
		map.put("KA", "Banglore");
		map.put("MP", "Bhopal");

		System.out.println("map: " + map);
		System.out.println(map.get("MH"));

		Map<String, String> map1 = new HashMap<>(map);// MUTABLE
		map1.remove("MP");

		// --------IMMUTABLE MAP

		// Map.of() only support max 10 entries!!!!!
		Map<Integer, String> map2 = Map.of(1, "one", 2, "two", 3, "three", 4, "four");// of() immutable

		try {
			map2.put(5, "five");
		} catch (UnsupportedOperationException e) {
			System.out.println("Can't modify immutable map: " + e);
		}

		Map.Entry<Integer, String> n5 = Map.entry(5, "five");
		Map.Entry<Integer, String> n6 = Map.entry(6, "six");
		Map.Entry<Integer, String> nN = Map.entry(0, "n");
		Map<Integer, String> map3 = Map.ofEntries(n5, n6, nN); // IMMUTABLE
		System.out.println("newMap: " + map3);

		Map<String, String> map4 = Map.ofEntries(Map.entry("Deepak", "Manali"), Map.entry("Dipak", "Manu"));// IMMUTBLE
		System.out.println(map4);

		// -------MAP READINGS
		for (Entry<Integer, String> entry : map2.entrySet()) {
			int key = entry.getKey();
			String val = entry.getValue();

			System.out.println(key + "=" + val);
		}

		for (Integer num : map2.keySet()) {
			System.out.println("keys: " + num);
		}
		for (String numInString : map2.values()) {
			System.out.println("values: " + numInString);
		}

		System.out.println("5: " + map2.get(5));
		System.out.println("5000: " + map2.getOrDefault(5000, "UNDEFINED NUMBER"));

		// reading using stream
		List<String> values = IntStream.range(0, 10).mapToObj(key -> map2.getOrDefault(key, "NOT_FOUND"))
				.collect(Collectors.toList());

		values.forEach(System.err::println);

		System.out.println("3 is contains as key: " + map2.containsKey(3));
		System.out.println("3333 is contains as key: " + map2.containsKey(3333));

		map.remove("KA");
		System.out.println("After key=KA removed: " + map);

	}
}
