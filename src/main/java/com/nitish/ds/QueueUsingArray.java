package com.nitish.ds;

public class QueueUsingArray {

	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(5);
		queue.enqueue(5);
		queue.dequeue();
		queue.enqueue(7);
		queue.enqueue(-4);
		queue.enqueue(3);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(5);
		queue.enqueue(7);
		queue.dequeue();

	}

}

class ArrayQueue {
	private final int capacity;
	private final int arr[];
	private int head;
	private int rear;

	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		this.arr = new int[this.capacity];
		this.head = 0;
		this.rear = 0;
	}

	public void enqueue(int element) {
		if (this.head == this.capacity - 1) {
			System.out.println("Queue is full");
		} else {
			this.arr[this.head] = element;
			this.head++;
			this.rear = 0;
			System.out.println("Enqueue " + element + " in queue");
		}
	}

	public void dequeue() {
		if (this.head == 0) {
			System.out.println("Queue is empty");
		} else {
			int element = this.arr[this.rear];
			System.out.println("Dequeue " + element + " from queue");
			this.rear++;
			this.head--;
		}
	}
}
