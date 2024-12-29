package a1_CollectionFramwork.A6_ProcessingFactoryMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// Immutable collections
		// asList, of, copyOf

		Collection<String> collection = Arrays.asList("one", "two", "three");

		List<String> list = List.of("one", "two", "three");
		Set<String> set = Set.of("one", "two", "three");

		List<String> list2 = List.copyOf(list);
		Set<String> set2 = Set.copyOf(set);

		try {
			collection.add("four");

			list.add("four");
			set.add("four");

			list2.add("four");
			set2.add("four");
		} catch (UnsupportedOperationException e) {
			System.out.println("None of operation supported " + e);
		}

		List<String> mutableCollection = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4"));
		mutableCollection.add("5");
		System.out.println("5 is added: " + mutableCollection);

		// ------------------------------------------------------------

		// changing the order
		// sort(), shuffle(), rotate(), reverse(), swap()

		List<String> strings = Arrays.asList("0", "1", "2", "3", "4");

		int fromIndex = 1, toIndex = 4;
		Collections.rotate(strings.subList(fromIndex, toIndex), -1);// automatically replaced withnout assign

		System.err.println("rotate is performed: " + strings);

		// ---------------------------------------------------------------

		// unmodifiable or synchronized | Wrapping a Collection in an Immutable
		// Collection

		List<String> orginalList = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4"));
		List<String> anotherList = Collections.unmodifiableList(orginalList);
		// anotherList.add("5");//unsupported_operation

		System.out.println("Copied anotherList: " + anotherList);

		orginalList.add("5");

		System.out.println("After anotherList: " + anotherList);

	}

}
