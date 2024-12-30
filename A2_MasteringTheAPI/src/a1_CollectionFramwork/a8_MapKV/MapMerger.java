package a1_CollectionFramwork.a8_MapKV;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMerger {

	public static void main(String[] args) {

		List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven");
		Map<Integer, String> map = new HashMap<>();

		for (String word : strings) {
			map.merge(word.length(), word, (k, v) -> k + ", " + v);
		}

		map.forEach((key, value) -> System.out.println(key + " :: " + value));

	}
}
