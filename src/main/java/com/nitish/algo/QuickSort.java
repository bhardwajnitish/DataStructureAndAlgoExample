package com.nitish.algo;

import com.nitish.util.CommonUtil;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 17, 15, 7, 10, 12, 9, 16, 4, 5 };

		CommonUtil.printArray(doQuickSort(arr, 0, arr.length - 1));

		int[] arr1 = { 3, 4, 1, 0, -4, 6, 12, 9, 4 };
		//CommonUtil.printArray(quickSort(arr, 0, arr1.length - 1));
	}

	private static int[] doQuickSort(int[] arr, int low, int high) {
		System.out.print("Input array - ");
		CommonUtil.printArray(arr);

		int pivot = doPartition(arr, low, high);
		if (low < pivot - 1) {
			doQuickSort(arr, low, pivot - 1);
		}
		if (pivot < high) {
			doQuickSort(arr, pivot, high);
		}
		return arr;
	}

	/*
	 * 17, 15, 7, 10, 12, 9, 16, 4, 5
	 */
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

	/*
	 * 3, 4, 1, 0, -4, 6, 12, 9, 4
	 * pivot = 8, p = 0, i = -1, j = 0
	 * 	3 <= 4 -> yes
	 * 	i = 1, temp = 3,
	 * 
	 */
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
