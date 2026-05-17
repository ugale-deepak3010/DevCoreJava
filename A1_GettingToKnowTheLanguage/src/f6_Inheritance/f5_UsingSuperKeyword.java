package f6_Inheritance;

class Parent {

	public Parent() {
		// If there no default constructor then must be implment in child
		// also!!!!!!!!!!!!!!
	}

	Parent(String name) {
		System.out.println("Constructr says Hello " + name);
	}

	static String StaticName = null;

	public void setStaticName(String name) {
		StaticName = name;
	}

	public static void StaticMethod() {// can be private

		String name = null;
		boolean isEmpty = StaticName == null; // only equal for method, null should be use == , true
		name = isEmpty ? "Lover" : StaticName;

		System.out.println("Hello " + name + "!");
	}
}

class Child extends Parent {

	public void setYourName(String name) {
		super.setStaticName(name); // super can use like Parent object!!
	}

	public Child(String firstName) {
		super(firstName); // super pass the value to Parent constructor!
	}

}

public class f5_UsingSuperKeyword {

	public static void main(String[] args) {

		Child child = new Child("Manali");
		child.setYourName("Deepak");

		Parent.StaticMethod();

		child.setYourName(null);
		Parent.StaticMethod();

	}

}
