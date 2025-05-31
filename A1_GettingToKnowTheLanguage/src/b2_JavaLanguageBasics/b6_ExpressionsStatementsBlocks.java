package b2_JavaLanguageBasics;

import a1_ObjectsClassesInterfacesPackagesInheritance.Bicycle;

@SuppressWarnings("unused")
public class b6_ExpressionsStatementsBlocks {

	public static void main(String[] args) {
		int cadence = 0;

		int[] anArray = new int[1];
		anArray[0] = 100;
		System.out.println("Element 1 at index 0: " + anArray[0]);

		int result = 1 + 2; // result is now 3

		int value1 = 1, value2 = 1;
		if (value1 == value2)
			System.out.println("value1 == value2");

// Exceptional
		double d1 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1; // 1.0 but result 0.999999...
		System.err.println("d1= " + d1);
		System.out.println("d1 == 1 ? " + (d1 == 1.0)); // hence false!

		int z = 5 + 2 / 100; // ambiguous

		int x = 5 + (2 / 100); // unambiguous, recommended

		double aValue;
		aValue = 8933.234;// assignment statement

		// declaration statement
		double abValue = 8933.234;

		// increment statement
		aValue++;

		// method invocation statement
		System.out.println("Hello World!");

		// object creation statement
		Bicycle myBike = new Bicycle();

		boolean condition = true;
		if (condition) { // begin block 1
			System.out.println("Condition is true.");
		} // end block one
		else { // begin block 2
			System.out.println("Condition is false.");
		} // end block 2

		if (condition)
			System.out.println("single line condition");

	}

}
