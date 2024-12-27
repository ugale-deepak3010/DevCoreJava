package l13_RefactoringFromImperativeToFunctionalStyle.l3_ForeachWithIf;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		IntStream.iterate(0, i -> i < 5, i -> i++).filter(i -> i % 2 == 0).forEach(System.out::println);

	}
}
