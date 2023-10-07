package com.Kamesh.projects.PractisingOperatorsAndDecisionConstructors;

public class TerenaryConstructs5 {
	public static void main(String[] args) {
		int g = 40;
		int h = 80;
		int i = 30;
		String output = ((g > h) && (g > i)) ? g + "is largest"
				: (h > i) && (h > g) ? h + "is largest" : i + "is largest";
		System.out.println(output);
	}
}
