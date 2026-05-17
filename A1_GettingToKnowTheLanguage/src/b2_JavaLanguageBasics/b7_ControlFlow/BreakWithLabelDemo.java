package b2_JavaLanguageBasics.b7_ControlFlow;

// this feature since jdk1.0  !!
class BreakWithLabelDemo {
	public static void main(String[] args) {

		// 2D array
		int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 77, 955 } };
		int searchfor = 12;

		int i;
		int j = 0;
		boolean foundIt = false;

		search: for (i = 0; i < arrayOfInts.length; i++) {

			for (j = 0; j < arrayOfInts[i].length; j++) {

				if (arrayOfInts[i][j] == searchfor) {
					foundIt = true;
					break search; // multiple break not needed for multiple for break. normal break will only stop
									// inner for but label break stop all for iterations.
				}
			}
		}

		if (foundIt) {
			System.out.println("Found " + searchfor + " at " + i + ", " + j);
		} else {
			System.out.println(searchfor + " not in the array");
		}
	}
}
