package c3_ClassesAndObjects.c2_CreatingAndUsingObj;

public class Main2Class {

	public static void count(Object ... objects) {
		
		int count=0;
		
		for(@SuppressWarnings("unused") Object object:objects) {
			count++;
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		count("Mo.",89756210);
	}
}
