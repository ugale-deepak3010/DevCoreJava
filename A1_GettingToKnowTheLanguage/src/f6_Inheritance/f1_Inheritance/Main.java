package f6_Inheritance.f1_Inheritance;

@SuppressWarnings("unused")
public class Main {

	public synchronized void myMethod() {

	}

	public static void main(String[] args) {

		Object child_o = new Child();
		GrandParent child_gp = new Child();
		Parent child_p = new Child();
		Child child_only = new Child();

		child_o.toString();
		child_gp.grandParentMethod();
		child_p.parentMathod();

		child_only.childMethod();
		child_only.toString();
		child_only.grandParentMethod();
		child_only.parentMathod();

		// PARENT CAN NOT ACCESS CHILD DATA Ha ha ha ...
//		child_o.childMethod();
//		child_gp.childMethod();
//		child_p.childMethod();

		// upcasting it's working!
		((Child) child_o).childMethod();
		((Child) child_gp).childMethod();
		((Child) child_p).childMethod();

//--------------------------------------------------------------------------		
		// Reassignment

		Object child_o2 = child_only;
		GrandParent child_gp2 = child_only;
		Parent child_p2 = child_only;
		Child child_only2 = child_only;
		Child child_only02 = (Child) child_only;

		Object object = new Object();
		GrandParent grandParent = new GrandParent();
		Parent parent = new Parent();
		Child child = new Child();

		// casting not required
		Object object3 = child_only;
		GrandParent grandParent3 = child_only;
		Parent parent3 = child_only;

		// Casting

		try {

			Child child_only03 = (Child) child_only;

			// it will not work at runtime!!!!!!!!!!!!!!!!!!!!!!!!!!!
			Child child_obj = (Child) object;
			Child child_grandParent = (Child) grandParent;
			Child child_parent = (Child) parent;
		} catch (Exception e) {
			System.err.println("Parent's are not instance instance of child object,\n Hence casting not possible");
		}

		boolean ObjectIsIntsanceOfChild = object instanceof Child;
		boolean GrandParentIsIntsanceOfChild = grandParent instanceof Child;
		boolean ParentIsIntsanceOfChild = parent instanceof Child;
		boolean ChildIsIntsanceOfChild = child instanceof Child;

		System.out.println(ObjectIsIntsanceOfChild);
		System.out.println(GrandParentIsIntsanceOfChild);
		System.out.println(ParentIsIntsanceOfChild);
		System.out.println(ChildIsIntsanceOfChild);

	}
}
