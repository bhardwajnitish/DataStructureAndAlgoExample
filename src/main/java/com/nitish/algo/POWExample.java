package com.nitish.algo;

public class POWExample {

	public static void main(String[] args) {
		System.out.println("pow = " + pow(3, 3));
		System.out.println("pow1 = " + pow1(3, 3));
	}

	private static int pow(int a, int b) {
		int result = a;
		int temp = a;
		for (int i = 1; i < b; i++) {
			for (int j = 1; j < a; j++) {
				result += temp;
			}
			temp = result;
		}
		return result;
	}

	private static int pow1(int num, int pow) {
		int result = 1;
		for (int i = 1; i <= pow; i++) {
			int temp = 0;

			for (int j = 1; j <= num; j++) {
				temp = temp + result;
			}

			System.out.println("-- " + temp);
			result = temp;
		}
		return result;
	}

}
