package f6_Inheritance.f7_Final;

public class Main {
	
	final static int constant= 5; // can't change due to the final
	
	public static void main(String[] args) {

		//constant=6; // can't change 5 -> 6;
		
		Child child = new Child();

		child.ParentAffairs();
	}
}
