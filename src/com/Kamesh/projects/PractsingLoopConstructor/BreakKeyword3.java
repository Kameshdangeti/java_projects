package com.Kamesh.projects.PractsingLoopConstructor;

public class BreakKeyword3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i == 3 || j == 3) {
					break;
				}
				System.out.println("Break values are:" + i);
				System.out.println("Break values are:" + j);
			}
		}
	}
}
