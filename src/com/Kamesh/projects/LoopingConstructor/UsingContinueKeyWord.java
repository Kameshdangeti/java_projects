//Below we can see te code for Use of  Continue.
//And the continue is used to skip the iteration of the loop.
package com.Kamesh.projects.LoopingConstructor;

public class UsingContinueKeyWord {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				if (i == 3 && j == 3) {
					continue; // Continue Statement.
				}
				System.out.println("The Continue values of i :" + i);
				System.out.println("The Continue value of j :" + j);
			}
		}
	}
}
