package com.Kamesh.projects.PractsingLoopConstructor;

public class ContinueKeyword {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 3 || j == 3) {
					continue;
				}
				System.out.println("Continue values of i :" + i);
				System.out.println("Continue values of j :" + j);
			}
		}
	}
}
