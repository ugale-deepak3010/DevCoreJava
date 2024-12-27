package k12_Exceptions.k3_Throws_Throw_Error;

public class Error_Class {

	public static void myMethod() {
		throw new Error("Meri marzi mai kuchh bhi karu...!");
	}

	public static void main(String[] args) {

		try {

			myMethod();
			System.out.println("naaah!");
		} catch (Exception e) {
			System.out.println("Somethign went wrong: "+e);
		}

	}

}
