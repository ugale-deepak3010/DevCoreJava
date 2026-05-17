package c3_ClassesAndObjects.c3_Nexted_InnerClas;

@FunctionalInterface
public interface FunctionInterfaceDemo {

	public abstract void sayHello(); // always single method!

	public default void onDefaultMethod() {
		System.out.println("hii");
	}

	public static void name1() {
		System.out.println("hii");
	}

	public static void name2() {
		System.out.println("hii");
	}

	public static void name3() {
		System.out.println("hii");
	}

	public static void nameN() {
		System.out.println("hii");
	}

	int x = 5; // it's static final!
	final int y = 6;
	final static int z = 8;

}

// variable hiding!

interface A {
	int X = 10;
}

class B implements A {
	int X = 20; // this is a NEW variable, not changing A.X
}