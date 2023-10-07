package com.Kamesh.projects.PractisingInheritance;

public class MultiLevelInheritance5 {
	public void result1() {
		System.out.println("Result 1");
	}
}

class Outcome4 extends MultiLevelInheritance {
	public void result2() {
		System.out.println("Result 2");
	}
}

class End4 extends Outcome4 {
	public void result3() {
		result1();
		result2();
		System.out.println("Result 3");
	}
}
