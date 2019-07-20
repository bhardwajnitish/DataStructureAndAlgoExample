package com.nitish.algo;

public class TrangleExample {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				builder.append("*");
				builder.append(" ");
			}
			builder.append("\n");
		}
		System.out.println(builder.toString());
	}

}
