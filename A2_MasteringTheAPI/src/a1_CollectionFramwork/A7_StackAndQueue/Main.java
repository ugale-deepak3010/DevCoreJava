package a1_CollectionFramwork.A7_StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		// simple example with all cases

		// queue
		Queue<String> queue = new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");

		System.out.println("queue: " + queue);

		System.out.println("peek: " + queue.peek());

		queue.poll();
		System.out.println("queue: " + queue);

		queue.offer("four");
		System.err.println("queue: " + queue);

		// Stack

		Deque<String> stack = new ArrayDeque<>();
		stack.push("bottom");
		stack.push("middle");
		stack.push("top");

		System.out.println("stack: " + stack);

		System.out.println("peek: " + stack.peek());

		stack.poll();
		System.out.println("stack: " + stack);

		stack.push("another_top");
		System.err.println("stack: " + stack);

	}

}
