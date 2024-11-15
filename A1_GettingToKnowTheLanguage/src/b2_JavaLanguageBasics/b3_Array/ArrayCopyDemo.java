package b2_JavaLanguageBasics.b3_Array;

import java.util.Arrays;

class ArrayCopyDemo {
	public static void main(String[] args) {
		
		//size is 13
		String[] copyFrom = { "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso",
				"Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto" };

		//size 7
		String[] copyTo = new String[7];

		System.arraycopy(copyFrom, 2, copyTo, 0, 7);

		for (String coffee : copyTo) {
			System.out.print(coffee + " ");
		}
		

		Arrays.stream(copyTo)
				.map(coffee -> coffee + " ")
				.forEach(System.out::print);

	}
}
