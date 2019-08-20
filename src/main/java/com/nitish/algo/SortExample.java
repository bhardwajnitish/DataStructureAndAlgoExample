package com.nitish.algo;

import com.nitish.util.CommonUtil;

public class SortExample {

	public static void main(String[] args) {
		System.out.println("Bubble Sort ---------");
		int[] arr = { 5, 6, 2, 8, 1, 0, 7 };
		CommonUtil.printArray(bubbleSort(arr));
		System.out.println("----------------------");

		System.out.println("Selection Sort ---------");
		int[] arr1 = { 5, 6, 2, 8, 1, 0, 7 };
		CommonUtil.printArray(selectionSort(arr1));
		System.out.println("----------------------");

		System.out.println("Insertion Sort ---------");
		int[] arr2 = { 5, 6, 2, 8, 1, 0, 7 };
		CommonUtil.printArray(insertionSort(arr2));
		System.out.println("----------------------");

		System.out.println("Quick Sort ---------");
		int[] arr3 = { 5, 6, 2, 8, 1, 0, 7 };
		CommonUtil.printArray(quickSort(arr3, 0, arr3.length - 1));
		System.out.println("----------------------");

		System.out.println("Merge Sort ---------");
		int[] arr4 = { 5, 6, 2, 8, 1, 0, 7 };
		CommonUtil.printArray(mergeSort(arr4, 0, arr4.length - 1));
		System.out.println("----------------------");
	}

	private static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	private static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int tempIndex = i;
			int j = i;
			while (j < arr.length - 1) {
				if (arr[j + 1] < temp) {
					temp = arr[j + 1];
					tempIndex = j + 1;
				}
				j++;
			}
			int t = arr[i];
			arr[i] = temp;
			arr[tempIndex] = t;
		}
		return arr;
	}

	private static int[] insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i + 1];
			int j = i + 1;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		return arr;
	}

	private static int[] quickSort(int[] arr, int start, int end) {
		int pivot = doPartition(arr, start, end);

		if (start < pivot - 1) {
			quickSort(arr, start, pivot - 1);
		}
		if (pivot < end) {
			quickSort(arr, pivot, end);
		}
		return arr;
	}

	private static int doPartition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];
		while (start <= end) {
			while (arr[start] < pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start <= end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		return start;
	}

	private static int[] mergeSort(int[] arr, int start, int end) {
		int mid = (start + end) / 2;
		if (start < end) {
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);

			merge(arr, start, end, mid);
		}
		return arr;
	}

	private static int[] tempArray;

	private static void merge(int[] arr, int start, int end, int mid) {
		if (tempArray == null) {
			tempArray = new int[arr.length];
		}

		int tempArrayIndex = start;
		int startIndex = start;
		int midIndex = mid + 1;
		while (startIndex <= mid && midIndex <= end) {
			if (arr[startIndex] < arr[midIndex]) {
				tempArray[tempArrayIndex++] = arr[startIndex++];
			} else {
				tempArray[tempArrayIndex++] = arr[midIndex++];
			}
		}
		while (startIndex <= mid) {
			tempArray[tempArrayIndex++] = arr[startIndex++];
		}
		while (midIndex <= end) {
			tempArray[tempArrayIndex++] = arr[midIndex++];
		}

		for (int i = start; i <= end; i++) {
			arr[i] = tempArray[i];
		}
	}

}
