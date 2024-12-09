package g8_Generics.a3_WildCards;

import java.util.Arrays;
import java.util.List;

public class Extends_UpperBoundedWildcardExample {
	
	public static void printNumbers(List<? extends Number> list) {
		for (Number num : list) {
			System.out.println(num);
		}
	}

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3);
		List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
		List<Float> floatList = Arrays.asList(1.1f, 2.2f, 3.3f);

		// Works with any type that extends Number
		printNumbers(intList); // List<Integer>
		printNumbers(doubleList); // List<Double>
		printNumbers(floatList); // List<Float>
	}
}
