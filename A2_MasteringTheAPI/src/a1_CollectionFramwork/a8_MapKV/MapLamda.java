package a1_CollectionFramwork.a8_MapKV;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapLamda {

	public static void main(String[] args) {

		Map<Integer, String> numMap = new HashMap<>();
		numMap.put(1, "one");
		numMap.put(1, "oooneee");
		numMap.putIfAbsent(1, "ooooooooooneeeeeeeeee");
		numMap.put(2, "two");
		numMap.put(3, "three");

		numMap.forEach((k, v) -> System.out.println(k + "=" + v));

		numMap.replaceAll((k, v) -> v.toUpperCase());
		numMap.forEach((k, v) -> System.out.println("Uppercase: " + k + "=" + v));

		// compute()

		List<String> strings = List.of("one", "two", "three", "four", "five", "six", "seven");
		Map<Integer, List<String>> map = new HashMap<>();// word length by key

		// Impreative way

		for (String word : strings) {
			int length = word.length();
			if (!map.containsKey(length)) {
				map.put(length, new ArrayList<>());
			}
			map.get(length).add(word);
		}

		map.forEach((key, value) -> System.out.println(key + " :: " + value));

		// more effective fuctional way
		for (String word : strings) {
			map.putIfAbsent(word.length(), new ArrayList<>());

			if (!map.get(word.length()).contains(word)) {
				map.get(word.length()).add(word);
			}
		}
		map.forEach((k, v) -> System.out.println(k + "= " + v));

		// computeIfAbsent()
		for (String word : strings) {
			map.computeIfAbsent(word.length(), key -> new ArrayList<>()).add(word);// .add() is not real use case

		}
		map.forEach((k, v) -> System.err.println(k + "= " + v));

		// computeIfPresent()
		for (String word : strings) {
			map.computeIfPresent(word.length(), (k, v) -> v.reversed());
		}
		map.forEach((k, v) -> System.out.println(k + "= " + v));

		// compute()
		Map<String, String> mp = new HashMap<>();
		for (@SuppressWarnings("unused")
		String word : strings) {
			mp.compute("xyz", (k, v) -> "abc");
		}
		mp.forEach((k, v) -> System.err.println(k + "= " + v));

		// refer MapMerger class for final answer
	}
}
