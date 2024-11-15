package b2_JavaLanguageBasics.b5_Operators;

public class InstanceOf_TypeComparisonDemo {

	public static void main(String[] args) {

		Parent parent = new Parent();
		Parent childNInterface = new Child();

		// obj1 instanceof Parent: true
		System.out.println("parent instanceof Parent: " + (parent instanceof Parent));

		// obj1 instanceof Child: false
		System.out.println("parent instanceof Child: " + (parent instanceof Child));

		// obj1 instanceof MyInterface: false
		System.out.println("parent instanceof MyInterface: " + (parent instanceof MyInterface));

		// obj2 instanceof Parent: true
		System.out.println("childNInterface instanceof Parent: " + (childNInterface instanceof Parent));

		// obj2 instanceof Child: true
		System.out.println("childNInterface instanceof Child: " + (childNInterface instanceof Child));

		// obj2 instanceof MyInterface: true
		System.out.println("childNInterface instanceof MyInterface: " + (childNInterface instanceof MyInterface));
	}
}

class Parent {
}

class Child extends Parent implements MyInterface {
}

interface MyInterface {
}
