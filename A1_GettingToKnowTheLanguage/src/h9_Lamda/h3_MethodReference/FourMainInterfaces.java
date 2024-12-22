package h9_Lamda.h3_MethodReference;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FourMainInterfaces {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// 1.
		Consumer<String> AcceptConsume = (String s) -> System.out.println(s);
		Consumer<String> AcceptConsume_v2 = System.out::println;

		AcceptConsume.accept("Hello Deepak");

		// 2.
		Supplier<String> getSupplier = () -> "Manali";

		String string1 = getSupplier.get();
		System.out.println(string1);

		// 3.
		Function<String, String> applyFunction = (String s) -> s.toLowerCase();
		Function<String, String> applyFunction_v2 = String::toLowerCase;

		String string2 = applyFunction.apply("MANALI AND DEEPAK");
		System.out.println(string2);

		// 4.
		Predicate<String> TestPredicate = (String s) -> s.length() == 3;

		boolean b = TestPredicate.test("Dee");
		System.out.println(b);

		// some versions.
		System.err.println("------");

		BiConsumer<String, String> biAcceptBiConsumer = (s1, s2) -> System.out.println(s1 + " " + s2);
		biAcceptBiConsumer.accept("Manali", "Deepak");
		
		BiFunction<String, String, Integer> biApplyBiFunction = (s1, s2) -> s1.length() + s2.length();
		Integer bothLength=  biApplyBiFunction.apply("Manali", "Deepak");
		System.out.println(bothLength);
		
		BiPredicate<String, Integer> biTestPredicate= (s1,n1)->s1.length()==n1;
		boolean lengthMatch=  biTestPredicate.test("Manali", "Deepak".length());
		System.out.println(lengthMatch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
