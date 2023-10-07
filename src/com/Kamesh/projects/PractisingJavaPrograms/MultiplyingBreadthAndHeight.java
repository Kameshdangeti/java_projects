package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.Scanner;

public class MultiplyingBreadthAndHeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Breadth value :");
		int b = sc.nextInt();
		System.out.println("Enter the Height value :");
		int h = sc.nextInt();
		if ((b <= 0) || (h <= 0)) {
			System.out.println("Both Breadth and height values must be positive.");
		} else {
			System.out.println("Multiplying of both Breadth and Height :" + b * h);
		}
		sc.close();
	}
}
