package g8_Generics.GenericTypes.BoundedTypes;

class MethodTypes {  
	
	/*
	 * It's validating <T extends Number> only on parameter's
	 */
	public <T extends Number> String sayHello_Bounded_Type(T t) {
		System.out.println(t);
		
		return "Done";
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
		
		MethodTypes helloNum= new MethodTypes();

		helloNum.sayHello_Bounded_Type(143);
		//helloNum.sayHello_Bounded_Type("Manali");		//	Error!!
		
	}
}
