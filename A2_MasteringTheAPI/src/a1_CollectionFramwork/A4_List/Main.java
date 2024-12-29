package a1_CollectionFramwork.A4_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Main {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>(List.of("0", "1", "2", "3", "4", "5"));

		System.out.println(strings);

		strings.subList(2, 5).clear();

		System.out.println(strings);

		strings.sort(Comparator.naturalOrder());
		strings.sort(Comparator.reverseOrder());
		strings.sort(null);// classNotFoundException

		// iterating -ListIterator

		for (Iterator<String> iterator = strings.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();

			if (string.equals("2")) {
				System.out.println(string);
				// iterator.set("2"); //don't have set()
			}
		}

		List<String> numbers = Arrays.asList("one", "two", "three");
		for (ListIterator<String> iterator = numbers.listIterator(); iterator.hasNext();) {
			String nextElement = iterator.next();
			if (Objects.equals(nextElement, "two")) {
				iterator.set("2");// [one, 2, three]
			}
		}
		System.out.println("numbers = " + numbers);

		// Q. Set Order list based on length

		// way 1
		Comparator<String> stringComparator = (a, b) -> {
			if (a.length() < b.length()) {
				return -1;
			} else if (a.length() == b.length()) {
				return 0;
			} else {
				return +1;
			}
		};

		numbers.sort(stringComparator);

		// way 2

		numbers.sort(Comparator.comparingInt(String::length));

		// way 3-without method reference
		numbers.sort((a, b) -> Integer.compare(a.length(), b.length()));

		System.err.println(numbers);

	}
}
