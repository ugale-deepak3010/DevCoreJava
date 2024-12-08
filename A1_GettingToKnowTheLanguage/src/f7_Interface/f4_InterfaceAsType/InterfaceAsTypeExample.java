package f7_Interface.f4_InterfaceAsType;

interface Animal {
	void makeSound();
}

class Dog implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Woof!");
	}
}

class Cat implements Animal {
	@Override
	public void makeSound() {
		System.out.println("Meow!");
	}
}

public class InterfaceAsTypeExample {
	public static void main(String[] args) {
		
		// Use the interface as a type
		Animal myDog = new Dog(); // Dog object referenced by Animal type
		Animal myCat = new Cat(); // Cat object referenced by Animal type

		// Call the makeSound method
		myDog.makeSound(); // Output: Woof!
		myCat.makeSound(); // Output: Meow!

		// You can pass the interface type to methods
		describeAnimal(myDog);
		describeAnimal(myCat);
	}

	// A method that accepts the interface type as a parameter
	public static void describeAnimal(Animal animal) {
		System.out.print("This animal says: ");
		animal.makeSound();
	}
}
