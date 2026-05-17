package c3_ClassesAndObjects;

interface AnyInterface {
	void hell();

	void two();
}

public class LamdaExample implements AnyInterface {

	@Override
	public void hell() {
		System.out.println("Hello");
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		LamdaExample lamdaExample = new LamdaExample() { // Lambda means self delcarative method.

			@Override
			public void hell() {
				System.out.println("Byee");
			}

			@Override
			public void two() {
				System.out.println("Two");
			}
		};

		lamdaExample.hell();
		lamdaExample.two();

		// Without any class
		AnyInterface directLambda = new AnyInterface() {

			@Override
			public void two() {
				System.err.println("Two");

			}

			@Override
			public void hell() {
				System.err.println("Hello");
			}
		};
		directLambda.two();
		directLambda.hell();

	}

}
