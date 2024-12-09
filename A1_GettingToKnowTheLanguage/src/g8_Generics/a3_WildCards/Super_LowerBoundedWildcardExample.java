package g8_Generics.a3_WildCards;

import java.util.ArrayList;
import java.util.List;

public class Super_LowerBoundedWildcardExample {
	
	// Integer's super class in Iteger->Number->Object
	public static void addNumbers(List<? super Integer> list) {
		list.add(1); // Valid: Integer is a valid type here
		list.add(2); // Valid
	}

	public static void main(String[] args) {
		List<Number> numberList = new ArrayList<>();
		List<Object> objectList = new ArrayList<>();

		// Works with any type that is a supertype of Integer
		addNumbers(numberList); // List<Number>
		addNumbers(objectList); // List<Object>

		System.out.println(numberList); // [1, 2]
		System.out.println(objectList); // [1, 2]
	}
}
