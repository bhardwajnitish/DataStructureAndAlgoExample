package com.nitish.algo;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 0, -4, 6, 9, 12, 4 };
		printArray(doBubbleSort(arr));
	}

	public static int[] doBubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.print("Iteration: " + (i + 1) + " = ");
			printArray(arr);
		}
		return arr;
	}

	private static void printArray(int[] arr) {
		for (int a : arr) {
			System.out.print(a + ", ");
		}
		System.out.println();
	}

}
