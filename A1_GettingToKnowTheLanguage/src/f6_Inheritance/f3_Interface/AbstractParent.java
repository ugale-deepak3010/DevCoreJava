package f6_Inheritance.f3_Interface;

public interface AbstractParent extends AbstractGrandParent {

	public void hello();

	public abstract void hi(); // all methods are abstract

	// default method optional for implement, but can be call through child
	public default void bye() {
		System.out.println("Nobody said bye!!! ~From Interface");
	}

	public static void static_gn() {
		System.out.println("Good Night ~From Interface");
	}

	public default void sameName() {
		System.out.println("sameName");
	}
}
