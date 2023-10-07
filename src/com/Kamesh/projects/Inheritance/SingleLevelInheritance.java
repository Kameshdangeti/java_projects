//Below we can see the code for the entire types of Inheritances i.e.,single-level,multi-level,Hierarchical,Multiple.
//And we know that in inheritance superclass and subclass are available.and in Inheritance Subclass can access
//properties of superclass directly.
//And the main method is called in another class i.e.,"SingleLevelInheritanceMain.java".

//Single-Level Inheritances.  
//Here single level is only possible i.e.,1 subclass extends Superclass.
package com.Kamesh.projects.Inheritance;

class SingleLevelInheritance {
	public void test() {
		System.out.println("Code Testing is done.");
	}
}

class Company extends SingleLevelInheritance {
	public void develop() {
		System.out.println("Code developing is done.");
	}
}
