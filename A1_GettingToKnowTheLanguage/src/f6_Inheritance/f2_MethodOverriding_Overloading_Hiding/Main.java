package f6_Inheritance.f2_MethodOverriding_Overloading_Hiding;

public class Main {

	public static void main(String[] args) {

		Parent parent = new Parent();
		Child child = new Child();

		parent.parentMethod();
		child.parentMethod();
		
		
		//----------------------------------------------------------------------

		Child_2 child_2=new Child_2();
		child_2.whoIsUsing();
		
		AbstractParent abstractParent = new AbstractParent() {

			@Override
			public void whoIsUsing() {
				System.out.println("Awwwwww abstract class can create object! I am using ~Lamda Method");

				IamNotDeclaredAnywhere();
				IamNotDeclaredAnywhere_static();
			}

			public void IamNotDeclaredAnywhere() {
				System.err.println("I am Not Declared Anywhere");
			}

			public static void IamNotDeclaredAnywhere_static() {
				System.err.println("I am Not Declared Anywhere - Static");
			}
		};

		abstractParent.whoIsUsing();

		// can't call me because you didn't declared me
		// abstractParent.IamNotDeclaredAnywhere();

		AbstractParent.abstractInStaticMethod();

		// can't call me because you didn't declared me
		// AbstractParent.IamNotDeclaredAnywhere_static();

	}

}
