package g8_Generics.a3_WildCards;

import java.util.Arrays;
import java.util.List;

public class Q_UnboundedWildcardExample {

	// Wildcard Generic or Unbounded Wildcard
	public static void printList(List<?> list) {

		 //list.add(10); //NOT ALLOWED | compiletime error

		for (Object element : list) {
			System.out.println(element);
		}

	}

	// Generic with RawType // T means RawType
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T extends List> void printList2(T list) {

		try {
			list.add(10); // Allwed but dangeruous | runtime error | compiletime warning only
		} catch (Exception e) {
			System.out.println(e);
			System.err.println("* Wrong practices Generic RawType ");
		}

		for (Object element : list) {
			System.err.println(element);
		}

	}

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 2, 3);
		List<String> strList = Arrays.asList("a", "b", "c");

		// Pass any type of list
		printList(intList); // Works with List<Integer>
		printList(strList); // Works with List<String>

		printList2(intList);
		printList2(strList);

	}

}
