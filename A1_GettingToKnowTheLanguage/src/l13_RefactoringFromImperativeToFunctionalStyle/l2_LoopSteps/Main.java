package l13_RefactoringFromImperativeToFunctionalStyle.l2_LoopSteps;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 15; i = i + 3) {
			System.err.println(i);
		}

		IntStream.iterate(0, i -> i < 15, i -> i = i + 3).forEach(System.err::println);

		// ;;unbounded iteration with break
		for (int i = 0;; i = i + 3) {
			if (i > 10) {
				break;
			}
			System.out.println(i);
		}

		IntStream.iterate(0, i -> i < 15, i -> i = i + 3).takeWhile(i -> i < 10).forEach(System.out::println);

		System.err.println("Finished");

	}

}
