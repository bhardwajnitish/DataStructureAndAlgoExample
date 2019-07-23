package com.nitish.algo;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 8, 12, 45, 78 };
		findFirstElement(arr, 7);
		findFirstElement(arr, -5);

		int[] arr1 = { 2, 5, 6, 6, 9, 11, 11, 11, 45, 67, 67 };
		findLastElement(arr1, 11);
	}

	private static void findFirstElement(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (value == arr[mid]) {
				System.out.printf("Value %d found at index %d \n", value, mid);
				return;
			} else if (value < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		System.out.printf("Value %d not found\n", value);
	}

	private static void findLastElement(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;
		int result = -1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (value == arr[mid]) {
				result = mid;
				low = mid + 1;
				System.out.printf("Found %d at index %d \n", value, result);
			} else if (value < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
	}

}
