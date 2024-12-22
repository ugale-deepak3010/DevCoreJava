package h9_Lamda.h4_Chaining;

import java.util.function.Predicate;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// some way to implement

		Predicate<String> p2 = s -> (s != null) && !s.isEmpty() && s.length() < 5;
		// or
		Predicate<String> nonNull = s -> s != null;
		Predicate<String> nonEmpty = s -> !s.isEmpty();
		Predicate<String> shorterThan5 = s -> s.length() < 5;

		Predicate<String> p = nonNull.and(nonEmpty).and(shorterThan5);
	}

}
