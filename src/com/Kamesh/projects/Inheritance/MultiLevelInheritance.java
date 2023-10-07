//Multi-level Inheritances.
//Here name insense says,there are muli-levels.That means there is 1 superclass,and 2 subclasses line by line.
//The first class is also called as super class.Because it acts as botha super and sub class.
//The below code Main method is written in seperate class i.e.,"MultiLevelInheritanceMain.java".
package com.Kamesh.projects.Inheritance;

public class MultiLevelInheritance {
	public void result1() {
		System.out.println("Result 1");
	}
}

class Outcome extends MultiLevelInheritance {
	public void result2() {
		System.out.println("Result 2");
	}
}

class End extends Outcome {
	public void result3() {
		result1();
		result2();
		System.out.println("Result 3");
	}
}
