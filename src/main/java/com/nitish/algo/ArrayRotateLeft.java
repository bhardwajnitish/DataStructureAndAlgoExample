package com.nitish.algo;

public class ArrayRotateLeft {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int noOfRotation = 3;
		int[] rotatedArr = rotateArray(arr, noOfRotation);
		for (int a : rotatedArr) {
			System.out.print(a);
		}

	}

	private static int[] rotateArray(int[] arr, int noOfRotation) {
		while (true) {
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;
			noOfRotation--;
			if (noOfRotation == 0) {
				break;
			}
		}
		return arr;
	}

}
