package com.nitish.ds;

import java.util.NoSuchElementException;

public class StackUsingLinkedList {

	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();
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

class LinkedListStack {
	private Node head;

	private class Node {
		private int element;
		private Node next;
	}

	public LinkedListStack() {
		this.head = null;
	}

	public void push(int element) {
		Node temp = this.head;
		this.head = new Node();
		this.head.element = element;
		this.head.next = temp;
		System.out.println("Pushing element " + element);
	}

	public int pop() throws NoSuchElementException {
		if (this.head == null) {
			throw new NoSuchElementException("No element found");
		}
		int value = this.head.element;
		this.head = this.head.next;
		System.out.println("Poping element " + value);
		return value;
	}
}
