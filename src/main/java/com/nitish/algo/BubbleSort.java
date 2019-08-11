package com.nitish.algo;

import com.nitish.util.CommonUtil;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 0, -4, 6, 9, 12, 4 };
		CommonUtil.printArray(doBubbleSort(arr));
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
			CommonUtil.printArray(arr);
		}
		return arr;
	}

}
