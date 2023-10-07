package com.Kamesh.projects.PractisingInheritance;

interface ExtendableInterface4 {
	public void work();
}

interface Employee1 extends ExtendableInterface4 {
	public void Work1();
}

class Office1 implements Employee {
	public void work() {
		System.out.println("Employees work in office.");
	}

	public void Work1() {
		System.out.println("Employee can also work from home.");
	}
}
