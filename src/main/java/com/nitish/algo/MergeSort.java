package com.nitish.algo;

import com.nitish.util.CommonUtil;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 0, -4, 6, 12, 9, 4 };
		CommonUtil.printArray(doMergeSort(arr, 0, arr.length - 1));
	}

	private static int[] doMergeSort(int[] arr, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {

			//divide left side
			//printArr(arr, low, high);
			doMergeSort(arr, low, mid);

			//divide right side
			//printArr(arr, mid + 1, high);
			doMergeSort(arr, mid + 1, high);

			//System.out.println("low - " + low + " , mid - " + mid + " , high - " + high);
			//System.out.println("arr - [" + arr[low] + " " + arr[mid] + " " + arr[high] + " " + "]\n");
			merge(arr, low, mid, high);
		}
		return arr;
	}

	private static int[] tempArr;

	private static void merge(int[] arr, int low, int mid, int high) {
		if (tempArr == null) {
			tempArr = new int[arr.length];
		}
		int tempArrIndex = low;
		System.out.print("Before Merging:  ");
		printArr(arr, low, high);

		int lowIndex = low;
		int midIndex = mid + 1;

		// It will iterate until smaller list reaches to the high
		while (lowIndex <= mid && midIndex <= high) {
			if (arr[lowIndex] < arr[midIndex]) {
				tempArr[tempArrIndex++] = arr[lowIndex++];
			} else {
				tempArr[tempArrIndex++] = arr[midIndex++];
			}
		}

		// Copy remaining elements
		while (lowIndex <= mid) {
			tempArr[tempArrIndex++] = arr[lowIndex++];
		}
		while (midIndex <= high) {
			tempArr[tempArrIndex++] = arr[midIndex++];
		}

		// Copy tempArr to actual array after sorting

		for (int i = low; i <= high; i++) {
			arr[i] = tempArr[i];
		}

		System.out.print("After merging:   ");
		printArr(arr, low, high);
		System.out.println();

	}

	private static void printArr(int[] arr, int low, int high) {
		for (int i = low; i <= high; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
