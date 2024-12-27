package l13_RefactoringFromImperativeToFunctionalStyle.l1_SimpleLoops;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		// Imperative
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// Functional
		IntStream.range(0, 5).forEach(i -> System.out.println(i));
		IntStream.range(0, 5).forEach(System.out::println); // Method Reference

		// Include ending value	'<='

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

		IntStream.rangeClosed(0, 5).forEach(System.out::println);

	}

}
