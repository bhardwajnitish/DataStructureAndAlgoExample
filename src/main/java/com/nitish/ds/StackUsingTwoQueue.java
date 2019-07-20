package com.nitish.ds;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.stream.IntStream;

public class StackUsingTwoQueue {

	public static void main(String[] args) {
		TwoQueueStack stack = new TwoQueueStack();
		stack.push(5);
		stack.push(6);
		stack.push(0);
		stack.push(-8);
		stack.push(11);

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}

}

class TwoQueueStack {
	private final Queue<Integer> queue1;
	private final Queue<Integer> queue2;

	public TwoQueueStack() {
		this.queue1 = new LinkedList<Integer>();
		this.queue2 = new LinkedList<Integer>();
	}

	public void push(int element) {
		if (this.queue1.isEmpty()) {
			this.queue1.add(element);
		} else {
			IntStream.range(0, this.queue1.size()).forEach(e -> this.queue2.add(this.queue1.remove()));
			this.queue1.add(element);
			IntStream.range(0, this.queue2.size()).forEach(e -> this.queue1.add(this.queue2.remove()));
		}
		System.out.println("pushing element " + this.queue1.element());
	}

	public int pop() throws NoSuchElementException {
		if (this.queue1.isEmpty()) {
			throw new NoSuchElementException("No Such element");
		}
		int value = this.queue1.remove();
		System.out.println("Poping element " + value);
		return value;
	}
}
