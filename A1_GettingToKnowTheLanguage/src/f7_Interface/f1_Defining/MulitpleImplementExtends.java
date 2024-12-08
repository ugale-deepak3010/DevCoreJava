package f7_Interface.f1_Defining;

// interface are not implement another interface it's extend!!!!!!!!!!!!!!!
// also can't extends abstract class!
public interface MulitpleImplementExtends extends Interface2, Interface3 // , AbstractClass
{
	enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNSDAY
	}

	// int simpleInt; // blank variable not allowed.

	public int simpleInt1 = 1;
	int simpleInt = 45;
	final int pie = 3;
	static int simple_Int = 33;

	// private int a2=1; //private not allowed
	// protected int simpleX=8; //protected also not allowed

	// default int normalInt=45; // no access modifier!!!
	// abstract int abc; //not allowed

	int add(int num1, int num2);

	abstract int add(long num1, long num2);
	// strictfp int add(float num1, float num2); //StrictFloatingPoint for
	// calculations results.
	/*
	 *
	 * After Java 17 strictfp will work by default it's not required Can be applied
	 * to: Classes Interfaces Methods
	 * 
	 * Cannot be used with: Variables Constructors Abstract methods
	 */

	// final int add(int num1, long num2) // final not allowed!!!!!!!!!!

	default void hi() {// optional to implement
		System.out.println("I have body");
	}

	// can't implement it in class
	static void hello() {
		System.out.println("hello");
	}

	// when we redeclare default method in interface so it become abstract!!!!
	@Override
	public void helloDefault_Interface2();

}
