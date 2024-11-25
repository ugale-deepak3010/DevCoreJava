package f6_Inheritance.f2_MethodOverriding_Overloading_Hiding;

//already extending Object Class and can be extend Interface indirect abstract class
public class Child extends Parent {

	@Override
	public void parentMethod() {

		System.out.println("coming from Child");
	}

	public void abstractParentMethod_MustDeclareInClass() {
		System.out.println("abstractParentMethod_MustDeclareInClass");

	}

}
