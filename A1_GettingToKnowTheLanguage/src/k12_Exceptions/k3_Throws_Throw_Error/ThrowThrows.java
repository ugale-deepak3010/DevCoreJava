package k12_Exceptions.k3_Throws_Throw_Error;

public class ThrowThrows {

	public void myMethod() {
		int x = 3 / 0;

		System.out.println(x);
	}

	public void myMethod_v2() throws ArithmeticException {
		int[] x = { 1, 2 };

		System.out.println(x[5]);
	}

	public void myMethod_3() {
		throw new ArithmeticException();
	}

	public static void main(String[] args) {

		ThrowThrows obj = new ThrowThrows();

		// obj.myMethod();
		// obj.myMethod_v2();

		obj.myMethod_3();

	}

}
