package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

public class TerenaryConstructs2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		String res = ((x > y) && (x > z)) ? x + "is largest"
				: (y > z) && (y > x) ? y + "is largest" : z + " is largest";
		System.out.println(res);
	}
}
