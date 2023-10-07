package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

public class TerenaryConstructs3 {
	public static void main(String[] args) {
		int a = 30;
		int b = 90;
		int c = 60;
		String result = ((a > b) && (a > c)) ? a + "is largest"
				: (b > c) && (b > a) ? b + "is largest" : c + "is largest";
		System.out.println(result);
	}
}
