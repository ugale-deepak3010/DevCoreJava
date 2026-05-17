package c3_ClassesAndObjects.c2_CreatingAndUsingObj;

public class Main2Class {

	// this is called VarArg or Abitary inputs
	public static void countParm(Object... objects) {

		int count = 0;

		for (@SuppressWarnings("unused")
		Object object : objects) {
			count++;
			System.out.println(count+" = "+object);
		}
		System.out.println("count = "+count);
	}

	public static void main(String[] args) {

		countParm("Mo.", 89756210); // two arbitary ip passed // 2
	}
}
