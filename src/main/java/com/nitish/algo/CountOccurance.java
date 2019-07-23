package com.nitish.algo;

public class CountOccurance {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 3, 3, 5, 5, 7, 7, 7, 7, 9, 9, 9, 9, 9 };
		System.out.println("Occurance of 1 in linear way = " + countOccuranceInLinearWay(arr, 1));
		System.out.println("Occurance of 3 in linear way = " + countOccuranceInLinearWay(arr, 3));
		System.out.println("Occurance of 9 in linear way = " + countOccuranceInLinearWay(arr, 9));

		System.out.println("Occurance of 1 in binary way = " + findOccuranceInBinaryWay(arr, 1));
		System.out.println("Occurance of 3 in binary way = " + findOccuranceInBinaryWay(arr, 3));
		System.out.println("Occurance of 9 in binary way = " + findOccuranceInBinaryWay(arr, 9));
	}

	private static int countOccuranceInLinearWay(int[] arr, int value) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (value == arr[i]) {
				count++;
			} else if (arr[i] > value) {
				break;
			}
		}
		return count;
	}

	private static int findOccuranceInBinaryWay(int[] arr, int value) {
		int count = 0;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (value == arr[mid]) {
				count++;
				low = mid + 1;
			} else if (value < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return count;
	}

}
