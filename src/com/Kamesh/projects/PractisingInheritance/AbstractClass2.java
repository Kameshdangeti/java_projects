package com.Kamesh.projects.PractisingInheritance;

abstract public class AbstractClass2 {
	abstract public void work();
}

class Developer extends AbstractClass2 {
	public void work() {
		System.out.println("Work is done");
	}
}