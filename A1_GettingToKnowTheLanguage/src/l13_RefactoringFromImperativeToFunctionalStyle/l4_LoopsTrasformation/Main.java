package l13_RefactoringFromImperativeToFunctionalStyle.l4_LoopsTrasformation;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> names = List.of("Jack", "Paula", "Kate", "Peter");

		for (String name : names) {
			System.out.println(name.toUpperCase());
		}

		names.stream().map(String::toLowerCase).forEach(System.err::println);

	}

}
