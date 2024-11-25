package f6_Inheritance.f2_MethodOverriding_Overloading_Hiding;

public class Child_2 extends AbstractParent {

	@Override
	public void whoIsUsing() {

		System.out.println("I am using ~" + this.getClass().getSimpleName());

	}

}
