package com.nitish.algo;

import com.nitish.util.CommonUtil;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 0, -4, 6, 12, 9, 4 };
		CommonUtil.printArray(doSelectionSort(arr));
	}

	private static int[] doSelectionSort(int[] arr) {
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

			System.out.print("Iteration: " + (i) + " = ");
			CommonUtil.printArray(arr);
		}

		return arr;
	}

}
