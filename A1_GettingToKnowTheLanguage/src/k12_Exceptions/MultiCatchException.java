package k12_Exceptions;

public class MultiCatchException {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 0 };

		int dev;
		try {

			for (int i = 0; i < num.length + 9; i++) {
				System.out.println(num[i]);

				dev = i / num[i];
				System.out.println(dev);
			}
			// old way
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bound: " + e);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: " + e);
		}

		try {

			for (int i = 0; i < num.length + 9; i++) {
				System.out.println(num[i]);

				dev = i / num[i];
				System.out.println(dev);
			}
			// new way
		} catch (IndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Faild! Reason: " + e);

//			if (e instanceof IndexOutOfBoundsException) {
//				System.out.println("* Index Out Of Bound: " + e);
//			} else if (e instanceof ArithmeticException) {
//				System.out.println("* Arithmetic Exception: " + e);
//			}
		}

	}
}
