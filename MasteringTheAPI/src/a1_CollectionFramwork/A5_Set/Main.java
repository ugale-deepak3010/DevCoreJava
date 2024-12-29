package a1_CollectionFramwork.A5_Set;

import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		// list to set
		List<String> strings = List.of("one", "one", "two", "three", "four", "five", "six");
		Set<String> set = new HashSet<>();
		set.addAll(strings);
		set.forEach(System.out::println);

		Set<String> unOrderSet = new HashSet<>();// HashSet is distinct but unOrder.
		unOrderSet.add("one");
		unOrderSet.add("one");
		unOrderSet.add("two");
		unOrderSet.add("three");
		unOrderSet.add("four");
		unOrderSet.add("five");
		unOrderSet.add("six");
		unOrderSet.forEach(System.out::println);

		Set<String> orderSet = new TreeSet<>();// TreeSet is distinct & ordered.
		orderSet.add("one");
		orderSet.add("one");
		orderSet.add("two");
		orderSet.add("three");
		orderSet.add("four");
		orderSet.add("five");
		orderSet.add("six");
		orderSet.forEach(System.err::println);

		// Extending Set with SortedSet

		SortedSet<String> strings2 = new TreeSet<>(Set.of("a", "b", "c", "d", "e", "f"));
		SortedSet<String> subSetFromAtoD = strings2.subSet("aa", "d");// [b,c] //TreeSet or HashSet not provide
		System.out.println("sub set = " + subSetFromAtoD);

		// Extending SortedSet with NavigableSet
		NavigableSet<String> sortedStrings = new TreeSet<>(Set.of("a", "b", "c", "d", "e", "f"));
		System.out.println("sorted strings = " + sortedStrings);
		NavigableSet<String> reversedStrings = sortedStrings.descendingSet();
		System.out.println("reversed strings = " + reversedStrings);

	}
}
