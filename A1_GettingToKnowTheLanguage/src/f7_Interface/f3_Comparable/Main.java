package f7_Interface.f3_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(5);
		MyClass obj2 = new MyClass(3);
		MyClass obj3 = new MyClass(10);

		System.out.println(obj1.compareTo(obj2)); // Output: -1

		List<MyClass> classes = new ArrayList<>();

		// classes=List.of(obj1,obj2,obj3); is immutable so Collections will not work
		// ArrayList<MyClass> classes2=new ArrayList<>(classes); this this will be
		// way!!!!!!!!!!!!

		classes.add(obj1);
		classes.add(obj2);
		classes.add(obj3);

		classes.stream().sorted().forEach(obj -> System.err.println(obj));

		classes.stream().forEach(obj -> System.out.println(obj));

		try {
			Collections.sort(classes);
		} catch (IllegalArgumentException e) {
			System.err.println("Sorting failed: " + e.getMessage());
		}

		System.err.println("After Sorting");
		classes.stream().forEach(obj -> System.out.println(obj));

	}

}
