package com.Kamesh.projects.PractisingJavaPrograms;

import java.util.BitSet;
import java.util.Scanner;

public class PrintingJavaBitWise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		BitSet[] bitSets = new BitSet[2];
		bitSets[0] = new BitSet(n);
		bitSets[1] = new BitSet(m);

		for (int i = 0; i < m; i++) {
			String operation = sc.next();
			int set1 = sc.nextInt();
			int set2 = sc.nextInt();
			switch (operation) {
			case "AND":
				bitSets[set1 - 1].and(bitSets[set2 - 1]);
				break;
			case "OR":
				bitSets[set1 - 1].or(bitSets[set2 - 1]);
				break;
			case "XOR":
				bitSets[set1 - 1].xor(bitSets[set2 - 1]);
				break;
			case "FLIP":
				bitSets[set1 - 1].flip(set2);
				break;
			case "SET":
				bitSets[set1 - 1].set(set2);
				break;

			}

			System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
		}
	}
}
