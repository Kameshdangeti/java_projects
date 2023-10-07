//Below we can see the main methode for "CreatingAbstractClass.java".
package com.Kamesh.projects.Inheritance;

public class CreatingAbstractClassMain {
	public static void main(String[] args) {
		Developer d = new Developer();
		d.work();
		CreatingAbstractClass tl = (CreatingAbstractClass) new Developer();
		tl.work();
	}
}
