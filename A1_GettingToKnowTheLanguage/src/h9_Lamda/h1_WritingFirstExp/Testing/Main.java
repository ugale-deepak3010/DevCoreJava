package h9_Lamda.h1_WritingFirstExp.Testing;

import java.util.function.Predicate;

@FunctionalInterface
interface Predicate2<T> {

	boolean test(T t);

	default Predicate<T> and(Predicate<? super T> other) {
		return null;
		// the body of this method has been removed
	}

	default Predicate<T> negate() {
		return null;
		// the body of this method has been removed
	}

	default Predicate<T> or(Predicate<? super T> other) {
		return null;
		// the body of this method has been removed
	}

	static <T> Predicate<T> isEqual(Object targetRef) {
		return null;
		// the body of this method has been removed
	}

	static <T> Predicate<T> not(Predicate<? super T> target) {
		return null;
		// the body of this method has been removed
	}
}

public class Main {

	public static void main(String[] args) {

		Predicate<String> predicate = (String s) -> {
			return s.length() == 3;
		};

		System.out.println(predicate.test("123"));

//---------------------------------------------------------------

		Predicate2<String> predicate2 = (String s) -> {
			return s.length() == 3;
		};
		System.out.println(predicate2.test("123"));

//---------------------------- without lamda expression --------------------------------------------

		@SuppressWarnings({ "unchecked", "rawtypes" })
		Predicate2<String> predicate3 = new Predicate2() {

			@Override
			public boolean test(Object t) {
				if (t instanceof String) {
					String s = t.toString();
					return s.length() == 3;
				}
				return false;
			}
		};

		System.out.println(predicate3.test("123"));

	}
}
