package a1_CollectionFramwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.function.Predicate;

public class A1_CollectionInterface {

	public static void main(String[] args) {

		// view all metods
		Collection<String> strings = new ArrayList<>();

		strings.add("one");
		strings.add("two");

		if (strings.contains("one")) {
			System.out.println("one is present");
		}

		if (!strings.contains("three")) {
			System.out.println("three is not present");
		}
		strings.add("three");

		Object object = new Object();

		if (strings.contains(object)) {
			System.out.println("Object is present");
		} else {
			System.out.println("Object is not present");
		}

		// ----------------------

		Collection<String> first = new ArrayList<>();
		first.add("one");
		first.add("two");

		Collection<String> second = new ArrayList<>();
		second.add("one");
		second.add("four");

		System.err.println("Is first contained in strings? " + strings.containsAll(first));
		System.out.println("Is second contained in strings? " + strings.containsAll(second));

		// ---------------

		String[] tabString1 = strings.toArray(new String[] {}); // you can pass an empty array
		String[] tabString2 = strings.toArray(new String[15]); // or an array of the right size

		for (String string : tabString1) {
			System.err.println(string);
		}

		for (String string : tabString2) {
			System.out.println(string);
		}

		Predicate<String> isNull = Objects::isNull;
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNullOrEmpty = isNull.or(isEmpty);

		strings.add(null);
		strings.add("");

		System.out.println("strings = " + strings);
		strings.removeIf(isNullOrEmpty);
		System.out.println("filtered strings = " + strings);

	}

}
