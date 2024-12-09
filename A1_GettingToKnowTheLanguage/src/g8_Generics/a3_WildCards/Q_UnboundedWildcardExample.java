package g8_Generics.a3_WildCards;

import java.util.Arrays;
import java.util.List;

public class Q_UnboundedWildcardExample {

	public static void printList(List<?> list) {

		for (Object element : list) {
			System.out.println(element);
		}

	}

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3);
		List<String> strList = Arrays.asList("a", "b", "c");

		// Pass any type of list
		printList(intList); // Works with List<Integer>
		printList(strList); // Works with List<String>
	}
}
