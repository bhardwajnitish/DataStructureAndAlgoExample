package com.nitish.algo;

import com.nitish.util.CommonUtil;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 0, -4, 6, 12, 9, 4 };
		int low = 0;
		int high = arr.length - 1;
		CommonUtil.printArray(doQuickSort(arr, low, high));

		CommonUtil.printArray(quickSort(arr, low, high));
	}

	private static int[] doQuickSort(int[] arr, int low, int high) {
		int pivot = doPartition(arr, low, high);
		if (low < pivot - 1) {
			doQuickSort(arr, low, pivot - 1);
		}
		if (pivot < high) {
			doQuickSort(arr, pivot, high);
		}
		return arr;
	}

	private static int doPartition(int[] arr, int low, int high) {
		int pivot = arr[(low + high) / 2];
		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
				System.out.print("Iteration:  = ");
				CommonUtil.printArray(arr);
			}
		}
		return low;
	}

	public static int[] quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot - 1);
			quickSort(array, pivot + 1, end);
		}
		return array;
	}//end of method

	static int partition(int[] array, int p, int q) {
		int pivot = q;
		int i = p - 1;
		for (int j = p; j <= q; j++) {
			if (array[j] <= array[pivot]) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				System.out.print("Iteration:  = ");
				CommonUtil.printArray(array);
			}
		}
		return i;

	}//end of method

}
