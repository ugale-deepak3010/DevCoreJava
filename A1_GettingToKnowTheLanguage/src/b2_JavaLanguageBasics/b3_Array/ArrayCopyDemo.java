package b2_JavaLanguageBasics.b3_Array;

import java.util.Arrays;

class ArrayCopyDemo {
	public static void main(String[] args) {

		// size is 13
		String[] copyFrom = { "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso",
				"Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto" };

		// size 7
		String[] copyTo = new String[7];

		System.arraycopy(copyFrom, 2, copyTo, 0, 7); // System class!

		for (String coffee : copyTo) {
			System.out.print(coffee + " ");
		}

		System.out.println("\n");

		Arrays.stream(copyTo) // Arrays class!
				.map(coffee -> coffee + " ") // string stream
				.forEach(System.out::print); // string result

		System.out.println("\n");

		Arrays.asList(copyTo).forEach(System.err::println);

	}
}
