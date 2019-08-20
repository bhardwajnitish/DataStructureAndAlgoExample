package com.nitish.algo;

public class RecursionExample {

	public static void main(String[] args) {
		int number = 5;
		System.out.println("Factorial of - " + number + " = " + calcuateFactorial(number));
	}

	private static int calcuateFactorial(int n) {
		System.out.println("1111111111111111111111");
		int result = 0;
		System.out.println("2222222222222222222222222");
		if (n == 0) {
			result = 1;
			System.out.println("3333333333333333333  " + result);
		} else {
			System.out.println("4444444444444444444444");
			result = n * calcuateFactorial(n - 1);
			System.out.println("555555555555555   " + result);
		}
		System.out.println("6666666666666666666   " + result);
		return result;
	}

}
