//Hierarchical Inheritance.
//Here this is similar to multi-level.But slight difference is here subclasses will not one by one.
//it will be side to side.so,in this inheritance also there are 2 subclasses and 1 superclass.
//for below code main method is called in seperate class i.e., "HierarchicalInheritanceMain.java".
package com.Kamesh.projects.Inheritance;

public class HierarchicalInheritance {
	public void demo1() {
		System.out.println("Demo1");
	}
}

class G extends HierarchicalInheritance {
	public void demo2() {
		demo1();
		System.out.println("Demo2");
	}
}

class H extends HierarchicalInheritance {
	public void demo3() {
		demo1();
		System.out.println("Demo3");
	}
}
