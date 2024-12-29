package a1_CollectionFramwork.A7_StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class A2_DeQueue {

	public static void main(String[] args) {

		// it has Queue & Stack Both! help of addFirst() & addLast()
		Deque<String> deque = new ArrayDeque<>();

		deque.offer("one");
		deque.offer("two");
		deque.offer("three");

		deque.addFirst("zero");
		deque.addLast("four");

		deque.push("minus one");

		System.out.println(deque);

		deque.peekFirst();// read only
		deque.peekLast();// read only

		deque.pop();
		deque.pollFirst();// read & delete

		deque.pollLast();// read & delete

//-----------------------------------------------------------------------------
		// Like Stack

		Deque<String> stack = new ArrayDeque<>(); // LIFO examlle

		// similar addFirst()
		stack.push("bottom");
		stack.push("middle");
		stack.push("top");

		System.out.println("stack: " + stack);// stack: [top, middle, bottom]

		stack.peek();// read only
		stack.pop(); // pollFirst()
		stack.push("another_top");
		System.out.println("stack: " + stack);// stack: [ middle, bottom]
//---------------------------------------------------------------------------------

		// Like Queue

		Deque<String> queue = new ArrayDeque<>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");

		System.out.println("Queue: " + queue);

		queue.peek();
		queue.poll();
		queue.offer("four");

		System.out.println("Queue: " + queue);

	}

}
