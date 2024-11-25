package f6_Inheritance.f3_Interface;

public class Main {

	public static void main(String[] args) {
		Child child = new Child();
		child.hello();
		child.hi();

		child.bye();		// same default method so 

//	can't call static method
		// child.static_gn();

		AbstractParent.static_gn();

		child.gm();

	}
}
