package c3_ClassesAndObjects.c3_Nexted_InnerClas;

@SuppressWarnings("unused")
public class OuterClass {

	interface innerInterface {
	}

	int z = 3;
	static int a = 2;

	class InnerClass {

		int x = 5;
	}

	private static class StaticInnerClass {
		int y = 4;
	}

	public static void main(String[] args) {

		OuterClass outerClass = new OuterClass();

		System.out.println("+++");
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();

		InnerClass innerClass2 = outerClass.new InnerClass();
		// InnerClass innerClass3= new outerClass.InnerClass(); //wrong

//direct static class object 
		OuterClass.StaticInnerClass staticInnerClass = new StaticInnerClass();

		System.out.println(staticInnerClass.y);

		TopLevelClass topLevelClass = new TopLevelClass();
		topLevelClass.accessMembers(outerClass);
	}

}

class TopLevelClass {

	void accessMembers(OuterClass outer) {
		// can't access non-static field from class. Without new instance
//        System.out.println(OuterClass.z);
		System.out.println("z == " + outer.z);
		System.out.println("a == " + OuterClass.a);
	}
}
