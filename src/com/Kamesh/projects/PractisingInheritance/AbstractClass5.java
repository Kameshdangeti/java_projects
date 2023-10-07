package com.Kamesh.projects.PractisingInheritance;

abstract public class AbstractClass5 {
	abstract public void work();
}

class Boss extends AbstractClass5 {
	public void work() {
		System.out.println("Is the Work done");
	}
}