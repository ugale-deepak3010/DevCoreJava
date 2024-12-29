package a1_CollectionFramwork.A7_StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class A1_Queue {

	public static void main(String[] args) {

		// QUEUE = offer(), peek(), poll() // return false if fail
		// Collection = add(), element(), remove() // exception if fail
		// DE-QUEUE = offer(), peek(), poll() // return null if fail
		Queue<String> queue = new LinkedList<>();
		queue.add("one"); // throw error if full
		queue.offer("two");

		System.out.println("current: " + queue);

		queue.element();// throw exception if empty.
		queue.peek();

		System.out.println("current: " + queue);

		queue.remove(); // throw error if empty
		queue.poll(); // retrieve & then remove
		System.out.println("two has removed: " + queue);

		Queue<String> queue2 = new ArrayBlockingQueue<String>(1);
		queue2.add("one");
		queue2.element();
		queue2.remove();

		queue2.add("something");

		queue2.offer("two"); // safe
		queue2.peek();// safe
		queue2.poll();// safe

		
	}
}
