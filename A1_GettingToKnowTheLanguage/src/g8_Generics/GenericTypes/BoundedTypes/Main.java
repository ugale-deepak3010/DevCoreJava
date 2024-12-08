package g8_Generics.GenericTypes.BoundedTypes;

interface MyInterface {
}

interface MyInterface2 {
}

interface MyInterface3 {
}

interface Interface_n {
}

class ConvertString {

	@Override
	public String toString() {
		return super.toString();
	}

}

class MethodTypes {
	// It's validating <T extends Number> only on parameter's
	public <T extends Number> void sayHello_Bounded_Type(T t) {
		System.out.println(t);
	}
}

//	Only first class will accept, rest of other should be interface.
@SuppressWarnings("hiding") // -----------------------------------------------------------> Interface_n
class ClassType<T extends Number & MyInterface & MyInterface2 & MyInterface3, Interface_n> {

	public void hello(T t) {
		System.out.println(t);
	}

}

class MyClass<T> {

	public String makeToString(T t) {
		System.out.println(t);
		return t.toString();
	}

	@SuppressWarnings("hiding")
	public <T extends Comparable<T>> String makeVerifiedToString(T t) {
		System.out.println(t);
		
		return t.toString();
	}

}

public class Main<T> {

	public void sayHello(T t) {
		System.out.println(t);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Main helloString = new Main<>();

		helloString.sayHello("Deepak");
		helloString.sayHello(143);

		MethodTypes helloNum = new MethodTypes();

		helloNum.sayHello_Bounded_Type(143);
		// helloNum.sayHello_Bounded_Type("Manali"); // Error!!

		ClassType helloClassType = new ClassType();

		helloClassType.hello(143);
		// helloClassType.hello("Manali"); // Error!!

		// Generic Methods and Bounded Type Parameters

		MyClass<Integer> myClass = new MyClass();
		myClass.makeToString(8);

		MyClass<String> myClass2 = new MyClass();
		myClass2.makeToString("Hello");

		MyClass myClass3 = new MyClass();
		myClass3.makeToString(3);
		myClass3.makeToString(new ConvertString());
		
		myClass3.makeVerifiedToString(3);
	//	myClass3.makeVerifiedToString(new ConvertString());	//	Error		not extending to Comparable!

	}
}
