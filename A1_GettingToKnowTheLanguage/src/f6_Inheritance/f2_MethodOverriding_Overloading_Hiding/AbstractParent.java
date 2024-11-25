package f6_Inheritance.f2_MethodOverriding_Overloading_Hiding;

// can't create object
public abstract class AbstractParent {

	int Still_I_can_declare = 143;

	public void name() {
		System.out.println("I am still able to present here! Haha...!");
	}

	// default method not allowed here, only declare in inteface
	public abstract void whoIsUsing();

	public static void abstractInStaticMethod() {
		System.out.println("I am static method inside Abstract");
	}

}
