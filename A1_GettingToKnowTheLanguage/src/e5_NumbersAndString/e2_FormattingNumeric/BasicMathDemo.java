package e5_NumbersAndString.e2_FormattingNumeric;

public class BasicMathDemo {
	public static void main(String[] args) {
		double a = -191.635;
		double b = 43.74;
		int c = 16, d = 45;

		// in printf() coming from C programming.
		// % refer formatting
		// %.3 refer any number but like 9123.4567 -> 9123.456 (Last 3 decimal points)
		// %.2f refer floating/double 1234.56789 -> 1234.56
		// %d refer integeres
		// %n is alternative but plat independent \n

		System.out.printf("The absolute value " + "of %.3f is %.3f%n", a, Math.abs(a));

		System.out.printf("The ceiling of " + "%.2f is %.0f%n", b, Math.ceil(b));

		System.out.printf("The floor of " + "%.2f is %.0f%n", b, Math.floor(b));

		System.out.printf("The rint of %.2f " + "is %.0f%n", 9.49, Math.rint(9.49));
		System.out.printf("The rint of %.2f " + "is %.0f%n", 9.51, Math.rint(9.51));

		System.out.printf("The max of %d and " + "%d is %d%n", c, d, Math.max(c, d));

		System.out.printf("The min of of %d " + "and %d is %d%n", c, d, Math.min(c, d));

	}
}
