package f6_Inheritance.f3_Interface;

//	if there two default method "sameName" then dafault need to implement
public class Child extends ParentClass implements AbstractParent, AbstractInterface2 {
	// first extends then implements otherwise not working

	@Override
	public void hello() { // AbstractParent, AbstractInterface2
		System.out.println("Hello ~From Child");
	}

	@Override
	public void hi() {
		System.out.println("All methods are abstract in interface ~From Child");
	}

	@Override
	public void gm() {
		System.out.println("AbstractGrandParent GM, I'm not implemented directly ~From Child");

	}

	@Override
	public void sameName() {
		AbstractInterface2.super.sameName();
	}

}
