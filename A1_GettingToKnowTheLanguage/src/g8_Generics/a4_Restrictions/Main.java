package g8_Generics.a4_Restrictions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/*
Cannot Instantiate Generic Types with Primitive Types
Cannot Create Instances of Type Parameters
Cannot Declare Static Fields Whose Types are Type Parameters
Cannot Use Casts or instanceof with Parameterized Types
Cannot Create Arrays of Parameterized Types
Cannot Create, Catch, or Throw Objects of Parameterized Types
Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type
 */
//Extends Throwable indirectly
//class MathException<T> extends Exception { /* ... */ }    // compile-time error

//Extends Throwable directly
//class QueueFullException<T> extends Throwable { /* ... */ // compile-time error

//	can't use T in try catch(T t) block...

class GenericBox<T>{
	
	@SuppressWarnings("hiding")
	class Parser<T extends Exception> {
	    public void parse(File file) throws T {     // OK
	        // ...
	    }
	}
	// Can't use static
	// public static T t0;

	private T t;

	public GenericBox(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public void canTcreateInstance(T t) {
		// T t2= new t();
	}

	public void canTcreateInstance2(Class<T> t) {
		// T t2= new t.newInstance();
	}

	public static <E> void rtti(List<E> list) {
		// Because the Java compiler erases all type parameters in generic code,
		// you cannot verify which parameterized type for a generic type is being used
		// at runtime:

		// if (list instanceof ArrayList<Integer>) {}

		if (list instanceof ArrayList<?>) { // OK; instanceof requires a reifiable type
			// ...
		}
	}

	@SuppressWarnings("unused")
	public void castTest() {

		// u cannot cast to a parameterized type unless it is parameterized by unbounded
		// wildcards.
		List<Integer> li = new ArrayList<>();
		// List<Number> ln = (List<Number>) li;

		List<String> list2 = new ArrayList<>();
		ArrayList<String> l2 = (ArrayList<String>) list2; // OK
	}

}

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		GenericBox<String> genericBox = new GenericBox<String>("Deepak");

		// can't sustitute with primitive data types
		// GenericBox<char> genericBox2=new GenericBox<char>('D');
		
		

	}

}
