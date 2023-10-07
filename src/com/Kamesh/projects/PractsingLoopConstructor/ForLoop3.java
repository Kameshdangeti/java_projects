package com.Kamesh.projects.PractsingLoopConstructor;

public class ForLoop3 {
	public static void main(String[] args) {
		int m = 10;
		int n = 30;
		int sum = 0;
		for (int i = m; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println("Even digits between m and n :" + i);
				sum = sum + i;
			}
		}
		System.out.println("Summmation of m and n :" + sum);
	}
}
