package com.Kamesh.projects.PractsingLoopConstructor;

public class BreakKeyword4 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 3 || j == 3) {
					break;
				}
				System.out.println("Break values of i :" + i);
				System.out.println("Break values of j :" + j);
			}
		}
	}
}
