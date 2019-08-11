package com.nitish.algo;

import com.nitish.util.CommonUtil;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 0, -4, 6, 12, 9, 4 };
		CommonUtil.printArray(doInsertionSort(arr));
		System.out.println("\n--------------------------------------");
		CommonUtil.printArray(doInsertionSort1(arr));
	}

	private static int[] doInsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
			System.out.print("Iteration: " + (i) + " = ");
			CommonUtil.printArray(arr);
		}
		return arr;
	}

	
	/**
	 * 	3, 4, 1, 0, 9, 2, 7
	 * 	i = 1, temp = 4, j = 1
	 *  3 > 4 -> break;
	 * 	3, 4, 1, 0, 9, 2, 7
	 * -----------------
	 * 	i = 2, j = 2, temp = 1
	 * 	4 > 1 -> yes
	 * 	3, 1, 4, 0, 9, 2, 7
	 * --------------------
	 * 	j = 1, temp = 1, i = 2
	 * 	3 > 1 -> yes
	 * 	1, 3, 4, 0, 9, 2, 7
	 * ----------------------
	 * 	i = 2, j = 2, temp = 4
	 * 	3 > 4 -> break
	 * 	1, 3, 4, 0, 9, 2, 7
	 * ------------------------
	 * 	i = 3, j = 3, temp = 0
	 * 	4 > 0 -> yes
	 * 	1, 3, 0, 4, 9. 2. 7
	 * -----------------------
	 * 	j = 2, temp = 0;
	 * 	3 > 0 -> yes
	 * 	1, 0, 3, 4, 9, 2, 7
	 * ----------------------
	 * 	j = 1, temp = 0
	 * 	1 > 0 -> yes
	 * 	0, 1, 3, 4, 9, 2, 7
	 * ------------------------
	 * 	i = 4, j = 4, temp = 9
	 * 	4 > 9 -> break
	 * 	0, 1, 3, 4, 9, 2, 7
	 * ----------------------
	 * 	i = 5, j = 5, temp = 2
	 * 	9 > 2 -> yes
	 * 0, 1, 3, 4, 2, 9, 7
	 * ----------------------
	 * 	j = 4, i = 5, temp = 2
	 * 	4 > 2 -> yes
	 * 	0, 1, 3, 2, 4, 9, 7
	 * ----------------------
	 * 	j = 3, i = 5, temp = 2
	 * 	3 > 2 -> yes
	 * 0, 1, 2, 3, 4, 9, 7
	 * ----------------------
	 * 	j = 2, i = 5; temp = 2
	 * 	1 > 2 -> break
	 * 0, 1, 2, 3, 4, 9, 7
	 * -----------------------
	 * 	i = 6, j = 6, temp = 7
	 * 	9 > 7 -> yes
	 * 	0, 1, 2, 3, 4, 7, 9
	 * -------------------------
	 * 	j = 5, temp = 7
	 * 	4 > 7 -> break;
	 * 0, 1, 2, 3, 4, 7, 9
	 * 	
	 **/
	
	private static int[] doInsertionSort1(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0) {
				if (arr[j - 1] > temp) {
					arr[j] = arr[j - 1];
				} else {
					break;
				}
				j--;
			}
			arr[j] = temp;
			System.out.print("Iteration: " + (i) + " = ");
			CommonUtil.printArray(arr);
		}
		return arr;
	}

}
