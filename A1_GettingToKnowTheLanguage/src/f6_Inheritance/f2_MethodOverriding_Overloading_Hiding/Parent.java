package f6_Inheritance.f2_MethodOverriding_Overloading_Hiding;

@SuppressWarnings("unused")
public class Parent {

	// can't declare abstract method in normal class!
	// abstract void name();

	public static void StaticHidden_StaticMethodForChild() {

	}

	// instance method
	public void parentMethod() {
		System.out.println("coming from Parent");

	}

	private void canNot_ImplementInChild() {

	}

	// limited for package
	protected void canBe_Implement() {

	}

//  only allowed in interface!
//	default void name() {}

}
