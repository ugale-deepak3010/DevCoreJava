package c3_ClassesAndObjects.c3_Nexted_InnerClas;

@SuppressWarnings("unused")
public class OuterClass {
	
	interface innerInterface{
		
	}

	int z = 3;
	static int a = 2;

	class InnerClass {
		int x = 5;
	}

	static class StaticInnerClass {
		int y = 4;
	}

	public static void main(String[] args) {

		OuterClass outerClass = new OuterClass();

		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		InnerClass innerClass2 = outerClass.new InnerClass();
	//	InnerClass innerClass3= new outerClass.InnerClass();	//wrong 

		StaticInnerClass staticInnerClass = new StaticInnerClass();
	}

}

class TopLevelClass {

	void accessMembers(OuterClass outer) {
		// can't access non-static field from class.
//        System.out.println(OuterClass.z);
		System.out.println(outer.z);
		System.out.println(OuterClass.a);
	}
}
