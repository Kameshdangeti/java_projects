package com.Kamesh.projects.PractsingLoopConstructor;

public class ForLoop {
	public static void main(String[] args) {
		int m = 10;
		int n = 15;
		int sum = 0;
		for (int i = m; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println("The even no between m and n:" + i);
				sum = sum + i;
			}
		}
		System.out.println("summation of the numbers:" + sum);
	}
}
