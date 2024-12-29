package a1_CollectionFramwork;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class A2_IteratingCollections {

	public static void main(String[] args) {

		Collection<String> strings = List.of("one", "two", "three");

		for (String element : strings) {
			System.out.println(element);
		}

		for (Iterator<String> iterator = strings.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();

			System.err.println(string);
		}

		// Iterable is top level Interface & Iterator is different
		Iterator<String> iterator = strings.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();

			System.out.println(string);
		}
	}
}
