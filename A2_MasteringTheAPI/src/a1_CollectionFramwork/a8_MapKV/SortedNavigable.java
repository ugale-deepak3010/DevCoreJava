package a1_CollectionFramwork.a8_MapKV;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedNavigable {

	public static void main(String[] args) {

		SortedMap<Integer, String> sortedMap = new TreeMap<>();

		sortedMap.put(6, "six");
		sortedMap.put(5, "five");
		sortedMap.put(1, "one");
		sortedMap.put(2, "two");
		sortedMap.put(3, "three");
		sortedMap.put(4, "four");

		System.out.println("sortedMap: " + sortedMap);

		// headmap
		SortedMap<Integer, String> headMap = sortedMap.headMap(3);// upto 2
		System.out.println("headMap: " + headMap);

		headMap.put(0, "zero");
		headMap.put(-1, "minus_one");
		headMap.put(-2, "minus_two");

		try {
			headMap.put(3, "three");
		} catch (IllegalArgumentException e) {
			System.out.println("Can't put(3) next value in headMap: " + e);
		}

		System.out.println("headMap: " + headMap);

		// tailMap
		SortedMap<Integer, String> tailMap = sortedMap.tailMap(3);//from 3
		System.out.println("tailMap: " + tailMap);
		tailMap.put(7, "seven");
		try {
			tailMap.put(2, "two");
		} catch (IllegalArgumentException e) {
			System.out.println("Can't put(2) previous value in tailMap: " + e);
		}
		
		//sortedSubMap
		
		SortedMap<Integer, String> sortedSubMap= sortedMap.subMap(3, 5);//3,4
		System.out.println("sumap: "+sortedSubMap);
		try {
			sortedSubMap.put(2, "two");
		} catch (IllegalArgumentException e) {
			System.out.println("Can't put(2) previous value in sortedSubMap: " + e);
		}
		try {
			sortedSubMap.put(8, "eight");
		} catch (IllegalArgumentException e) {
			System.out.println("Can't put(8) next value in sortedSubMap: " + e);
		}

		// reverse Map
		SortedMap<Integer, String> anotherRevMap = sortedMap.reversed();
		System.out.println(anotherRevMap);
		
		//	NAVIGABLE MAP
		
		NavigableMap<Integer, String> map = new TreeMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");

		map.keySet().forEach(key -> System.out.print(key + " "));
		System.out.println();

		NavigableSet<Integer> descendingKeys = map.descendingKeySet();
		descendingKeys.forEach(key -> System.out.print(key + " "));


		
	}

}
