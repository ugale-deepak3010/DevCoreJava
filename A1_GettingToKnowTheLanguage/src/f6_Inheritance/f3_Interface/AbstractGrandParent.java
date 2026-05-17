package f6_Inheritance.f3_Interface;

public interface AbstractGrandParent {

	void gm();// public abstract

	private void canBeHavePrivateMethodWithBody() {
		System.out.println("interface may have private method with body in java9+");
	}

	default void justChill() {
		canBeHavePrivateMethodWithBody();
	}

}
