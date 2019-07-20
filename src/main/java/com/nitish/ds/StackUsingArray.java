package com.nitish.ds;

public class StackUsingArray {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
		stack.push(2);
		stack.push(4);
		stack.push(-5);
		stack.push(5);
		stack.push(0);
		stack.push(8);
		stack.push(19);

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		stack.push(12);
		stack.push(32);
		stack.push(-45);

		stack.pop();
		stack.pop();
		stack.pop();

	}

}

class ArrayStack {
	private final int size;
	private final int[] arr;
	private int head;

	public ArrayStack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.head = 0;
	}

	public void push(int element) {
		if (this.head < this.size) {
			System.out.println("Pushing element " + element + " at index " + this.head);
			this.arr[this.head] = element;
			this.head++;
			return;
		}
		System.out.println("Stack is full...");
	}

	public int pop() {
		int returnVal = -1;
		if (this.head > 0) {
			this.head--;
			System.out.println("Poping element " + this.arr[this.head] + " from index " + this.head);
			returnVal = this.arr[this.head];
			return returnVal;
		}
		System.out.println("Stack is empty...");
		return returnVal;
	}
}
