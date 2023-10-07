package com.Kamesh.projects.PractisingInheritance;

public class MultiLevelInheritance3 {
	public void result1() {
		System.out.println("Result 1");
	}
}

class Outcome2 extends MultiLevelInheritance {
	public void result2() {
		System.out.println("Result 2");
	}
}

class End2 extends Outcome2 {
	public void result3() {
		result1();
		result2();
		System.out.println("Result 3");
	}
}
