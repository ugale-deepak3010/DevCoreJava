package f6_Inheritance.f1_Inheritance;

//		can be extend any Public & Protected class.
public class Child extends Parent {

	int childVar = 2222;

	public void childMethod() {
		System.out.println("Child Class | " + this.getClass());
	}

}
