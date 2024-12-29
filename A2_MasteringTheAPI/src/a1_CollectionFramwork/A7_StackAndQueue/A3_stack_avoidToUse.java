package a1_CollectionFramwork.A7_StackAndQueue;

import java.util.Stack;
import java.util.Vector;

public class A3_stack_avoidToUse {

	public static void main(String[] args) {
		

		Vector<String> stack= new Stack<>();
		// don't use stack becuase it's not part of collection framework!
		// modern java prefare Dequeue
		
		stack.add("bottom");
		stack.add("middle");
		stack.add("top");
		
		System.out.println("Stack: "+stack);
		stack.removeLast();
		
		stack.add("Another_top");
		
		System.err.println("stack: "+stack);

	}

}
