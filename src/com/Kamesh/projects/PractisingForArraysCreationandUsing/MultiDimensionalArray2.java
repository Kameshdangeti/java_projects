package com.Kamesh.projects.PractisingForArraysCreationandUsing;

public class MultiDimensionalArray2 {
	public static void main(String[] args) {
		int[][][] a = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 70, 80, 90 }, { 100, 110, 120 } } };
		System.out.println("Multi dimensional array");
		for (int[][] b : a) {
			for (int[] c : b) {
				for (int d : c) {
					System.out.println(d);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
