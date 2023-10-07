//Below we can see the code for abstract class.
//And the main method of this code is written on "CreatingAbstractClassMAin.java".

package com.Kamesh.projects.Inheritance;

abstract public class CreatingAbstractClass {
	abstract public void work();
}

class Developer extends CreatingAbstractClass {
	public void work() {
		System.out.println("Work is done");
	}
}
