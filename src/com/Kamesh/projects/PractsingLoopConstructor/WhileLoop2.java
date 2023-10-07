package com.Kamesh.projects.PractsingLoopConstructor;

public class WhileLoop2 {
	public static void main(String[] args) {
		int n = 1537;
		int pro = 1;
		while (n != 0) {
			int ld = n % 10;
			pro = pro * ld;
			n = n / 10;
		}
		if (pro % 2 == 0) {
			System.out.println("Product of digit is even");
		} else {
			System.out.println("Product of digit is odd");
		}
	}
}
