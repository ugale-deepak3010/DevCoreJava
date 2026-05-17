package f6_Inheritance.f4_Polymorphism;

public class Main {

	// way 1
	public void display(String firstName, String lastName) {
		System.out.format("\n Hello %s %s", firstName, lastName);
	}

	public void display(String firstName) {
		System.out.format("\n Hello %s", firstName);
	}

	// way2
	public void display(int firstName) {
		System.out.format("\n Hello %d", firstName);
	}

	// it's not allowed in Java
//	public String display(String firstName) {
//		return String.format("\n Hello %s", firstName);
//	}

	public static void main(String[] args) {

		Main main = new Main();

		Parent parent1 = new Parent();
		Parent parent2 = new Child();

		// CompileTime Polymorphism //method Overloading
		main.display("Deepak");
		main.display("Deepak", "Ugale");

		// way 2
		main.display(1_00);

		// RunTime Polymorphism //method Overriding
		parent1.sayHello("Deepak");
		parent2.sayHello("Ugale");
		System.out.println();

		// ---------------------------------------

		WhySameNameParameterNotAllow why = new WhySameNameParameterNotAllow(); // return type void or int doesn't feel method is different! only parm are imp!!

		why.show(2);
		why.show(2L);

	}

}
