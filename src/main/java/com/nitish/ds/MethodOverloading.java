package com.nitish.ds;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading overloading = new MethodOverloading();
		overloading.show("A".getBytes()[0]);
		overloading.show(10.5);
		overloading.show(10.9f);
		overloading.show(null);

	}

	/*
	 * private void show(byte value) { System.out.println("show byte " + value);
	 * }
	 */

	private void show(double value) {
		System.out.println("show double " + value);
	}

	private void show(Object value) {
		System.out.println("show Object " + value);
	}

	private void show(String value) {
		System.out.println("show String " + value);
	}

}
