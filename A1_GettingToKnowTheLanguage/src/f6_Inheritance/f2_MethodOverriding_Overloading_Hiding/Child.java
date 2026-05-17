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

	// overloading way 1 | Different in param types
	public void overloading(String name) {
	}

	public void overloading(int name) {

	}

	// overloading way 2 | differrent number of parameter
	public void overloading(String name, String name2) {

	}

	// Not Allowd based on return data type.
	public String overloading() {
		return "";
	}

	public int Xoverloading() {
		return 0;
	}

}
